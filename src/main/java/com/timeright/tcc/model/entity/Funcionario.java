package com.timeright.tcc.model.entity;

import jakarta.persistence.*;
import com.timeright.tcc.model.entity.Servico;

@Entity

public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(length = 5, nullable = false)
        private String nome;
        @Column(length = 50, nullable = false)
        private String servico;
        @Column(length = 100, nullable = true)
        private String codStatus;
        @Column(length = 20, nullable = false)


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getcodStatus() {
        return codStatus;
    }

    public void setcodStatus(String codStatus) {
        this.codStatus = codStatus;
    }

}
