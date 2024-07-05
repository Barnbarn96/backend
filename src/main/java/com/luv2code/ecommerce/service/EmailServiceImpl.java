package com.luv2code.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.luv2code.ecommerce.dto.EmailDetails;

@Service
public class EmailServiceImpl implements  EmailService{

    @Autowired 
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}") 
    private String sender;

    @Override
    public String sendSimpleMail(EmailDetails emailDetails)
    {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            
            String subject = "Purchase from barnbarn";
            String msgBody = "Dear " + emailDetails.getFirstName() + " " + emailDetails.getLastName() + ", \nYou've made a purchase of amount: $" + emailDetails.getAmount() + ". Your order tracking number is: " + emailDetails.getTrackingNo() + "." ;
            
            mailMessage.setFrom(sender);
            mailMessage.setTo(emailDetails.getRecipient());
            mailMessage.setText(msgBody);
            mailMessage.setSubject(subject);

            // Sending the mail
            javaMailSender.send(mailMessage);
            return "Mail Sent Successfully...";
        }
 
        // Catch block to handle the exceptions
        catch (Exception e) {
            return "Error while Sending Mail";
        }
    }
}
