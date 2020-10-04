drop database if exists demo;

create database demo;

use demo;

create table users (
id int not null auto_increment,
`name` varchar(120) not null,
email varchar(120) not null,
country varchar(120),
primary key (id)
); 

insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');


DELIMITER $$
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN
    SELECT users.name, users.email, users.country
    FROM users
    where users.id = user_id;
    END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE insert_user(
IN user_name varchar(50),
IN user_email varchar(50),
IN user_country varchar(50)
)
BEGIN
    INSERT INTO users(`name`, email, country) VALUES(user_name, user_email, user_country);
    END$$
DELIMITER ;


delimiter //
create procedure display_list_users()
begin
	select *
    from users;
end //
delimiter ;

drop procedure if exists edit_users;
delimiter //
create procedure edit_users(
IN user_name varchar(50),
IN user_email varchar(50),
IN user_country varchar(50),
IN id_user int
)
begin
	update users
    set 
    name = user_name,
    email = user_email,
    country = user_country
    where id = id_user;
end //
delimiter ;


delimiter //
create procedure delete_users(in id_user int)
begin
	delete from users
    where id = id_user;
end //
delimiter ;