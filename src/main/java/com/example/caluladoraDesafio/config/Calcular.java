package com.example.caluladoraDesafio.config;

import java.util.List;

public class Calcular {
    public static double media(List<Double> valores){
        if (valores.isEmpty()) {
            throw new IllegalArgumentException("A lista de valores não pode estar vazia.");
        }
        double total = 0;

        //Para cada valor dentro de valores, soma-o ao total
        for (Double valor: valores) {
            total += valor;
        }

        return total / valores.size();
    }
    public static double desvioPadrao(List<Double> valores){
        if (valores.isEmpty()) {
            throw new IllegalArgumentException("A lista de valores não pode estar vazia.");
        }
        //Faz o cálculo da média
        double media = media(valores);

        double somaDosQuadradosDasDiferencas = 0.0;
        for (double valor : valores) {
            double diferenca = valor - media;
            somaDosQuadradosDasDiferencas += diferenca * diferenca;
        }

        double variancia = somaDosQuadradosDasDiferencas / (valores.size() - 1);
        return Math.sqrt(variancia);
    }
}
