package com.app.mpadmin.web.domain;

import com.app.mpadmin.domain.Editor;
import com.app.mpadmin.web.util.MessageUtil;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: miti
 * Date: 11/10/12
 * Time: 11:22 PM
 * To change this template use File | Settings | File Templates.
 */
@Named
@Singleton
public class EditorController {
    private static final long serialVersionUID = 1L;

    @Inject
    private MessageUtil messageUtil;

    public Editor newIfNull(Editor editor) {
            if (editor != null) {
                return editor;
            }

            return new Editor();
        }

    public void sendMail(Editor editor)
           {
               final String from= "no-reply@motrpart.in";
               final String subject = editor.getSubject();
               final String content= editor.getValue() ;
               final List<String> mailTo= new ArrayList<String>();//= editor.getEmail();
               mailTo.add("smriti3008@gmail.com");
               mailTo.add("smriti.agarwal@motrpart.com");
               for(String to: mailTo)
               {
               try
                 {
                    messageUtil.info("status_saved_ok","Trying to send mail");
                   sendMail(from,subject,content,to,true);
                 }
               catch (Exception e){
                   e.printStackTrace();
                 }
               }

           }
    public void sendMail(final String from, final String subject, final String content, final String mailTo, final boolean isHtml) throws Exception
       {
           new Thread((new Runnable() {
           public void run()
           {
           Session session;
            try {

                //Set the host smtp address
                String to = mailTo;
                Properties props = new Properties();
                props.setProperty("mail.transport.protocol", "smtps");
                props.setProperty("mail.smtps.host", "smtp.gmail.com");
                props.put("mail.smtps.auth", "true");
                session = Session.getDefaultInstance(props, null);
                    MimeMessage msg = new MimeMessage(session);
                    javax.mail.Address[] address={new InternetAddress(from)};
                    try
                    {
                        if(null==to) {
                            to="contact@motrpart.in";
                        }
                        messageUtil.info("status_saved_ok","Trying to send mail with subject="+subject+"body "+content);
                        //String bcc= ServerProperties.getInstance().getApplicationProperty(Constants.SEND_QUOTE_TO_ADDRESS);
                        msg.addRecipients(javax.mail.Message.RecipientType.TO,to);
                        //msg.addRecipients(javax.mail.Message.RecipientType.BCC,bcc);
                        msg.setSubject(subject);
                        msg.addFrom(address);
                        if(isHtml) {
                            msg.setContent(content,"text/html");
                        } else {
                            msg.setText(content);
                        }
                        Transport transport = session.getTransport("smtps");
                        transport.connect("smtp.gmail.com", 465,"no-reply@motrpart.in", "motrpart@aas");
                        transport.sendMessage(msg,msg.getAllRecipients());
                        transport.close();
                        messageUtil.info("status_saved_ok","Mail sent to "+to);
                    }
                    catch (MessagingException e)
                    {
                      //  logger.error("Messaging exception in messaging in emailUtil",e);
                    }
                } catch (Exception e) {
                  //  logger.error("Exception in messaging in emailUtil",e);
                }
           }
       }), "").start();

       }
}
