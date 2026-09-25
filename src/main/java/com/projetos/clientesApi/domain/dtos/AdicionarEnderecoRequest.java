package com.projetos.clientesApi.domain.dtos;

public record AdicionarEnderecoRequest(
        String logradouro,
        String complemento,
        String numero,
        String bairro,
        String cidade,
        String uf,
        String cep
) {
}
