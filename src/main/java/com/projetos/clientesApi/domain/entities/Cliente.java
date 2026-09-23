package com.projetos.clientesApi.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue
    private UUID id;
    private String nome;
    private String email;
    private String cpf;
    private Date dataNascimento;
}
