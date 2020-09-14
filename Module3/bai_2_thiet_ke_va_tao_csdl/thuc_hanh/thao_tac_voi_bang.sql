CREATE DATABASE thaotacvoibang;
DROP DATABASE thaotacvoibang;

-- tạo bảng 
use thaotacvoibang;
CREATE TABLE contacts (
contact_id INT(11) NOT NULL AUTO_INCREMENT,
last_name VARCHAR(30) NOT NULL,
first_name VARCHAR(25),
birthday DATE,
CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);

-- xóa bảng
DROP TABLE contacts;
DROP TABLE suppliers;

-- chỉnh sửa bảng

-- thêm 
ALTER TABLE contacts
  ADD middle_name varchar(40) NOT NULL
    AFTER contact_id,
  ADD first_last_name varchar(35) NULL
    AFTER last_name;
-- chỉnh sửa
ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;
  -- xóa cột
  ALTER TABLE contacts
  DROP COLUMN first_last_name;
  -- thay đổi tên cột
  ALTER TABLE contacts
  CHANGE COLUMN last_name last_name_new VARCHAR(20) NOT NULL;
-- đổi tên bảng
ALTER TABLE contacts
  RENAME TO people;