# 🎬 MoveFlix - API de Filmes

## 📌 Sobre o Projeto
O **MoveFlix** é uma API REST desenvolvida com **Java + Spring Boot**, com foco no gerenciamento de categorias (e futuramente filmes), simulando o funcionamento básico de uma plataforma de streaming.

O projeto foi criado para praticar:
- Arquitetura em camadas
- Boas práticas de backend
- APIs REST
- Integração com banco de dados

---

## 🚀 Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- MariaDB / H2
- Docker

---

## 📂 Estrutura do Projeto

```
src/
 └── main/
     ├── java/
     │   └── br/com/moveflix/
     │       ├── controller/
     │       │    └── CategoryController.java
     │       ├── service/
     │       │    └── CategoryService.java
     │       ├── repository/
     │       │    └── CategoryRepository.java
     │       ├── entity/
     │       │    └── Category.java
     │       ├── dto/
     │       │    ├── CategoryRequest.java
     │       │    └── CategoryResponse.java
     │       ├── mapper/
     │       │    └── CategoryMapper.java
     │       └── config/
     │            └── (configurações)
     └── resources/
         ├── application.yml
         └── data.sql (opcional)
```

---

## 📌 Descrição das Camadas

**controller/**  
Responsável pelos endpoints da API

**service/**  
Regras de negócio

**repository/**  
Acesso ao banco (JPA)

**entity/**  
Representação das tabelas

**dto/**  
Entrada/saída de dados

**mapper/**  
Conversão DTO ↔ Entity

**config/**  
Configurações

---

## ⚙️ Funcionalidades
- Cadastro de categorias  
- Listagem de categorias  
- Busca por ID  

---

## 🔗 Endpoints

```
GET     /category
POST    /category
GET     /category/{id}
```

---

## ▶️ Como Executar

```
git clone https://github.com/amarildorpg/moveflix.git
cd moveflix
./mvnw spring-boot:run
```

---

## 🐳 Docker

```
docker build -t moveflix .
docker run -p 8080:8080 moveflix
```

---

## 🗄️ Banco de Dados

```
spring:
  datasource:
    url: jdbc:mariadb://localhost:3306/moveflix
    username: root
    password: senha
```

---

## 👨‍💻 Autor
Amarildo Silva  
https://github.com/amarildorpg

---

## 🚧 Melhorias Futuras
- Autenticação JWT  
- CRUD de filmes  
- Swagger  
- Testes  

---

## 🍿 MoveFlix
"Porque todo projeto merece um bom roteiro!"
