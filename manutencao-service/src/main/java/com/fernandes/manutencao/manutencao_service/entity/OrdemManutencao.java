package com.fernandes.manutencao.manutencao_service.entity;

import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fernandes.manutencao.manutencao_service.vo.CustoPrevisto;
import com.fernandes.manutencao.manutencao_service.vo.TipoManutencao;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdemManutencao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idVeiculo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String descricao;

    @Embedded
    private TipoManutencao tipoManutencao;

    @Embedded
    private CustoPrevisto custoPrevisto;
}
