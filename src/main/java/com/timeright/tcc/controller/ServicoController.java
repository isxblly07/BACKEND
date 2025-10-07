package com.timeright.tcc.controller;

import com.timeright.tcc.model.entity.Servicos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

public class ServicoController {

    @RestController
    @RequestMapping("api/v1/usuario")
    public class AgendamentoController {

        List<Servicos> servicoId = new ArrayList<Servicos>();

        @GetMapping
        public List<Servicos> findAll() {

            Servicos s1 = new Servicos();
            s1.setNome("Manicure: Alongamento");
            s1.setDescricao("Alongamento de unhas");
            s1.setDuracao(2.00);

            servicoId.add(s1);

            return servicoId;

        }
    }
}
