# 🎬 CineSenai — API de Filmes

API REST desenvolvida em Java com Spring Boot para realizar o cadastro e a consulta de filmes. O projeto utiliza MySQL para armazenar as informações e permite a comunicação entre o Back-end e uma interface Front-end.

## 🎯 Objetivo do Projeto

O objetivo da CineSenai é desenvolver uma API capaz de gerenciar informações de filmes, aplicando conceitos de desenvolvimento Back-end, APIs REST, persistência de dados e integração com banco de dados relacional.

## 🚀 Funcionalidades

- [x] Cadastrar filmes.
- [x] Listar todos os filmes cadastrados.
- [x] Armazenar os dados no MySQL.
- [x] Integrar a API com a interface Front-end.

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Utilização |
|---|---|
| Java 25 | Linguagem de programação |
| Spring Boot 4.2.0 | Desenvolvimento da API |
| Spring Data JPA | Persistência e consulta de dados |
| MySQL | Banco de dados relacional |
| Maven | Gerenciamento de dependências |
| HTML, CSS e JavaScript | Interface Front-end |
| Postman | Testes das requisições HTTP |

## 📂 Estrutura do Projeto

```text
Get-e-Post/
├── src/
│   └── main/
│       ├── java/com/dest1/cinesenai/
│       │   ├── controllers/
│       │   │   └── FilmesController.java
│       │   ├── entities/
│       │   │   ├── enums/
│       │   │   │   └── Classificacao.java
│       │   │   └── Filmes.java
│       │   ├── repositories/
│       │   │   └── FilmesRepository.java
│       │   └── CinesenaiApplication.java
│       └── resources/
│           ├── static/
│           │   └── Index.html
│           └── application.properties
├── pom.xml
└── README.md
```

### Organização das classes

- **Controllers:** recebem as requisições HTTP e definem as operações da API.
- **Entities:** representam os dados que serão armazenados no banco. A classe `Filmes` contém os atributos de cada filme.
- **Repositories:** fazem a comunicação com o banco de dados por meio do Spring Data JPA.
- **Enums:** armazenam valores fixos, como as classificações indicativas.
- **Resources:** contém as configurações da aplicação e os arquivos da interface Front-end.

## 🎥 Estrutura dos Dados

A entidade `Filmes` possui os seguintes atributos:

| Atributo | Tipo | Descrição |
|---|---|---|
| id | Integer | Identificador do filme |
| titulo | String | Nome do filme |
| genero | String | Gênero cinematográfico |
| sinopse | String | Resumo da história |
| foto | String | Endereço da imagem do filme |
| classificacao | Enum | Classificação indicativa |

### Classificações disponíveis

- Livre
- Seis_anos
- Dez_anos
- Doze_anos
- Quatorze_anos
- Dezesseis_anos
- Dezoito_anos

## 🔗 Endpoints da API

O endereço base utilizado pelo projeto é:

```http
http://localhost:8080/Filmes
```

| Método HTTP | Endpoint | Função |
|---|---|---|
| GET | `/Filmes` | Consultar todos os filmes |
| POST | `/Filmes` | Cadastrar um novo filme |

### 📥 GET — Consultar filmes

O método GET é utilizado para buscar informações no servidor, sem cadastrar ou alterar dados.

Na CineSenai, ele consulta todos os filmes registrados no banco de dados e retorna uma lista em formato JSON.

**Requisição:**

```http
GET http://localhost:8080/Filmes
```

**Como funciona no projeto:**

java

<img width="400"  alt="image" src="https://github.com/user-attachments/assets/94d5eeae-2b70-4fec-b9ed-e6fe35fefe3b" />

**Entendendo o código:**

- `@GetMapping`: indica que o método será executado quando a API receber uma requisição GET.
- `List<Filmes>`: indica que o retorno será uma lista de filmes.
- `repository.findAll()`: busca todos os registros da tabela de filmes no banco de dados.

**Exemplo de resposta JSON:**

json

<img width="700" alt="image" src="https://github.com/user-attachments/assets/165b73a2-590f-41c8-880a-7b817f7dfd6f" />

### 📤 POST — Cadastrar filmes

O método POST é utilizado para enviar informações ao servidor, permitindo cadastrar novos registros no banco de dados.

Na CineSenai, ele recebe os dados de um filme em formato JSON e realiza o salvamento utilizando o repositório.

**Requisição:**

```http
POST http://localhost:8080/Filmes
```

**Body — JSON:**

json

<img width="700" alt="image" src="https://github.com/user-attachments/assets/92f28fde-c276-4fd0-8d24-a843a2a42786" />

**Como funciona no projeto:**

java

<img width="700"  alt="image" src="https://github.com/user-attachments/assets/77926b50-2c80-4600-8716-43f0f87fe245" />

**Entendendo o código:**

- `@PostMapping`: indica que o método será executado quando a API receber uma requisição POST.
- `@RequestBody`: recebe os dados enviados no corpo da requisição e transforma o JSON em um objeto Java.
- `Filmes f`: representa o objeto que contém as informações do filme recebido.
- `repository.save(f)`: salva o novo filme no banco de dados e retorna o registro salvo.

**Resposta esperada:**

A API retorna o objeto cadastrado, incluindo o ID gerado pelo banco de dados.

## 🔄 Como funciona a comunicação

O funcionamento da API acontece por meio da comunicação entre as seguintes partes:

1. O cliente envia uma requisição HTTP para a API.
2. O Controller recebe a requisição.
3. O Repository realiza a operação solicitada no banco de dados.
4. O resultado é retornado ao cliente em formato JSON.

## ⚙️ Como executar o projeto

### 1. Pré-requisitos

- Java JDK 25.
- MySQL.
- IntelliJ IDEA ou outra IDE compatível.
- Git.

### 2. Clone o repositório

```bash
git clone https://github.com/SEU-USUARIO/Get-e-Post.git
```

Entre na pasta:

```bash
cd Get-e-Post
```

### 3. Configure o banco de dados

Crie o banco de dados no MySQL:

```sql
CREATE DATABASE FFilmes;
```

Abra o arquivo `application.properties` e configure suas credenciais:

```properties
spring.application.name=cinesenai

spring.datasource.url=jdbc:mysql://localhost:3306/FFilmes
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### 4. Execute a aplicação

Abra o projeto na sua IDE e execute a classe:

`CinesenaiApplication.java`

Com a aplicação em execução, a API estará disponível em:

```http
http://localhost:8080
```

A interface Front-end está localizada em `src/main/resources/static/Index.html` e pode ser acessada pelo navegador no endereço local da aplicação.

## 📸 Demonstração do Projeto

### Interface Front-end

<img width="700"  alt="image" src="https://github.com/user-attachments/assets/eaf50c1e-cbd4-4e59-96ed-95a8484d3df1" />

### Filmes Cadastrados

<img width="700" alt="image" src="https://github.com/user-attachments/assets/0ff97f8b-a73f-4729-a9b7-3c3c3f67f226" />

## 📚 Aprendizados

Durante o desenvolvimento deste projeto, foram trabalhados conceitos importantes de programação Back-end:

- Desenvolvimento de APIs REST com Java e Spring Boot.
- Utilização dos métodos HTTP GET e POST.
- Criação de Controllers, Entities e Repositories.
- Integração com banco de dados MySQL.
- Persistência de dados com Spring Data JPA.
- Envio e recebimento de informações em formato JSON.
- Testes de requisições HTTP com Postman.

## 👨‍💻 Autor

Desenvolvido por **Felipe Lisboa Carvalho**.

Projeto acadêmico desenvolvido para praticar conceitos de desenvolvimento Back-end com Java e Spring Boot.
