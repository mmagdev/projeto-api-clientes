package com.projetos.clientesApi.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AdicionarEnderecoRequest(

        @NotBlank(message = "O campo é obrigatório.")
        String logradouro,

        @NotBlank(message = "O campo é obrigatório.")
        String complemento,

        @NotBlank(message = "O campo é obrigatório.")
        String numero,

        @NotBlank(message = "O campo é obrigatório.")
        String bairro,

        @NotBlank(message = "O campo é obrigatório.")
        String cidade,

        @NotBlank(message = "O campo é obrigatório.")
        String uf,

        @NotBlank(message = "O campo é obrigatório.")
        @Pattern(
                regexp = "^\\d{5}-\\d{3}$|^\\d{8}$",
                message = "CEP deve estar no formato 00000-000 ou 00000000."
        )
        String cep
) {
}
