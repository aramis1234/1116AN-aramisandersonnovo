package com.fernandes.manutencao.manutencao_service.vo;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoManutencao {
    private String tipo;
}
