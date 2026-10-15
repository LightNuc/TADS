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

create table clientes
(
codigoCliente int primary key,
nome varchar (50),
logradouro varchar (50),
numero varchar (8),
bairro varchar (50),
cep varchar (8),
cidade varchar (20),
uf char (2),
cnpj char (14),
ie varchar (20)
);

create table pedidos
(
codigoPedido int primary key,
dataPedido timestamp,
dataEntrega datetime,
codigoVendedor int,
codigoCliente int
);

create table itemPedidos
(
codigoProduto int,
codigoPedido int,
quantidade int,
constraint pk1 primary key(codigoProduto, codigoPedido)
);

alter table pedidos add constraint fk1 
foreign key(codigoCliente) references clientes(codigoCliente);

alter table pedidos add constraint fk2
foreign key(codigoVendedor) references vendedores(codigoVendedor);

alter table itemPedidos add constraint fk3
foreign key(codigoPedido) references pedidos(codigoPedido);

alter table itemPedidos add constraint fk4
foreign key(codigoProduto) references produtos(codigoProduto);

alter table clientes add StatusCliente bit;
alter table clientes drop column StatusCliente;

alter table clientes modify StatusCliente char (2);

alter table clientes change StatusCliente stCliente bit;

alter table clientes add constraint primary key(codigoCliente);

alter table clientes rename to pessoas;
alter table pessoas rename to clientes;

desc clientes;

show keys from clientes;

show tables;
show columns from clientes;
show index from clientes;
show keys from pedidos;

alter table pedidos drop constraint fk1;