package com.archiee.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class passbook {

 @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long sno;

private String tranType;

 @Temporal(TemporalType.TIMESTAMP)
 private Date date;

 private String nature;
 
 private long amt;
 private long accno;

}
