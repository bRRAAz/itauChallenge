package com.example.itauChallenge.entity;


import java.time.OffsetDateTime;


public class Transacao {
    Float valor;
    OffsetDateTime dataHora;
    public Transacao(Float valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }
    public Transacao(){

    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
