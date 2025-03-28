DROP DATABASE IF EXISTS AM_DB_25_03;
CREATE DATABASE AM_DB_25_03;
USE AM_DB_25_03;

CREATE TABLE article(
   title VARCHAR (100),
   `body` TEXT
);

SHOW TABLES ;

desc article;

INSERT INTO article
SET title = `제목`,
    `body` = `내용`;