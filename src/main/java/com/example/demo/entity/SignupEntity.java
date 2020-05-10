package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "MEMBER_INFORMATION")
@Data
public class SignupEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "email_address")
    private String emailAddress;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
	@Column(name = "password")
    private String password;	

    @Override
    public String toString() {
        return "SignupEntity [id=" + id + ", emailAddress=" + emailAddress + "]";
    }
	
	
}