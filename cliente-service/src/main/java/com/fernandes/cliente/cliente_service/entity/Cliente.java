package com.fernandes.cliente.cliente_service.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fernandes.cliente.cliente_service.vo.Contato;
import com.fernandes.cliente.cliente_service.vo.Documento;
import com.fernandes.cliente.cliente_service.vo.Endereco;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Embedded
    private Documento documento;

    @Embedded
    private Endereco endereco;

    @Embedded
    private Contato contato;
}
