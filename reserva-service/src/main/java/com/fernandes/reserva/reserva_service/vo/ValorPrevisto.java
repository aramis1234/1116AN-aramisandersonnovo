package com.fernandes.reserva.reserva_service.vo;

import java.math.BigDecimal;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValorPrevisto {
    private BigDecimal valor;
    private String moeda;
}
