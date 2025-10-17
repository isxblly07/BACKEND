package com.timeright.tcc.controller;

import com.timeright.tcc.services.FuncionarioService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = {"http://localhost:5173"})
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService usuarioService){ this.funcionarioService = usuarioService; }

}



