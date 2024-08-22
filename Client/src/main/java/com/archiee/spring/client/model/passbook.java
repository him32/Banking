package com.archiee.spring.client.model;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class passbook {

 
//private long sno;

private String tranType;

 
 private Date date;

 private String nature;
 
 private long amt;
 private long accno;

}
