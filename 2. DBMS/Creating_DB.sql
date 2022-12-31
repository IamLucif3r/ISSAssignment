-- Creating a Database
CREATE DATABASE users;

-- Selecting which 'users' database to use
USE users;

-- show tables present inside the 'user' database
SHOW tables;

-- Creating a table within database
CREATE TABLE form(
	userName VARCHAR(255) NOT NULL,
    userEmail VARCHAR(255) PRIMARY KEY ,
    userPassword VARCHAR(255) NOT NULL);

-- describe a table
DESCRIBE form;

-- Delete/Drop a table
DROP TABLE form;

-- Insert values into the table
INSERT INTO form VALUES("Anmol Singh Yadav", "sanmol016@gmail.com", "test123@"),
	("IamLucif3r", "iamlucif3r@gmail.com", "password123"));
