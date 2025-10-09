package com.timeright.tcc.services;

import com.timeright.tcc.model.entity.Funcionario;
import com.timeright.tcc.model.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

    @Service
    public class FuncionarioService {

        @Autowired  // Injeção de dependência automática
        private FuncionarioRepository funcionarioRepository;


        // Método responsável em listar todos os serviços cadastrados no banco de dados

        public List<Funcionario> findAll() {
            return funcionarioRepository.findAll();
        }

        // Método responsável em CRIAR o SERVIÇO no banco de dados

        public Funcionario salvarFuncionario(@RequestBody Funcionario funcionario) {
            funcionario.setcodStatus("ATIVO");
            return funcionarioRepository.save(funcionario);
        }

    }


