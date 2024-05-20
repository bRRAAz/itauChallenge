package com.example.itauChallenge.service;

import com.example.itauChallenge.entity.Transacao;
import java.time.OffsetDateTime;

public class VerificacaoPadrao {
    public VerificacaoPadrao(){
    }

    public boolean verificar(Transacao data){
        // Verificar se tem campo vazio
        if( data.getValor() == null|| data.getDataHora() == null){
            return false;
        }
        //Verificar se a data está no passado e valor maior que 0
        if (data.getDataHora().isAfter(OffsetDateTime.now()) || data.getValor() < 0) {
            return false;
        }
        return true;
    }
}
