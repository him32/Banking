package com.archiee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="MASTER_LIST")
public class MList {

    private long sno;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accno;
    private String firstName;
    private String lastName;
    private String gender;
    private long aadharCard;
    private long panCard;
    private String accountType;
    private long balance;
    private long contactNo;
    @Lob
    @Column(name = "image", nullable = false)
    private byte[] image;

}
