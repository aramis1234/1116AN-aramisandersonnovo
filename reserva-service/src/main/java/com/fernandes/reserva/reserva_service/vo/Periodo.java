package com.fernandes.reserva.reserva_service.vo;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Periodo {
    private LocalDate dataInicio;
    private LocalDate dataFim;
}
