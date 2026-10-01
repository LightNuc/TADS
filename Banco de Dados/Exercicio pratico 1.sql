-- Criação de tabelas
-- sql ddl create

create database guilherme;

use guilherme;

create table vendedores
(
codigoVendedor int primary key,
nome varchar (50),
salarioFixo dec(10,4)
);

create table produtos
(
codigoProduto int primary key,
nome varchar (50),
precoUnitario dec(10,4),
qauntidadeEstoque int
);