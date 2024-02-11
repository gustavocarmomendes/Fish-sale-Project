## Fish sale Project Version 1.0
 
Projeto realizado no intuito de aprender outras coisas que o Java Swing proporciona, como por exemplo o JComboBox e JSpinner no qual foi utilizado neste projeto, foi desenvolvido em Java Maven utilizando JavaSwing e API JDBC para fazer a conexão com o Banco de Dados MySql.

O Banco de Dados é próprio da máquina e não está na rede, por conta disso segue o código do MySql para a criação da database e tabela.

##### Comandos MySql:
    CREATE DATABASE peixaria;

    CREATE TABLE atleta (
        codigo int auto_increment,
        produto varchar(255),
        precoUnitario double,
        quantidade int,
        precoTotal double,
        caixa double,
        primary key (codigo)
    );

Obs: o código da tabela a cima foi executado no MySql Workbench 8.0 CE, no qual não foi preciso digitar ao lado das colunas o NULL ou NOT NULL.

##### Como fazer a conexão com o Banco:
    1 - Você deve acessar o arquivo ConnectionDB.java na pasta "conn".
    
    2 - Linha 17 "private static final String URL_MYSQL = "jdbc:mysql://localhost/nbb";" caso você tenha seguido passo a
    passo não precisará fazer qualquer tipo de  modificação, mas caso tenha alterado o
    nome da database, substitua o nome no qual você colocou no lugar de nbb depois de localhost.
    
    3 - Linha 19, você irá colocar o seu usuário do MySql, por padrão é root, porém caso você tenha modificado em algum
    momento, substitua no local pelo usuário no qual o mesmo está utilizando.
    
    4 - Linha 20, você irá colocar a senha deste usuário, mas caso você esteja utilizando o Apache, poderá deixar da
    seguinte forma:
    private static final String PASS = "";
    
    5 - Agora só executar o programa e utilizar.

## Telas do Programa:

#Tela Inicial
<div align="center">
<img src="https://github.com/gustavocarmomendes/Fish-sale-Project/assets/112448190/da057660-58e8-4cc5-afff-a9241a29155b" width="450px" />
</div

#Tela de Alteração
<div align="center">
<img src="https://github.com/gustavocarmomendes/Fish-sale-Project/assets/112448190/a7c8c5d0-921e-4484-8fe2-3abb32f3c8c5" width="450px" />
</div

#OBS:
AS INFORMAÇÕES DAS VENDAS SÓ SERÃO MOSTRADAS NA TABELA APÓS CLICAR EM PESQUISAR, POIS O MESMO IRÁ LISTAR TODOS AS VENDAS QUE FORAM FEITAS.
