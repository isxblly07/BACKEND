package com.timeright.tcc.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 100, nullable = false)
    private String senha;
    @Column(length = 10, nullable = false)
    private LocalDate dataCadastro;
    @Column(length = 30, nullable = false)
    private String codStatus;
    @Column(length = 100, nullable = false)

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }



    public void setCodStatus(String codStatus) {
        this.codStatus = codStatus;
    }

    public String getCodStatus() {
        return codStatus;
    }
}