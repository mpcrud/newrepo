/*
 * (c) Copyright 2005-2012 JAXIO, www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to use Celerio within your company? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Template pack-jsf2-primefaces:src/main/java/domain/Controller.e.vm.java
 */
package com.app.mpadmin.web.domain;

import static com.app.mpadmin.web.util.PrimeFacesUtil.forceClose;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.app.mpadmin.domain.TdPicture;
import com.app.mpadmin.repository.TdPictureRepository;
import com.app.mpadmin.web.converter.domain.TdPictureConverter;
import com.app.mpadmin.web.util.MessageUtil;
import com.app.mpadmin.web.util.FileUploadController;
import org.primefaces.model.UploadedFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Thin controller layer allowing you to do business validation and other conditional 
 * checks that are easier to implement in Java than in webflow's xml syntax.
 */
@Named
@Singleton
public class TdPictureController {
    private static final long serialVersionUID = 1L;

    @Inject
    private TdPictureRepository tdPictureRepository;

    @Inject
    private MessageUtil messageUtil;

    @Inject
    private TdPictureConverter tdPictureConverter;

    public TdPicture newIfNull(TdPicture tdPicture) {
        if (tdPicture != null) {
            return tdPicture;
        }

        return tdPictureRepository.getNewWithDefaults();
    }

    public boolean save(TdPicture tdPicture) {
        tdPictureRepository.save(tdPicture);
        messageUtil.info("status_saved_ok", tdPictureConverter.print(tdPicture));
        return true;
    }

    public boolean saveAndClose(TdPicture tdPicture) {
        UploadedFile file = tdPicture.getFile();
        //tdPicture.setFile(fileUploadController.getFile());
        tdPicture.setPictureName(file.getFileName());
        try{
            InputStream inputStream = null;
            OutputStream outputStream = null;
            if (file.getSize() > 0) {
            inputStream = file.getInputstream();
            outputStream = new FileOutputStream("C:/"+file.getFileName());
            int readBytes = 0;
            byte[] buffer = new byte[8192];
            while ((readBytes = inputStream.read(buffer, 0 , 8192))!=-1){
                outputStream.write(buffer, 0, readBytes);
                }
            }
             outputStream.close();
             inputStream.close();

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        tdPictureRepository.save(tdPicture);
        messageUtil.infoDelayed("status_saved_ok", tdPictureConverter.print(tdPicture));
        forceClose();
        return true;
    }

    public boolean delete(TdPicture tdPicture) {
        String infoArg = tdPictureConverter.print(tdPicture);
        tdPictureRepository.delete(tdPicture);
        messageUtil.info("status_deleted_ok", infoArg);
        return true;
    }


}