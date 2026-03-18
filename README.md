# Task Manager API (Spring Boot)

API REST para gerenciamento de tarefas desenvolvida com **Java + Spring Boot**

---

# Tecnologias

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (em memória)
- Maven

---

# Arquitetura

Controller → Service → Repository → Banco
↑
DTO
↓
Entity

### Camadas

- **Controller** → recebe requisições HTTP  
- **Service** → regras de negócio  
- **Repository** → acesso ao banco (JPA)  
- **Entity** → representa tabela no banco  
- **DTO** → comunicação com cliente (API)
