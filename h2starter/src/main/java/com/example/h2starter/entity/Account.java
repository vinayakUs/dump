package com.example.h2starter.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Accounts")
public class Account {

    @Id
    @Column(name = "ACC_ID")
    private Long id;

    @Column(name = "Account Name")
    private String Account_Name;

    @Column(name = "BAL")
    private BigDecimal Balance;

    @Column(name = "EMAIL")
    private String Email;
    
}
