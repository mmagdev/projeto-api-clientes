API de Clientes
📋 Escopo do Projeto

Aplicação Spring Boot desenvolvida como projeto acadêmico, aplicando as ferramentas e conceitos aprendidos durante a formação Fullstack Java Developer.

O objetivo é construir uma API RESTful de gerenciamento de clientes, baseada em DDD e seguindo boas práticas de separação de responsabilidades:

domain: entidades, regras de negócio e contratos (interfaces)
application: orquestração dos casos de uso e DTOs
infrastructure: controllers REST, configurações, implementações de repositório e integração com mensageria
🛠️ Tecnologias Utilizadas:

Spring Boot - Framework principal da aplicação
Spring Boot DevTools - Reinício automático e produtividade em desenvolvimento
Spring Web - Construção da API REST
Spring Data JPA - Persistência e mapeamento objeto-relacional
PostgreSQL - Banco de dados relacional
Bean Validation - Validação de dados de entrada
SpringDoc OpenAPI (Swagger) - Documentação interativa da API
Lombok - Redução de código boilerplate (getters, setters, etc.)
Java Faker - Geração de dados fictícios para testes/seed
RabbitMQ - Mensageria assíncrona (eventos entre serviços)
Docker - Containerização do ambiente (banco de dados e mensageria)
