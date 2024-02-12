 ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
 ![Spring](https://img.shields.io/badge/Spring-6DB33F.svg?style=for-the-badge&logo=Spring&logoColor=white)
  ![Postgres](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
 [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

 <h1>Authentication API</h1>

 <p>Este projeto é uma API construída usando Java, Java Spring, Flyway Migrations, PostgresSQL como banco de dados e Spring Security e JWT para controle de autenticação.</p>

<h2>Índice</h2>
    <ol>
        <li><a href="#instalação">Instalação</a></li>
        <li><a href="#configuração">Configuração</a></li>
        <li><a href="#endpoints-da-api">Endpoints da API</a></li>
        <li><a href="#autenticação">Autenticação</a></li>
        <li><a href="#banco-de-dados">Banco de Dados</a></li>
        <li><a href="#contribuição">Contribuição</a></li>
    </ol>
  
  <h2 id="instalação">1. Instalação</h2>
  
  <ol>
  <li>Clonar o repositório Git</li>
  
      https://github.com/sthevenalves/backend-picpay-simplified.git

  <li>Navegar para o diretório do projeto:</li>
  
      cd picpay-simplified

  <li>Compilar o projeto com Maven</li>

    mvn clean install

  <li>Executar o projeto:</li>

    java -jar target/picpay-simplified.jar
</ol>
  
  <h2 id="configuração">2. Configuração</h2>

  <p>Inicie a aplicação com Maven.</p>

  <p>A API estará acessível em <a href="http://localhost:8080">http://localhost:8080</a>.</p>
  
  <h2 id="endpoints-da-api">3. Endpoints da API</h2>
    
  <p>Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta <a href="https://www.postman.com/">Postman</a></p>
  <p>A API fornece os seguintes endpoints:</p>
    
        GET /product</code> - Recupere uma lista de todos os produtos. (todos os usuários autenticados)
        POST /product</code> - Registre um novo produto (acesso de ADMIN necessário).
        POST /auth/login</code> - Faça login no aplicativo.
        POST /auth/register</code> - Registre um novo usuário no aplicativo.

  <h2 id="autenticação">4. Autenticação</h2>
    <p>A API utiliza o Spring Security para controle de autenticação. Os seguintes papéis estão disponíveis:</p>

    USER- Papel de usuário padrão para usuários logados.
    ADMIN- Papel de administrador para gerenciar parceiros (registro de novos parceiros).

<p>Para acessar endpoints protegidos como usuário ADMIN, forneça as credenciais de autenticação apropriadas no cabeçalho da solicitação.</p>


   <h2 id="banco-de-dados">5. Banco de Dados</h2>
    <p>O projeto utiliza o PostgresSQL como banco de dados. As migrações de banco de dados necessárias são gerenciadas usando o Flyway.</p>

  <h2 id="contribuição">6. Contribuição</h2>

  <p>Contribuições são bem-vindas! Se encontrar algum problema ou tiver sugestões para melhorias, abra um problema ou envie uma solicitação de pull para o repositório.</p>

  <p>Ao contribuir para este projeto, siga o estilo de código existente, as convenções de commit e envie suas alterações em um branch separado.</p>
