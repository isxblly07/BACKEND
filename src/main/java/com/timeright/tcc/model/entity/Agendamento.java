package com.timeright.tcc.model.entity;

import jakarta.persistence.Column;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {

    private Long id;
    @Column(length = 5, nullable = false)
    private Long clienteId;
    @Column(length = 5, nullable = false)
    private Long funcionarioId;
    @Column(length = 5, nullable = false)
    private Long servicoId;
    @Column(length = 5, nullable = false)
    private LocalDate dataAgendada;
    @Column(length = 8, nullable = false)
    private LocalTime horaAgendada;
    @Column(length = 4, nullable = false)
    private String observacoes;
    @Column(length = 225, nullable = false)
    private boolean statusAgendamento;
    @Column(length = 20, nullable = false)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Long funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public Long getServicoId() {
        return servicoId;
    }

    public void setServicoId(Long servicoId) {
        this.servicoId = servicoId;
    }

    public LocalDate getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(LocalDate dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public LocalTime getHoraAgendada() {
        return horaAgendada;
    }

    public void setHoraAgendada(LocalTime horaAgendada) {
        this.horaAgendada = horaAgendada;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public boolean isStatusAgendamento() {
        return statusAgendamento;
    }

    public void setStatusAgendamento(boolean statusAgendamento) {
        this.statusAgendamento = statusAgendamento;
    }
}
