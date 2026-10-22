show databases;

use guilherme;

show columns from itemPedidos;

insert into produtos (codigoProduto, nome, 
						precoUnitario, qauntidadeEstoque)
values (1, 'DVD' , 100.44, 100);

select * from produtos;

insert into produtos (codigoProduto, nome, 
						precoUnitario, qauntidadeEstoque)
values (2, 'Radio' , 50.88, 50),
		(3, 'Mp3' , 99.33, 115),
		(4, 'Televisão' , 1000.99, 66);
        
select * from itemPedidos;

update produtos 
set precoUnitario = 199.44,
nome = 'BlueRay'
where codigoProduto =1;

delete from produtos 
where codigoProduto = 2;

delete from produtos
where codigoProduto = 4;

delete from produtos
where codigoProduto in (1,3);

insert into produtos (codigoProduto, nome, 
						precoUnitario, qauntidadeEstoque)
values 	(1, 'BlueRay' , 149.99, 44), 
		(2, 'Radio' , 50.88, 50),
		(3, 'Mp3' , 99.33, 115),
		(4, 'Televisão' , 1000.99, 66),
        (5, 'Computador' , 2499.99, 78);
        
show columns from itemPedidos;

insert into clientes (codigoCliente, nome, 
						logradouro, numero, bairro, cep, cidade, uf, cnpj, ie)
values 	(44, 'José', 'Rua loira', 790, 'Pinheiros', 76189342, 'São Paulo', 'São Paulo', 12568946578912, 764319852648), 
		(23, 'Vanilsa' , 'Rua albuquerque', 5600, 'Aruassa', 789634582, 'Santa catarina', 'São Paulo', 78654321816589, 374291864579),
		(55, 'Heitor' , 'Rua alagada', 2344, 'peludinho', 12348967, 'Maranguape', 'Ceara', 65134289731658, 453258942),
		(13, 'Jorge Miguel' , 'Avenida Mc donalds', 762, 'chique chique bahia', 73416859, 'Jequié', 'Bahia', 12657934853694, 86321475),
        (78, 'Kevin', 'Jardim são luiz', 67, 'Jardim goticas', 79314861, 'Maracanaú', 'Ceará', 75639423584296, 374632489);
        
insert into vendedores (codigoVendedor, nome, salarioFixo)
values 	(133, 'Yoham', 1900), 
		(244, 'Januscleide' , 1500),
		(355, 'Marcos' , 1750),
		(466, 'João' , 1800),
        (577, 'Fabio', 1890);
        
insert into pedidos (codigoPedido, dataPedido, 
						dataEntrega, codigoVendedor, codigoCliente)
values 	(9, '20261119', '20261225', 133, 44), 
		(8, '20260401' , '20260710', 244, 23),
		(7, '20260706' , '20261007', 355, 55),
		(6, '20260201' , '20260215', 466, 13),
        (10, '20260403', '20260425', 577, 78);
        
insert into itemPedidos (codigoProduto, codigoPedido, quantidade)
values 	(1, 9, 220), 
		(2, 8, 58),
		(3, 7, 610),
		(4, 6, 550),
        (5, 10, 90);