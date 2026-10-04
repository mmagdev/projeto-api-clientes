package com.projetos.clientesApi.domain.dtos;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record AdicionarClienteResponse(
        String mensagem,
        UUID id,
        LocalDate dataCadastro,
        String nome,
        String email,
        List<EnderecoResponse> enderecos
) {
}
