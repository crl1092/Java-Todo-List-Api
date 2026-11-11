# TodoApi


Este é um mini projeto desenvolvido para consolidar meus estudos em **Spring Boot** e integração com o banco de dados relacional **PostgreSQL**. A API realiza o CRUD completo de [ex: produtos e clientes].

## 🛠️ Tecnologias Utilizadas

- **Java 25** 
- **Spring Boot 4.x**
- **Spring Data JPA** (Persistência de dados)
- **PostgreSQL** (Banco de dados)
- **Maven** (Gerenciador de dependências)

## 🔒 Boas Práticas de Segurança e Configuração

Para seguir as práticas recomendadas de mercado, as credenciais sensíveis do banco de dados (como a senha de produção/local) **não foram expostas no código-fonte**. O projeto utiliza variáveis de ambiente para gerenciar dados sensíveis de forma segura.

---

## 🚀 Como Executar o Projeto Localmente

### Pré-requisitos
- Java JDK instalado (versão 17+)
- Maven instalado (opcional, pode usar o wrapper `./mvnw`)
- PostgreSQL instalado e rodando localmente

### 1. Clonar o Repositório
```bash
git clone https://github.com[seu-usuario]/[nome-do-repositorio].git
cd [nome-do-repositorio]
```

### 2. Configurar o Banco de Dados
1. Abra o seu terminal do PostgreSQL (pgAdmin ou psql) e crie um banco de dados chamado `[nome_do_seu_banco]`.
2. Na raiz do projeto, você encontrará o arquivo `application.properties`. As configurações padrão já apontam para `localhost:5432` com o usuário padrão `postgres`.

### 3. Definir a Variável de Ambiente
Antes de rodar a aplicação, você precisa expor a senha do seu banco de dados local.

**No Linux/macOS:**
```bash
export DB_PASSWORD="sua_senha_do_postgres"
```

**No Windows (Command Prompt):**
```cmd
set DB_PASSWORD=sua_senha_do_postgres
```

**No Windows (PowerShell):**
```powershell
\$env:DB_PASSWORD="sua_senha_do_postgres"
```

*Nota: Se estiver usando IntelliJ ou VS Code, você também pode injetar a variável `DB_PASSWORD` diretamente nas configurações de inicialização da IDE (Run Configurations).*

### 4. Executar a Aplicação
Com a variável definida, execute o comando correspondente na raiz do projeto:

```bash
./mvnw spring-boot:run
```
A API estará disponível em `http://localhost:8080`.

---

## 🛑 Endpoints Principais (Exemplos)

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/tarefas/` | Lista todos os registros |
| `POST` | `/tarefas/` | Cria um novo registro |
| `PUT` | `/tarefas/{id}` | Atualiza o status de uma tarefa |
| `DELETE` | `/tarefas/{id}`| Deleta uma tarefa especifica|
| `GET`| `/healt`| Retorna um Ok se a api estiver funcionando corretamente |


## 📖 Documentação da API (Swagger)

A API possui documentação interativa com o **Swagger UI**. Para visualizar a estrutura dos endpoints e testar as requisições em tempo de execução:

1. Certifique-se de que a aplicação está rodando localmente.
2. Acesse o endereço no seu navegador: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
