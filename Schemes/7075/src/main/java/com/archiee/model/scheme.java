package com.archiee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class scheme {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long sno;
  private String sname;
  @Lob
  private String sdetails;
  private String surl;
}
