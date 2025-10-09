package com.timeright.tcc.controller;

import com.timeright.tcc.model.entity.Servico;
import com.timeright.tcc.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping
public class ServicoController {

     @Autowired
    private ServicoService servicoService;

     @GetMapping
    public ResponseEntity<List<Servico>> listarTodos() {

         return ResponseEntity.ok(servicoService.findAll());

        }

        // @RequestBody : Corpo da Requisição ( Recebendo um objeto JSON )
        // ResponseEntity: Toda resposta HTTP (status, cabeçalhos e corpo), aqui temos mais controle sobre o que é devolvido pro cliente
        // 1. Status HTTP: (200 ok, 201 CREATED, 404 NOT FOUND etc...)
        // 2. Headers: ( cabeçalhos extras, como location, Authorization etc...)
        // 3. Body: ( o objeto que será convertido em JSON/XML para o cliente )

     @PostMapping
    public ResponseEntity<Servico> cadastrar(@RequestBody final Servico servico) {

         Servico novo = servicoService.salvarServico(servico);
         return ResponseEntity.status(HttpStatus.CREATED).body(novo);
     }
    }
