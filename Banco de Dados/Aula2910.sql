show tables;

select CustomerID, CompanyName, City, Region
from customers;

select OrderID, OrderDate, ShippedDate
from orders
where orderid > 10300 and 
		orderdate > '19961010';

select OrderID, ProductID, Quantity
from `order details`

select customerid, contactname, address, region
from customers
where region is null;


select customerid, contactname, address, region
from customers
order by customerid desc;

select customerid, contactname, address, region
from customers
order by address desc;

select *
from customers
where companyname like '%a';

select *
from customers
where companyname like '%do%';

select *
from customers
where companyname like '% do %' or '% da %';

select productid, productname, (unitprice * UnitsInStock) as TotalItem
from products;

select min(unitprice) as menorpreco,
		max(unitprice) as maiorpreco,
		sum(unitprice) as 'somatoria de preços',
        count(unitprice) as 'QTD produtos',
        avg(unitprice) as 'media'
from products;

