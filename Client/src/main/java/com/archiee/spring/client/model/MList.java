package com.archiee.spring.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class MList {

    //private long sno;
    
    //private long accno;
    private String firstName;
    private String lastName;
    private String gender;
    private long aadharCard;
    private long panCard;
    private String accountType;
    //private long balance;
    private long contactNo;
    
    
    private byte[] image;

}
