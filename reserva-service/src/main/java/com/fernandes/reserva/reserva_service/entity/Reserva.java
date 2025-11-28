package com.fernandes.reserva.reserva_service.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fernandes.reserva.reserva_service.vo.Periodo;
import com.fernandes.reserva.reserva_service.vo.ValorPrevisto;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idCliente;
    private Long idVeiculo;

    @Embedded
    private Periodo periodo;

    @Embedded
    private ValorPrevisto valorPrevisto;

    private String status;
}
