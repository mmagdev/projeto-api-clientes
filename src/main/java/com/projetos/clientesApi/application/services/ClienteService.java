package com.projetos.clientesApi.application.services;


import com.projetos.clientesApi.domain.dtos.AdicionarClienteRequest;
import com.projetos.clientesApi.domain.dtos.AdicionarClienteResponse;
import com.projetos.clientesApi.domain.dtos.EnderecoResponse;
import com.projetos.clientesApi.domain.entities.Cliente;
import com.projetos.clientesApi.domain.entities.Endereco;
import com.projetos.clientesApi.infrastructure.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    /*
    Método para adicionar um cliente ao sistema
     */

    public AdicionarClienteResponse adicionarCliente(AdicionarClienteRequest request) throws Exception{

        //Criando um objeto da entidade Cliente
        var cliente = new Cliente();

        //Preenchendo os dados do cliente
        cliente.setNome(request.nome());
        cliente.setEmail(request.email());
        cliente.setCpf(request.cpf());
        cliente.setDataNascimento(request.dataNascimento());

        //Convertendo List<AdicionarEnderecoRequest> para List<Endereco>
        // e associando cada endereço ao cliente

        List<Endereco> enderecos = request.enderecos()
                .stream()
                .map(e -> {

                    var endereco = new Endereco();

                            endereco.setLogradouro(e.logradouro());
                            endereco.setComplemento(e.complemento());
                            endereco.setNumero(e.numero());
                            endereco.setBairro(e.bairro());
                            endereco.setCidade(e.cidade());
                            endereco.setUf(e.uf());
                            endereco.setCep(e.cep());
                            endereco.setCliente(cliente);
                            return endereco;
                    })
                    .toList();

        cliente.setEnderecos(enderecos);

        var clienteSalvo = clienteRepository.save(cliente);

        //Convertendo a saída de EnderecoResponse

        List<EnderecoResponse> enderecoResponse = clienteSalvo.getEnderecos().stream()
                .map(e -> new EnderecoResponse(
                        e.getId(),
                        e.getLogradouro(),
                        e.getComplemento(),
                        e.getNumero(),
                        e.getBairro(),
                        e.getCidade(),
                        e.getUf(),
                        e.getCep()
                        )

                )
                .toList();



        //retornando os dados do cliente cadastrado

        return new AdicionarClienteResponse(
                "Cliente cadastrado com sucesso!",
                clienteSalvo.getId(),
                LocalDate.now(),
                cliente.getNome(),
                cliente.getEmail(),
                enderecoResponse
        );
    }
}
