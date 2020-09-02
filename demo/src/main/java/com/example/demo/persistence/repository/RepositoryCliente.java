package com.example.demo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.persistence.entity.Cliente;

import java.io.Serializable;

public interface RepositoryCliente extends JpaRepository<Cliente, Serializable> {


}
