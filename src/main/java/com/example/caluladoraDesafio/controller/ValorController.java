package com.example.caluladoraDesafio.controller;

import com.desafio.DesafioSpringBoot.dto.Valor;
import com.desafio.DesafioSpringBoot.service.ValorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/valor")
public class ValorController {
    @Autowired
    private ValorService valorService;
    private List<Double> valoresGuardados;

    @PostMapping
    public ResponseEntity<?> calcular(@RequestBody final Valor valorDto) {
        try {
            valorService.calcular(valorDto.getValor());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro " + e.getMessage());
        }
        return ResponseEntity.ok(valorService.calcular(valorDto.getValor()));
    }
}