package com.fernandes.relatorio.relatorio_service.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fernandes.relatorio.relatorio_service.vo.Periodo;
import com.fernandes.relatorio.relatorio_service.vo.TipoRelatorio;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Embedded
    private Periodo periodo;

    @Embedded
    private TipoRelatorio tipoRelatorio;

    private String dados; // JSON or other format
}
