package com.example.itauChallenge.controller;

import com.example.itauChallenge.entity.Estatisticas;
import com.example.itauChallenge.entity.Transacao;
import com.example.itauChallenge.service.CreateEstatistica;
import com.example.itauChallenge.service.VerificacaoPadrao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;
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
        data.setCreatedDate(OffsetDateTime.now());
        db.add(data);
        return new ResponseEntity<>("",HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/transacao")
    public ResponseEntity<String> Delete(){
        db.clear();
        return new ResponseEntity<>("",HttpStatus.OK);
    }

    @GetMapping(value = "/estatistica")
    public Estatisticas GetEstatistica(){
        Estatisticas response = new Estatisticas();
        CreateEstatistica CE = new CreateEstatistica();
        response = CE.CreateEstatisticaDTO(db);
        return response;


    }


}

