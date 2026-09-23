package com.projetos.clientesApi.domain.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "enderecos")
public class Endereco {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private UUID id;

    @Column(name = "logradouro", length = 100, nullable = false)
    private String logradouro;

    @Column(name = "complemento", length = 100, nullable = false)
    private String complemento;

    @Column(name = "numero", length = 10, nullable = false)
    private String numero;

    @Column(name = "bairro", length = 150, nullable = false)
    private String bairro;

    @Column(name = "cidade", length = 150, nullable = false)
    private String cidade;

    @Column(name = "uf", length = 2, nullable = false)
    private String uf;

    @Column(name = "cep", length = 10, nullable = false)
    private String cep;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
}