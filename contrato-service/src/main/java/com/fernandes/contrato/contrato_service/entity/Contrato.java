package com.fernandes.contrato.contrato_service.entity;

import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fernandes.contrato.contrato_service.vo.QuilometragemInicial;
import com.fernandes.contrato.contrato_service.vo.NivelCombustivelInicial;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idReserva;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    @Embedded
    private QuilometragemInicial quilometragemInicial;

    @Embedded
    private NivelCombustivelInicial nivelCombustivelInicial;
}
