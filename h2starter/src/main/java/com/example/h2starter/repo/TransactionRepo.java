package com.example.h2starter.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.transaction.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction,Long>{

    
}