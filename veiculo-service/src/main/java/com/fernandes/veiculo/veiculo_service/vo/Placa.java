package com.fernandes.veiculo.veiculo_service.vo;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Placa {
    private String numero;
    private String cidade;
    private String estado;
}
