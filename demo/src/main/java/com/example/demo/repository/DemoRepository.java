package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Demo;

public interface DemoRepository extends JpaRepository<Demo, Long>{

}
