package com.example.itauChallenge.entity;


import java.time.OffsetDateTime;


public class Transacao {
    Double valor;
    OffsetDateTime dataHora;
    OffsetDateTime createdDate;
    public Transacao(Double valor, OffsetDateTime dataHora, OffsetDateTime createdDate) {
        this.valor = valor;
        this.dataHora = dataHora;
        this.createdDate = createdDate;
    }
    public Transacao(){

    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
