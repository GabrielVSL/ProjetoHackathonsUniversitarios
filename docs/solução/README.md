# Sistema de Gerenciamento de Hackathons Universitários

Este documento descreve o funcionamento e a estrutura do código desenvolvido para um sistema de gerenciamento de Hackathons Universitários, com foco no gerenciamento de **equipes**, **projetos**, **apresentações** e **avaliações por jurados**.

O sistema foi construído com base em um **diagrama UML** fornecido como referência, seguindo conceitos de orientação a objetos e boas práticas de organização de código Java.

➡️ **[Clique aqui para ver o README da UML](../UML/README.md)**

---

## 🧩 Organização do Código

O projeto está dividido em três pacotes principais:

### 🔹 `model`
Contém todas as **classes de domínio**, conforme o diagrama UML, incluindo:
* `Pessoa`, `Estudante`, `Profissional`, `Jurado`
* `Projeto`, `Equipe`, `Apresentacao`, `Sala`, `Banca`
* `Universidade`, `Empresa`, `Instituicao`
* Interface `Avaliavel`

### 🔹 `service`
Contém as **coleções Singleton**, responsáveis por manter os objetos principais em memória:
* `Equipes`: armazena e gerencia objetos `Equipe`
* `Apresentacoes`: armazena `Apresentacao` e filtra projetos com nota final ≥ 7

### 🔹 `App.java`
Classe principal com o método `main()`, que simula a execução do sistema:
* Cria 2 equipes com 5 estudantes
* Adiciona um projeto por equipe
* Cria uma banca de 4 jurados por projeto
* Realiza uma apresentação com notas dos jurados
* Calcula a nota final e imprime projetos aprovados

---

## ✅ Funcionalidades implementadas (via `main()`):
* ✅ Criação de equipes e estudantes
* ✅ Associação de projetos às equipes
* ✅ Avaliação com banca de jurados
* ✅ Apresentações em salas
* ✅ Cálculo da nota final a partir das avaliações
* ✅ Listagem de projetos aprovados (nota ≥ 7)

---

## 📂 Execução e Testes

### Execução do sistema (com `main()`):
```bash
mvn clean compile exec:java
```

### Execução dos testes unitários:

```bash
mvn test
```

Os testes em `AppTests.java` validam o funcionamento da ligação entre entidades, o cálculo de médias e o funcionamento dos Singletons.

---

## 📌 Conclusão

Este projeto demonstra a aplicação prática de orientação a objetos, organização modular com Java, e uso de design pattern Singleton. A estrutura e implementação estão de acordo com o diagrama UML proposto, garantindo clareza, reutilização e separação de responsabilidades no sistema.

