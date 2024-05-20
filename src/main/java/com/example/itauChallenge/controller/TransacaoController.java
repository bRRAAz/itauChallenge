package com.example.itauChallenge.controller;

import com.example.itauChallenge.entity.Transacao;
import com.example.itauChallenge.service.VerificacaoPadrao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class TransacaoController {

    //Guardar dados
    private List<Transacao> db = new ArrayList<>();

    //Criar uma transação
    @PostMapping(value = "/transacao")
    public ResponseEntity<String> Insert(@RequestBody Transacao data){
        VerificacaoPadrao verificacaoPadrao = new VerificacaoPadrao();
        //verificações
        boolean valueVerificacao = verificacaoPadrao.verificar(data);
        if (!valueVerificacao){
            return new ResponseEntity<>("", HttpStatus.UNPROCESSABLE_ENTITY);
        }
        //Salvar no "banco" e resposta da API
        db.add(data);
        return new ResponseEntity<>("",HttpStatus.CREATED);
    }



}

