CREATE DATABASE ormlearn;
USE ormlearn;
SELECT * FROM country;
CREATE TABLE country (
  co_code VARCHAR(2) PRIMARY KEY,
  co_name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India');
USE ormlearn;

