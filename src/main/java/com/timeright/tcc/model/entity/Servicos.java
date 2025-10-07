package com.timeright.tcc.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Serviço")

public class Servicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO-INCREMENTO SEQUÊNCIAL 1 e 1
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 100, nullable = false)
    private String descricao;
    @Column(length = 300, nullable = false)
    private double duracao;
    @Column(length = 20, nullable = false)
    private boolean statusServico;
    @Column(length = 20, nullable = false)

    public Long getId() {
        return id;
    }

    public void setId(Long servicoId) {
        this.id = servicoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public boolean isStatusServico() {
        return statusServico;
    }

    public void setStatusServico(boolean statusServico) {
        this.statusServico = statusServico;
    }


}