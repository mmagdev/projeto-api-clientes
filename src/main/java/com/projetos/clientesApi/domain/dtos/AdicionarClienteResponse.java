package com.projetos.clientesApi.domain.dtos;

import java.time.LocalDate;
import java.util.UUID;

public record AdicionarClienteResponse(
        String mensagem,
        LocalDate data_cadastro,
        UUID id,
        String nome,
        String email
) {
}
