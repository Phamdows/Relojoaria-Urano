DROP DATABASE IF EXISTS pi;
CREATE DATABASE pi;
USE pi;

CREATE TABLE vendas(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	produtos VARCHAR(60),
	descricao VARCHAR(255),
	data DATETIME,
	valorTotal FLOAT,
	desconto FLOAT,
	formaPagamento VARCHAR(10)
);

CREATE TABLE ordemServico(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nomeCliente VARCHAR(60),
    telefone VARCHAR(20),
    servico VARCHAR(100),
    preco FLOAT,
    dataRecepcao DATETIME,
    dataRetirada DATETIME,
    formaPagamento VARCHAR(10),
    jaPago VARCHAR(10),
    status VARCHAR(20)
);