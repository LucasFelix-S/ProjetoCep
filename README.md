# ProjetoCep

🗺️ O **ProjetoCep** é um projeto desenvolvido com foco em aprendizado prático e consolidação de fundamentos de back-end em Java.

A aplicação consome a API pública **ViaCEP**, trata a resposta HTTP retornada e persiste os dados obtidos em um banco de dados local. O objetivo é exercitar o consumo de APIs REST, manipulação de requisições e respostas HTTP, persistência de dados e organização de código.

---

## Tecnologias Utilizadas

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=plastic&logo=java&logoColor=white" height="18"/>
  <img src="https://img.shields.io/badge/Microsoft_SQL_Server-CC2927?style=plastic&logo=microsoft-sql-server&logoColor=white" height="18"/>
</p>

🔹 **Java (puro)** — lógica principal da aplicação  
🔹 **Gson** — Transformação do Json em POJO  
🔹 **HttpClient / HttpRequest** — consumo da API REST ViaCEP  
🔹 **JDBC** — comunicação com o banco de dados  
🔹 **SQL Server (T-SQL)** — persistência dos dados localmente  

---

## Visão Geral do Funcionamento

🔹 O CEP é informado diretamente no construtor da classe responsável pela modelagem dos dados  
🔹 A aplicação realiza uma requisição HTTP para a API ViaCEP  
🔹 A resposta JSON é tratada e convertida para objetos Java  
🔹 Os dados processados são persistidos em um banco de dados local  

O projeto foca na clareza do fluxo de dados, desde a requisição externa até a gravação no banco.

---

## Observações Importantes

⚠️ Este projeto **não possui interface gráfica (GUI)** nem **interface de linha de comando (CLI)**.

🔹 O CEP é definido diretamente no construtor da classe `JsonModeller`  
🔹 A execução do fluxo ocorre via código, com foco exclusivo no aprendizado técnico  

Uma possível evolução futura seria a adição de um CLI para tornar o uso mais interativo, mas isso não é prioridade no estado atual do projeto.

---

## Como Executar o Projeto

🔹 Certifique-se de ter o **Java JDK** instalado  
🔹 Configure um banco de dados **SQL Server** local  
🔹 Ajuste as credenciais de conexão no código (JDBC)  
🔹 Clone o repositório:
```bash
git clone https://github.com/LucasFelix-S/ProjetoCep.git
