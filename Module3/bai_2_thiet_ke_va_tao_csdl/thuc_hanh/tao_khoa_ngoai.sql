create database khoangoai;
-- drop database khoangoai;
use khoangoai;

create table customers (
id int auto_increment primary key,
`name` varchar (40),
`address` varchar (255),
`email` varchar (255)
);

-- bi loi
-- CREATE TABLE orders(
--    id INT AUTO_INCREMENT,
--    staff VARCHAR(50),
--    PRIMARY KEY(id),
--    customer_id INT foreign key references customers(id)
-- );

create table orders (
id int auto_increment,
staff varchar (50),
primary key (id),
customer_id int,
 foreign key(customer_id) references customers(id)  
);