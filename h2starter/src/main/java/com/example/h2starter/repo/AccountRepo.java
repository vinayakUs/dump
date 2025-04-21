package com.example.h2starter.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.h2starter.entity.Account;

public interface AccountRepo extends JpaRepository<Account,Long>{

    
}