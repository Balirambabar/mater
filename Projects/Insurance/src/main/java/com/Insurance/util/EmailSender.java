package com.Insurance.util;


import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class EmailSender {

    @Autowired
    private JavaMailSender mailSender;
    public boolean sendMail(String to, String subject, String content, File f) throws Exception
    {
         MimeMessage message = mailSender.createMimeMessage();
         MimeMessageHelper helper = new MimeMessageHelper(message, true);
         helper.setTo(to);
         helper.setSubject(subject);
             helper.setText(content, true);
             helper.addAttachment("PlansInfo", f);
        mailSender.send(message);
        return true;

    }
}
