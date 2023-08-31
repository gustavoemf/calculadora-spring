package com.example.caluladoraDesafio;

import com.example.caluladoraDesafio.service.ValorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class CaluladoraDesafioApplicationTests {
	List<Double> valores = new ArrayList<>();
	private double desvio;

	@BeforeEach
	void gerarLista(){
		ValorService service = new ValorService();
		for (int i = 1; i <= 20; i++) {
			valores.add((double) i);
		}
		desvio = 0.001;
	}
	@Test
	public void testSoma(){
		double esperado = 210; // Soma dos valores
		double resultado = ValorService.somar(valores);
		Assertions.assertEquals(esperado, resultado, desvio);
	}
	@Test
	public void testValorMax(){
		double esperado = 20; // Maior valor na lista
		double resultado = Collections.max(valores);
		Assertions.assertEquals(esperado, resultado, desvio);
	}
	@Test
	public void testValorMin(){
		double esperado = 1; // Menor valor na lista
		double resultado = Collections.min(valores);
		Assertions.assertEquals(esperado, resultado, desvio);
	}
	@Test
	public void testMetodoMedia(){
		double esperado = 10.5; // Média dos valores
		double resultado = ValorService.media(valores);
		Assertions.assertEquals(esperado, resultado, desvio);
	}
	@Test
	public void testMetodoDesvioPadrao(){
		double esperado = 5.766281297335398; // Desvio padrão dos valores
		double resultado = ValorService.desvioPadrao(valores);
		Assertions.assertEquals(esperado, resultado, desvio);
	}
	@Test
	public void testMetodoMediana(){
		double esperado = 10.5; // Mediana dos valores
		double resultado = ValorService.mediana(valores);
		Assertions.assertEquals(esperado, resultado, desvio);
	}
}