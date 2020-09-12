use classicmodels;
select * from customers
limit 0,30;
-- 
use classicmodels;
select * from customers
where `customerName` = 'Atelier Graphique'
limit 0,30;
-- 
use classicmodels;
select * from customers
where `customerName` like '%A%'
limit 0,30;
-- 
use classicmodels;
select * from customers
where `city`
in('Nantes', 'Las Vegas', 'Warszawa', 'NYC')
limit 0,30;
-- 
use classicmodels;
select * from orders
where `orderNumber` between 10100 and 10110;
--
use classicmodels;
select * from orders
where `status` like'shipped' and `orderDate` <= '2003-03-03'
limit 0,30; 