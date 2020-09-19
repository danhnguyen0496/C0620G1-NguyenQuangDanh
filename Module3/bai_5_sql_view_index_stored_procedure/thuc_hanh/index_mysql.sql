use classicmodels;

select * from customers where customerNumber = 175;

explain select * from customers where customerNumber = 175;

EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;

EXPLAIN SELECT * FROM customers WHERE contactLastName = 'King' and contactFirstName='Julie';

ALTER TABLE customers ADD INDEX idx_full_name(contactFirstName, contactLastName);

EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';

ALTER TABLE customers DROP INDEX idx_full_name;

