-- SELECT statement is used to get all the data from a table. 
SELECT * FROM employees;

-- DISTINCT statement is used to get unique country name and states from the table.
SELECT DISTINCT country, postalCode FROM customers;

-- WHERE, AND/OR, ORDER BY, INSERT UPDATE, DELETE, INJECTION, SELECT TOP, WILDCARDS, LIKE, IN , BETWEEN, ALIASES
SELECT employeeNumber, lastName, firstName FROM employees 
WHERE reportsTo IN (SELECT employeeNumber FROM employees WHERE jobTitle = "Engineer");

-- Printing all Values from the table Product
SELECT * FROM products; 

-- Finding all cars made by Maruti
SELECT * FROM products
WHERE productName Like "%Maruti%"
ORDER BY buyPrice DESC;

SELECT customerNumber, COUNT(orderNumber) as Total_Orders FROM orders
WHERE orders.status = "Delivered" 
GROUP BY customerNumber;
