package com.fernandes.faturamento.faturamento_service.vo;

import java.math.BigDecimal;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Valor {
    private BigDecimal valor;
    private String moeda;
}
