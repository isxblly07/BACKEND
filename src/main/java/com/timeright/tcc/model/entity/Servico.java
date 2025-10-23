package com.timeright.tcc.model.entity;

import javax.persistence.*;

@Entity

public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO-INCREMENTO SEQUÊNCIAL 1 e 1
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 100, nullable = false)
    private String descricao;
    @Column(length = 300, nullable = true)
    private double duracao;
    @Column(length = 3, nullable = false)
    private String codStatus;
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

    public String getCodStatus() { return codStatus; }

    public void setCodStatus(String codStatus) { this.codStatus = codStatus; }

}