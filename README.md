# 🚀 Projeto Final – Sistema de Gerenciamento de Hackathons Universitários

[![Status](https://img.shields.io/badge/status-finalizado-success?style=for-the-badge\&logo=github)](https://github.com/)
[![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge\&logo=java)](https://www.java.com)
[![JUnit](https://img.shields.io/badge/JUnit-5-red?style=for-the-badge\&logo=testing-library)](https://junit.org/junit5/)
[![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge\&logo=apachemaven)](https://maven.apache.org/)

Bem-vindo ao repositório do projeto final da disciplina de **Programação Orientada a Objetos (POO)**. Este sistema foi desenvolvido com o objetivo de simular o gerenciamento de Hackathons Universitários, abrangendo toda a estrutura de equipes, projetos, apresentações e avaliações.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

* Java 17
* JUnit 5 (testes unitários)
* Maven (gerenciamento de dependências e build)
* Mermaid (diagramação UML)
* IDE: IntelliJ IDEA / NetBeans

---

## 📦 Estrutura do Projeto

* `src/main/java`

  * `model/` → todas as entidades do sistema (Pessoa, Projeto, Equipe, etc.)
  * `service/` → coleções Singleton para gerenciamento em memória
  * `App.java` → classe principal com simulação completa no método `main()`

* `src/test/java`

  * `AppTests.java` → testes unitários com validações de regras e vínculos entre objetos

* `uml/` → documentação do diagrama UML utilizado na modelagem

* `solucao/` → documentação técnica explicando estrutura, organização e execução

---

## 🎯 Funcionalidades Principais

* Cadastro de equipes com estudantes
* Associação de projetos às equipes
* Criação de bancas avaliadoras com jurados
* Apresentações em salas agendadas
* Cálculo de nota final com base na média das avaliações
* Listagem dos projetos aprovados (nota ≥ 7)

---

## 📚 Documentação

* 📄 [Documentação da Solução](docs/solução/README.md)
* 📄 [Documentação UML](docs/UML/README.md)

---

## 👥 Desenvolvedores

* João Pedro Maciel de Oliveira
* Gabriel Victor Souza Lopes

---

## 💬 Considerações Finais

Este projeto foi uma oportunidade prática de aplicar os conceitos de **encapsulamento**, **herança**, **interfaces**, **composição** e **padrões de projeto (Singleton)**, integrando o desenvolvimento orientado a objetos com testes e documentação.

A estrutura proposta facilita futuras expansões (como persistência em banco de dados, interface gráfica, etc.).

---

**Obrigado por visitar!** 🎓
