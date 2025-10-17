package com.timeright.tcc.services;

import com.timeright.tcc.model.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoService {

    @Autowired  // Injeção de dependência automática
    private ServicoRepository servicoRepository;

}

