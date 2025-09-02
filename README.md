# Atividade Prática - Sistema de Cadastro em Java

Projeto Java desenvolvido como atividade prática para o curso do UniSENAI.  
O objetivo é criar um sistema simples de cadastro com manipulação de entidades utilizando listas, pacotes e boas práticas de POO em Java.

## 📚 Estrutura do Projeto

- **Pacote `br.com.senai.entity`**  
  Contém as entidades principais do sistema:
  - `Pessoa`
  - `Endereco`
  - `Funcionario`
  - `Cliente`

- **Pacote `br.com.senai.service`**  
  Contém as classes de serviço responsáveis pela lógica de negócios e manipulação das listas:
  - `PessoaService`
  - `EnderecoService`
  - `FuncionarioService`
  - `ClienteService`
  - `MenuService` (responsável pela interação com o usuário)

- **Pacote `br.com.senai.view`**  
  Responsável por exibir os menus e capturar entradas do usuário:
  - `PessoaView`
  - `EnderecoView`
  - `FuncionarioView`
  - `ClienteView`

## ✅ Funcionalidades Implementadas

Cada entidade possui:
- Atributos com modificador `private`
- Métodos `get` e `set`
- Dois construtores:
  - Um vazio
  - Um com todos os atributos

Cada classe de serviço permite:
- Adicionar
- Listar
- Buscar
- Remover
- Editar

> As classes usam `ArrayList` para armazenar os dados temporariamente em memória.

## 🎯 Objetivo da Atividade

1. Praticar a criação de pacotes organizados.
2. Aplicar encapsulamento e uso de construtores.
3. Utilizar listas dinâmicas (`ArrayList`) para armazenamento.
4. Desenvolver uma interface textual simples para interação com o usuário.
5. Praticar o uso de métodos de manipulação de dados (CRUD).
6. Trabalhar com sobrecarga de métodos (ex: remover por objeto ou índice).

## 🚀 Execução

Para rodar o projeto:
- Use o IntelliJ IDEA (ou qualquer IDE Java compatível)
- Execute a classe principal (ex: `Application.java` ou `ProjetoPrincipal.java`)

## 🛠️ Tecnologias Utilizadas

- Java 17+
- IntelliJ IDEA
- Git/GitHub

---

💡 *Se você gostou deste projeto, deixe uma ⭐ no repositório!*
