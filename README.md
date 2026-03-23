# 🎬 MoveFlix - API de Filmes

## 📌 Sobre o Projeto
O **MoveFlix** é uma API REST desenvolvida com **Java + Spring Boot**, com foco no gerenciamento de categorias (e futuramente filmes), simulando o funcionamento básico de uma plataforma de streaming.

Este projeto foi criado com foco em aprendizado e aplicação de boas práticas no desenvolvimento de APIs REST.

---

## 🚀 Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- JWT
- Flyway
- Hibernate
- Maven
- Postgree
- Docker
- Swagger

---

## 📂 Estrutura do Projeto

```
moveflix/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/moveflix/
│   │   │       ├── config/
│   │   │       │   ├── ApplicationConfigAdvice.java
│   │   │       │   ├── JWTUserData.java
│   │   │       │   ├── SecurityConfig.java
│   │   │       │   ├── SecurityFilter.java
│   │   │       │   ├── SwaggerConfig.java
│   │   │       │   └── TokenConfig.java
│   │   │       ├── controller/
│   │   │       │   ├── request/
│   │   │       │   │   ├── CategoryRequest.java
│   │   │       │   │   ├── LoginRequest.java
│   │   │       │   │   ├── MovieRequest.java
│   │   │       │   │   ├── StreamingRequest.java
│   │   │       │   │   └── UserRequest.java
│   │   │       │   ├── response/
│   │   │       │   │   ├── CategoryResponse.java
│   │   │       │   │   ├── LoginResponse.java
│   │   │       │   │   ├── MovieResponse.java
│   │   │       │   │   ├── StreamingResponse.java
│   │   │       │   │   └── UserResponse.java
│   │   │       │   ├── AuthController.java
│   │   │       │   ├── CategoryController.java
│   │   │       │   ├── MovieController.java
│   │   │       │   └── StreamingController.java
│   │   │       ├── entity/
│   │   │       │   ├── Category.java
│   │   │       │   ├── Movie.java
│   │   │       │   ├── Streaming.java
│   │   │       │   └── User.java
│   │   │       ├── exception/
│   │   │       │   └── UsernameOrPasswordInvalidException.java
│   │   │       ├── mapper/
│   │   │       │   ├── CategoryMapper.java
│   │   │       │   ├── MovieMapper.java
│   │   │       │   ├── StreamingMapper.java
│   │   │       │   └── UserMapper.java
│   │   │       ├── repository/
│   │   │       │   ├── CategoryRepository.java
│   │   │       │   ├── MovieRepository.java
│   │   │       │   ├── StreamingRepository.java
│   │   │       │   └── UserRepository.java
│   │   │       ├── service/
│   │   │       │   ├── AuthService.java
│   │   │       │   ├── CategoryService.java
│   │   │       │   ├── MovieService.java
│   │   │       │   ├── StreamingService.java
│   │   │       │   └── UserService.java
│   │   │       └── MoveflixApplication.java
│   │   └── resources/
│   │       ├── db.migration/
│   │       │   ├── V1__create_table_category.sql
│   │       │   ├── V2__create_table_streaming.sql
│   │       │   ├── V3__create_table_movie.sql
│   │       │   ├── V4__create_table_movie_category.sql
│   │       │   ├── V5__create_table_movie_streaming.sql
│   │       │   └── V6__create_table_user.sql
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.yaml
│   └── test/
├── target/
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

## 📌 Descrição das Camadas
**config/**
Configurações gerais do projeto, segurança, JWT e Swagger.

**controller/**  
Responsável pelos endpoints da API

**request/response/** 
DTOs de entrada e saída.

**exception/** 
tratamento de exceções.

**service/**  
Regras de negócio

**repository/**  
Acesso ao banco (JPA)

**entity/**  
Representação das tabelas

**mapper/**  
Conversão DTO ↔ Entity

**db.migration/**
Scripts de versionamento do banco com Flyway.

---

## Funcionalidades
- Cadastro de usuários
- Login com autenticação JWT
- Cadastro, listagem, busca e exclusão de categorias
- Cadastro, listagem, busca e exclusão de streamings
- Cadastro, listagem, busca, atualização e exclusão de filmes
- Busca de filmes por categoria

---

## 🔗 Endpoints

```
### Autenticação
- POST `/movieflix/auth/register`
- POST `/movieflix/auth/login`

### Categorias
- GET `/movieflix/category`
- GET `/movieflix/category/{id}`
- POST `/movieflix/category`
- DELETE `/movieflix/category/{id}`

### Streamings
- GET `/movieflix/streaming`
- GET `/movieflix/streaming/{id}`
- POST `/movieflix/streaming`
- DELETE `/movieflix/streaming/{id}`

### Filmes
- GET `/movieflix/movie`
- GET `/movieflix/movie/{id}`
- POST `/movieflix/movie`
- PUT `/movieflix/movie/{id}`
- DELETE `/movieflix/movie/{id}`
- GET `/movieflix/movie/search?category={id}`
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
- Testes  

---

## 🍿 MoveFlix
"Porque todo projeto merece um bom roteiro!"
