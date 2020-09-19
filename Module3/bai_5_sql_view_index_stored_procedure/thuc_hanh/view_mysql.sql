use classicmodels;


-- tao view
CREATE VIEW customer_views AS

SELECT customerNumber, customerName, phone

FROM  customers;

select * from customer_views;

-- update view
CREATE OR REPLACE VIEW customer_views AS

SELECT customerNumber, customerName, contactFirstName, contactLastName, phone

FROM customers

WHERE city = 'Nantes';

select * from customer_views;

-- xoa view
DROP VIEW customer_views;