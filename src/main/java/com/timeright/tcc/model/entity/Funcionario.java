package com.timeright.tcc.model.entity;

import javax.persistence.*;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 100, nullable = false)
    private String nome;
    
    @Column(length = 50, nullable = false)
    private String servico;
    
    @Column(length = 3, nullable = false)
    private String codStatus;

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

    public String getCodStatus() {
        return codStatus;
    }

    public void setCodStatus(String codStatus) {
        this.codStatus = codStatus;
    }
}