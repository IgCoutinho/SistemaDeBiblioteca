# Sistema de Biblioteca em Java

## Descrição

Este projeto é uma simulação de um sistema de biblioteca desenvolvido em Java, com foco em Programação Orientada a Objetos (POO) e organização em camadas.

O sistema permite gerenciar:

* Cadastro de livros
* Cadastro de usuários
* Empréstimo de livros
* Devolução de livros
* Consulta de estado (disponível/indisponível)

---

## Estrutura do Projeto

O projeto segue uma separação em pacotes no estilo:

```
br.com.igor.biblioteca
│
├── domain     → entidades e regras de negócio
├── service    → orquestração das ações do sistema
└── test/main  → execução e simulação do sistema
```

---

## Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Herança
* Polimorfismo (básico)
* Interfaces
* Separação de responsabilidades (Domain vs Service)
* Manipulação de arrays
* Controle de estado entre objetos

---

## Tipos de Usuário

* Usuário Comum
  Limite de livros: 3

* Usuário Premium
  Limite de livros: 5

---

## Regras de Negócio

### Empréstimo

* O livro deve estar disponível
* O usuário não pode ultrapassar seu limite
* O livro passa a ficar indisponível
* O livro é associado ao usuário

### Devolução

* Apenas quem pegou o livro pode devolvê-lo
* O livro volta a ficar disponível
* A associação com o usuário é removida

---

## Funcionalidades

* cadastrarLivro(Livro livro)
* cadastrarUsuario(Usuario usuario)
* listarLivros()
* emprestarLivro(Usuario usuario, Livro livro)
* devolverLivro(Usuario usuario, Livro livro)
* imprimeUsuario(Usuario usuario)
* imprimeLivro(Livro livro)

---

## Como Executar

1. Compile o projeto
2. Execute a classe Main ou classe de teste
3. O sistema será executado via console

---

## Exemplo de Fluxo

1. Criar autor
2. Criar livro
3. Criar usuário
4. Emprestar livro
5. Tentar emprestar novamente (erro esperado)
6. Devolver livro
7. Listar estado final

---

## Melhorias Futuras

* Substituir arrays por Collections (List, Set)
* Persistência de dados com banco (MySQL, PostgreSQL)
* Criação de API REST com Spring Boot
* Implementação de tratamento de exceções
* Interface gráfica ou integração com frontend
* Testes automatizados (JUnit)

---

## Objetivo do Projeto

Projeto desenvolvido com fins educacionais para praticar:

* Estruturação de sistemas em Java
* Aplicação de regras de negócio
* Evolução de código de iniciante para nível júnior

---

## Autor

Igor Ferreira Coutinho
