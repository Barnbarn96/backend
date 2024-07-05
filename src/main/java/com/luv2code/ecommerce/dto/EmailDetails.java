package com.luv2code.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {
     private String recipient;
     // private String msgBody;
     // private String subject;
     private String attachment;
     private String firstName;
     private String lastName;
     private String trackingNo;
     private float amount;
}
