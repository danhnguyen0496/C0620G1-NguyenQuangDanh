use classicmodels;


-- in 
DELIMITER //

CREATE PROCEDURE getCusById (IN cusNum INT)

BEGIN

  SELECT * FROM customers WHERE customerNumber = cusNum;

END //

DELIMITER ;

call getCusById(175);

-- out

DELIMITER //

CREATE PROCEDURE GetCustomersCountByCity(IN in_city VARCHAR(50), OUT total INT)

BEGIN

    SELECT COUNT(customerNumber)

    INTO total

    FROM customers

    WHERE city = in_city;

END//

DELIMITER ;

CALL GetCustomersCountByCity('Lyon',@total);

SELECT @total;

-- inout

DELIMITER //

CREATE PROCEDURE SetCounter(INOUT counter INT, IN inc INT)

BEGIN

    SET counter = counter + inc;

END//

DELIMITER ;

set @counter = 1;

CALL SetCounter(@counter,1); 

CALL SetCounter(@counter,1);

CALL SetCounter(@counter,5); 

SELECT @counter;