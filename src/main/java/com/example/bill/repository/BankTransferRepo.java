package com.example.bill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bill.model.BankTransfer;

public interface BankTransferRepo extends JpaRepository<BankTransfer, Long>{

}
