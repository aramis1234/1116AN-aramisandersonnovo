package com.fernandes.veiculo.veiculo_service.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fernandes.veiculo.veiculo_service.vo.Categoria;
import com.fernandes.veiculo.veiculo_service.vo.Placa;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private int ano;

    @Embedded
    private Categoria categoria;

    @Embedded
    private Placa placa;

    private boolean disponivel;
}
