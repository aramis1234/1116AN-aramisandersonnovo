package com.fernandes.contrato.contrato_service.vo;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NivelCombustivelInicial {
    private String nivel;
}
