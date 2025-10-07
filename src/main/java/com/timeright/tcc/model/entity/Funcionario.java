package com.timeright.tcc.model.entity;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class Funcionario {

        private Long id;
        @Column(length = 5, nullable = false)
        private String nome;
        @Column(length = 50, nullable = false)
        private String observacoes;
        @Column(length = 100, nullable = false)
        private String statusFuncionario;
        private String statusServico;

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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getStatusFuncionario() {
        return statusFuncionario;
    }

    public void setStatusFuncionario(String statusFuncionario) {
        this.statusFuncionario = statusFuncionario;
    }

    public String getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }
}
