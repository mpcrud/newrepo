package com.app.mpadmin.web.domain;

import com.app.mpadmin.domain.Editor;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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

    public Editor newIfNull(Editor editor) {
            if (editor != null) {
                return editor;
            }

            return new Editor();
        }

    public void sendMail(Editor editor) throws Exception
           {
               final String from= "no-reply@motrpart.in";
               final String subject = editor.getSubject();
               final String content= editor.getValue() ;
               final String mailTo= editor.getEmail();
               final boolean isHtml=true;
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
                        }
                        catch (MessagingException e)
                        {
                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
               }
           }), "").start();

           }
}
