package com.example.bill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bill.model.Electricity;

public interface ElectricityRepo extends JpaRepository<Electricity, Long>{

}
