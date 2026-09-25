package com.projetos.clientesApi.domain.dtos;

import com.projetos.clientesApi.domain.entities.Endereco;

import java.time.LocalDate;
import java.util.List;

public record AdicionarClienteRequest(
        String nome,
        String email,
        String cpf,
        LocalDate dataNascimento,
        List<AdicionarEnderecoRequest> enderecos
) {
}
