package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Ibkdata;

import java.util.List;

@Repository
public interface IbkdataRepository extends JpaRepository<Ibkdata, Integer> {

}