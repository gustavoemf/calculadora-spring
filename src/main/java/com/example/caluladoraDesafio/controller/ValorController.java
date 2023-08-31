package com.example.caluladoraDesafio.controller;

import com.example.caluladoraDesafio.dto.Valor;
import com.example.caluladoraDesafio.service.ValorService;
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
    private ValorService service;
    private List<Double> valoresGuardados;

    @PostMapping
    public ResponseEntity<?> calcular(@RequestBody final Valor dto) {
        try {
            service.calcular(dto.getValor());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro " + e.getMessage());
        }
        return ResponseEntity.ok(service.calcular(dto.getValor()));
    }
}