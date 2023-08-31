package com.example.caluladoraDesafio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Valor {
    private List<Double> valor = new ArrayList<>();
}
