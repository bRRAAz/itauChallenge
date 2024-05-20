package com.example.itauChallenge.entity;

public class Estatisticas {
    Long count;
    Double sum;
    Double average;
    Double min;
    Double max;

    public Estatisticas(Long count, Double sum, Double average, Double min, Double max) {
        this.count = count;
        this.sum = sum;
        this.average = average;
        this.min = min;
        this.max = max;
    }

    public Estatisticas() {
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }
}
