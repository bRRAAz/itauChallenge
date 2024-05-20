package com.example.itauChallenge.service;

import com.example.itauChallenge.entity.Estatisticas;
import com.example.itauChallenge.entity.Transacao;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;

public class CreateEstatistica {
    Double sum = 0.0;
    public CreateEstatistica() {
    }

    public Estatisticas CreateEstatisticaDTO(List<Transacao> data){
        List<Double> Listvalor = data.stream().filter(Transacao -> Transacao.getCreatedDate().isAfter(OffsetDateTime.now().minusMinutes(1))).map(Transacao::getValor).toList();
        DoubleSummaryStatistics stats = Listvalor.stream().mapToDouble((x) -> x).summaryStatistics();
        if(Listvalor.size() == 0){
            Estatisticas estatistica = new Estatisticas();
            estatistica.setCount(0L);
            estatistica.setAverage(0.0);
            estatistica.setSum(0.0);
            estatistica.setMax(0.0);
            estatistica.setMin(0.0);
            return estatistica;
        }

        Listvalor.forEach(element-> sum+=element );
        Estatisticas estatistica = new Estatisticas();
        estatistica.setCount(stats.getCount());
        estatistica.setAverage(stats.getAverage());
        estatistica.setSum(stats.getSum());
        estatistica.setMax(stats.getMax());
        estatistica.setMin(stats.getMin());
        return estatistica;
    }

}
