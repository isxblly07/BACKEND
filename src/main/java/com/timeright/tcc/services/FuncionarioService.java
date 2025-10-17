package com.timeright.tcc.services;

import com.timeright.tcc.model.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired  // Injeção de dependência automática
    private FuncionarioRepository funcionarioRepository;


    }





