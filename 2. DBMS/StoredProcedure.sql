
-- Procedure to get all product details and find the top'N' products sold.
DELIMITER &&  
CREATE PROCEDURE top_product (IN var1 INT)  
BEGIN  
    SELECT * FROM products LIMIT var1;  
    SELECT COUNT(orderNumber) AS quality 
    FROM orders
    GROUP BY productCode
    ORDER BY quality DESC
    LIMIT var1;    
END &&  
DELIMITER ;  

-- Run the store procedure
CALL top_product(5);
