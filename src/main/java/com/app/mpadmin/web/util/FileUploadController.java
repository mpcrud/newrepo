package com.app.mpadmin.web.util;

/**
 * Created with IntelliJ IDEA.
 * User: miti
 * Date: 11/8/12
 * Time: 12:51 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.app.mpadmin.domain.TdPicture;
import com.app.mpadmin.repository.TdPictureRepository;
import com.app.mpadmin.web.converter.domain.TdPictureConverter;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.context.RequestContext;

//@ManagedBean(name="fileUploadController")
//@RequestScoped
@Named
@Singleton
public class FileUploadController {

    @Inject
    private TdPictureRepository tdPictureRepository;

    @Inject
    private MessageUtil messageUtil;

    @Inject
    private TdPictureConverter tdPictureConverter;


    private InputStream in;

    //private boolean isUploaded = false;
    public void upload(FileUploadEvent event) throws IOException{
        FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, msg);

        // Do what you want with the file
        try {
           // copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
            in = event.getFile().getInputstream();

            } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void copyFile(TdPicture tdPicture) {
           try {

                String fileName=tdPicture.getPictureName();
                String destination=tdPicture.getPicturePath();//"C:/Geo/";
               // write the inputStream to a FileOutputStream
               tdPicture.setPictureLongDesc(tdPicture.getPictureName());
               tdPicture.setPictureShortDesc(tdPicture.getPictureName());
               OutputStream out = new FileOutputStream(new File(destination + fileName));

                int read = 0;
                byte[] bytes = new byte[1024];

                while ((read = in.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }

                in.close();
                out.flush();
                out.close();
                System.out.println("New file created!");
                tdPictureRepository.save(tdPicture);
                messageUtil.info("status_saved_ok", tdPictureConverter.print(tdPicture));

                } catch (IOException e) {
                messageUtil.error(e);
                System.out.println(e.getMessage());

                }
    }


}