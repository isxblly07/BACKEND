package com.timeright.tcc.controller;

import com.timeright.tcc.model.entity.Servico;
import com.timeright.tcc.services.ServicoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = {"http://localhost:5173"})
public class ServicoController {

    private final ServicoService servicoService;

    public ServicoController(ServicoService servicoService){ this.servicoService = servicoService; }

    }



