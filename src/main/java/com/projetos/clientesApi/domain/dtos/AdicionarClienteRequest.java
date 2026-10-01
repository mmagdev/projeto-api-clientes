package com.projetos.clientesApi.domain.dtos;

import com.projetos.clientesApi.domain.entities.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.List;

public record AdicionarClienteRequest(

        @Size(min = 8, max = 100, message = "O nome do cliente deve ter pelo menos" +
                "8 caracteres.")
        @NotBlank(message = "O nome do cliente é obrigatório.")
        String nome,

        @Email(message = "Insira um email válido.")
        @NotBlank(message = "O email é obrigatório.")
        String email,

        @NotBlank(message = "O CPF é obrigatório.")
        @Pattern(
              regexp =  "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$|^\\d{11}$",
                message = "Deve estar no formato 000.000.000-00 ou 00000000000."
        )
        String cpf,

        @NotNull(message = "Data de nascimento obrigatória.")
        LocalDate dataNascimento,

        @NotEmpty(message = "O cliente deve ter pelo menos um endereço.")
        @Valid
        List<AdicionarEnderecoRequest> enderecos
) {
}
