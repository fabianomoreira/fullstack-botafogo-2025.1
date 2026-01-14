-- COMANDOS ESTRUTURAIS (DDL)

-- DROP DATABASE fullstackdb;

CREATE DATABASE fullstackdb;
USE fullstackdb;

CREATE TABLE pessoa(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(40),
    cidade VARCHAR(25)
);