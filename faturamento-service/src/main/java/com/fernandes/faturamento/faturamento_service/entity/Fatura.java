package com.fernandes.faturamento.faturamento_service.entity;

import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fernandes.faturamento.faturamento_service.vo.Valor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idContrato;
    private LocalDate dataVencimento;

    @Embedded
    private Valor valor;

    private boolean paga;
}
