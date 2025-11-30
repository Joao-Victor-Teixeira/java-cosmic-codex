# 🌌 Java Cosmic Codex

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-%23005F0F.svg?style=for-the-badge&logo=thymeleaf&logoColor=white)

**Uma Enciclopédia Interativa do Universo.** API RESTful e Aplicação Web dedicada à catalogação do Sistema Solar, Exoplanetas e História da Exploração Espacial.

---

## 🔭 Sobre o Projeto

O **Cosmic Codex** não é apenas um banco de dados de astros; é uma plataforma estruturada para contar a história do universo. Diferente de sistemas de catalogação comuns, este projeto implementa uma **Arquitetura Narrativa**, organizando dados científicos (massa, gravidade, tipo) dentro de uma jornada de aprendizado (Seções/Capítulos).

Desenvolvido como parte da minha especialização em **Java Spring Professional**, este projeto serve como laboratório para conceitos avançados de Engenharia de Software aplicados a um domínio complexo e real.

---

## 📐 Arquitetura e Modelo de Domínio

O sistema foi modelado para suportar tanto dados rígidos (física planetária) quanto conteúdo editorial (história da astronomia).

### Entidades Principais
* **`Section` (Seção):** Representa os capítulos da enciclopédia (ex: "O Sistema Solar", "Vizinhança Galáctica"). Funciona como a espinha dorsal da navegação.
* **`CelestialBody` (Corpo Celeste):** A entidade core que armazena dados físicos e científicos de Planetas, Luas, Estrelas e Asteroides.
* **`SpaceMission` (Futuro):** Registro de sondas e missões tripuladas vinculadas aos corpos celestes.

---

## 🚀 Tecnologias e Práticas

O projeto segue as melhores práticas de desenvolvimento moderno com **Java 21** e **Spring Boot 3**.

* **Backend:**
    * **Spring Data JPA:** Para mapeamento Objeto-Relacional (ORM) robusto.
    * **H2 Database:** Banco em memória para prototipagem rápida e testes.
    * **Bean Validation:** Garantia de integridade dos dados na entrada da API.
    * **DTO Pattern:** Desacoplamento total entre a camada de persistência e a API pública.
* **Frontend (Server-Side):**
    * **Thymeleaf:** Renderização de templates HTML no servidor para visualização rápida do conteúdo.

---

## ⚙️ Funcionalidades

- [ ] **Navegação por Seções:** Listagem estruturada de tópicos (ex: História -> Sistema Solar -> Espaço Profundo).
- [ ] **Catálogo de Astros:** CRUD completo de corpos celestes com atributos científicos (Massa, Raio, Gravidade).
- [ ] **Visualização Web:** Interface "Dark Mode" imersiva gerada via Thymeleaf para leitura dos verbetes.
- [ ] **API REST:** Endpoints JSON para consumo por aplicações externas (Mobile/React).

---

## 🛠️ Como Executar

### Pré-requisitos
- Java 21
- Maven

```bash
# 1. Clone o repositório
git clone [https://github.com/joao-teixeira/java-cosmic-codex.git](https://github.com/joao-teixeira/java-cosmic-codex.git)

# 2. Entre no diretório
cd java-cosmic-codex

# 3. Execute o projeto
./mvnw spring-boot:run
