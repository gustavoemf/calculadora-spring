package com.example.caluladoraDesafio;

import com.example.caluladoraDesafio.config.Calcular;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class CaluladoraDesafioApplicationTests {
	List<Double> valores = new ArrayList<>();
	private double desvio;

	@BeforeEach
	void gerarLista(){
		valores = Arrays.asList(
				20.0, 21.0, 22.0, 23.0, 24.0, 25.0, 26.0, 27.0, 28.0, 29.0,
				30.0, 31.0, 32.0, 33.0, 34.0, 35.0, 36.0, 37.0, 38.0, 39.0, 40.0
		);
		desvio = 0.001;
	}
	@Test
	public void testSoma(){
		double esperado = 630.0; // Soma dos valores
		double resultado;
		resultado = Calcular.somar(valores);
		Assert.assertEquals(esperado, resultado, desvio);
	}
	@Test
	public void testValorMax(){
		double esperado = 40.0; // Maior valor na lista
		double resultado = Collections.max(valores);
		Assert.assertEquals(esperado, resultado, desvio);
	}
	@Test
	public void testValorMin(){
		double esperado = 20.0; // Menor valor na lista
		double resultado = Collections.min(valores);
		Assert.assertEquals(esperado, resultado, desvio);
	}
}