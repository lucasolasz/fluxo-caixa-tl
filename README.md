# Pagamentos

Este é um projeto de uma aplicação web **monolítica** desenvolvida com **Java 21**, utilizando o framework **Spring Boot**, com a engine de templates **Thymeleaf** e o tema **SB Admin 2 (Bootstrap)** para estilização. O objetivo principal é a criação de um sistema robusto de pagamentos, com autenticação, validações, e interface amigável.

A escolha pelo Thymeleaf surgiu a partir da minha experiência atual como desenvolvedor no Tribunal Regional Federal, onde trabalho com aplicações Java utilizando JSF. Ao explorar a documentação do Thymeleaf, notei diversas semelhanças com o JSF, o que facilitou a curva de aprendizado. Optei por utilizá-lo neste projeto com o objetivo de aplicar os conceitos do Spring Boot no backend, explorando boas práticas modernas do ecossistema Java.

## Funcionalidades

- **Autenticação e Autorização** com Spring Security
- **Validação de formulários** com Spring Validation
- **Painel administrativo estilizado** com SB Admin 2 (Bootstrap)
- **Integração com banco de dados MySQL**
- **Uso de TypeScript no front-end**
- **Configuração por ambiente via `.env`**
- **Criação de entidades com Lombok**

## Tecnologias Utilizadas

- **Java 21**: Linguagem principal da aplicação.
- **Spring Boot**: Framework para desenvolvimento rápido e eficiente de aplicações web.
- **Thymeleaf**: Template engine para renderização do front-end.
- **SB Admin 2 (Bootstrap)**: Template de painel administrativo responsivo.
- **TypeScript**: Superset do JavaScript com tipagem estática.
- **Spring Security**: Framework de autenticação e autorização.
- **Spring Validation**: Validação de dados em formulários e APIs.
- **Lombok**: Redução de boilerplate em entidades Java.
- **MySQL**: Banco de dados relacional.

## Como Executar o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/lucasolasz/pagamentos.git
   cd pagamentos
   ```

2. Crie um arquivo `.env` na raiz do projeto com o seguinte conteúdo:

   ```env
   DB_HOST=
   DB_PORT=
   DB_NAME=
   SPRING_DATASOURCE_USERNAME=
   SPRING_DATASOURCE_PASSWORD=
   COMANDO_DDL_HIBERNATE=
   PERFIL_SPRING=
   ```

3. Para a **primeira execução**, defina:

   ```env
   COMANDO_DDL_HIBERNATE=create
   PERFIL_SPRING=dev
   ```

4. Acesse a aplicação no navegador:

   ```
   http://localhost:8080
   ```

## Estrutura do Projeto

- `src/main/java`: Código-fonte da aplicação Java
- `src/main/resources`: Arquivos de configuração e templates HTML
- `public`: Recursos estáticos (CSS, JS, imagens)
- `.env`: Configurações sensíveis de ambiente
