# JWT-Basic

## Descrição

JWT-Basic é um projeto de exemplo que demonstra a implementação de autenticação e autorização usando JSON Web Tokens (JWT). Este projeto foi desenvolvido com Jakarta EE, Spring Data JPA, Spring MVC e Lombok.

## Funcionalidades

- Autenticação de usuários utilizando JWT.
- Autorização de acesso a recursos protegidos.
- Gestão e armazenamento de usuários usando Spring Data JPA.
- Exemplos de endpoints protegidos e abertos.

## Tecnologias Utilizadas

- **Jakarta EE**: Conjunto de especificações para a plataforma de desenvolvimento de aplicações empresariais.
- **Spring Data JPA**: Facilita a implementação de repositórios baseados no modelo de persistência JPA.
- **Spring MVC**: Framework para criação de aplicações web seguindo o padrão MVC.
- **Lombok**: Biblioteca Java que ajuda a reduzir o código boilerplate, como getters, setters e construtores.

## Estrutura do Projeto

A estrutura principal dos arquivos e diretórios do projeto é a seguinte:

## Pré-requisitos

- Java 17 ou superior
- Maven 3.6 ou superior

## Executando o Projeto

1. Clone o repositório para a sua máquina local:
   ```bash
   git clone https://github.com/ViniciusCalmon/JWT-Basic.git
   cd JWT-Basic
   ```

2. Compile e construa o projeto usando Maven:
   ```bash
   mvn clean install
   ```

3. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

## Uso

### Obter Token JWT

Faça uma solicitação POST para `/auth/login` com as credenciais do usuário:
```json
{
    "username": "seu-usuario",
    "password": "sua-senha"
}
```
A resposta conterá o token JWT.

### Acesso a Endpoints Protegidos

Inclua o token JWT no cabeçalho das requisições para endpoints protegidos:

## Contribuição

Contribuições são bem-vindas! Sinta-se livre para abrir issues e pull requests.

## Fonte de Inspiração

```bash
https://www.linkedin.com/pulse/spring-security-essentials-vitor-souza-2vo3f/?trackingId=X%2FqCI%2FLKRF2skVmJOb1JjA%3D%3D
```