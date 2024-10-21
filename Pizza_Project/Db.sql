drop database if exists pizzastore;

create database pizzastore;

use pizzastore;

CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    username VARCHAR(50) UNIQUE,
    password VARCHAR(255),
    email VARCHAR(100) UNIQUE,
    gender VARCHAR(10),
    date_of_birth DATE,
    domain VARCHAR(50),
    status ENUM('ACTIVE', 'INACTIVE') DEFAULT 'ACTIVE',
    phone_no VARCHAR(20)
);

CREATE TABLE admins (
    admin_id INT AUTO_INCREMENT PRIMARY KEY,
    admin_name VARCHAR(50),
    admin_username VARCHAR(50) UNIQUE,
    admin_password VARCHAR(255),
    status ENUM('ACTIVE', 'INACTIVE') DEFAULT 'ACTIVE'
);

drop table if exists Menu;

Create Table Menu
(
   menu_id INT AUTO_INCREMENT PRimary Key,
   item_name varchar(30) NOT NULL,
   category varchar(30),
   price numeric(9,2),
   admin_id INT
);