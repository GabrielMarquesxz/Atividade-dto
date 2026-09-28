# Atividade MVC, DTO e Spring Boot

Projeto desenvolvido para a disciplina de Programação para Web.

## Objetivo

Aplicar os conceitos de arquitetura MVC, DTO e requisições POST utilizando Spring Boot.

O projeto demonstra o cadastro de usuários utilizando um DTO para controlar os dados recebidos pela API, permitindo somente os campos necessários para o cadastro e evitando que campos internos da entidade, como `id` e `isAdmin`, sejam definidos pelo usuário.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Estrutura principal

- `Usuario` - entidade do sistema
- `UsuarioCadastroDTO` - define os dados permitidos no cadastro
- `UsuarioController` - recebe e processa a requisição POST
- `UsuarioRepository` - responsável pelo acesso aos dados

## Endpoint

`POST /usuarios`

### Exemplo de requisição

```json
{
  "nome": "Maria da Silva",
  "email": "maria@gmail.com",
  "senha": "123456"
}
```

O campo `id` é gerado automaticamente pelo sistema e o campo `isAdmin` é definido internamente como `false`.

## Execução

No Windows, execute:

```bash
mvnw.cmd spring-boot:run
```

A aplicação será iniciada em:

[http://localhost:8081](http://localhost:8081)

O endpoint de cadastro estará disponível em:

[http://localhost:8081/usuarios](http://localhost:8081/usuarios)

O console do banco H2 estará disponível em:

[http://localhost:8081/h2-console](http://localhost:8081/h2-console)