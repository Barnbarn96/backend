package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dto.EmailDetails;

public interface EmailService {
    String sendSimpleMail(EmailDetails emailDetails);
}
