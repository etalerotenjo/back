package com.example.demo.controller.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.controller.service.dto.Cliente;
import com.example.demo.controller.service.interfaces.ClienteService;
import com.example.demo.persistence.repository.RepositoryCliente;
import org.modelmapper.ModelMapper;

@Service
public class ClienteImpl implements ClienteService {

    @Autowired
    RepositoryCliente repositoryCliente;

    @Override
    public boolean saveCustomer(Cliente cliente)  {

        ModelMapper modelMapper = new ModelMapper();
        com.example.demo.persistence.entity.Cliente clienteBd = modelMapper.map(cliente, com.example.demo.persistence.entity.Cliente.class);
        repositoryCliente.save(clienteBd);
        return true;
    }
}
