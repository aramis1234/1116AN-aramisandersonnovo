package com.fernandes.manutencao.manutencao_service.vo;

import java.math.BigDecimal;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustoPrevisto {
    private BigDecimal valor;
    private String moeda;
}
