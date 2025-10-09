package com.timeright.tcc.services;

import com.timeright.tcc.model.entity.Servico;
import com.timeright.tcc.model.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ServicoService {

    @Autowired  // Injeção de dependência automática
    private ServicoRepository servicoRepository;


    // Método responsável em listar todos os serviços cadastrados no banco de dados

    public List<Servico> findAll() {
       return servicoRepository.findAll();
    }

    // Método responsável em CRIAR o SERVIÇO no banco de dados

    public Servico salvarServico(@RequestBody Servico servico) {
        servico.setCodStatus("ATIVO");
        return servicoRepository.save(servico);
    }



}
