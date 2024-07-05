package com.luv2code.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.ecommerce.dto.EmailDetails;
import com.luv2code.ecommerce.service.EmailService;

@RestController
@RequestMapping("/api/")
public class EmailController {
    
    @Autowired 
    private EmailService emailService;
    
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails details)
    {
        return emailService.sendSimpleMail(details);
    }
}
