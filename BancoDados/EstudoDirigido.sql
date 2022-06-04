--Declare variables and retrieve values
DECLARE
@num1 int,
@num2 int;
SET @num1 = 4;
SET @num2 = 6;
SELECT @num1 + @num2 AS totalnum;

--Use variables with batches
DECLARE 
@empname nvarchar(30),
@empid int;
SET @empid = 5;
SET @empname = (SELECT FirstName + N' ' + LastName FROM SalesLT.Customer WHERE CustomerID = @empid)
SELECT @empname AS employee;

--Write basic conditional logic
DECLARE 
@i int = 8,
@result nvarchar(20);
IF @i < 5    
SET @result = N'Less than 5'
ELSE IF @i <= 10    
SET @result = N'Between 5 and 10'
ELSE if @i > 10    
SET @result = N'More than 10'
ELSE    
SET @result = N'Unknown';
SELECT @result AS result;

--Execute loops with WHILE statements
DECLARE 
@i2 int = 1;
WHILE @i2 <= 10
BEGIN    
PRINT @i2;    
SET @i2 = @i2 + 1;
END;

--Assignment of values to variables
DECLARE 
@salesOrderNUmber nvarchar(30),
@customerID int;
SET @customerID = 29847;
SET @salesOrderNUmber = (SELECT salesOrderNumber FROM SalesLT.SalesOrderHeader WHERE CustomerID = @customerID)
SELECT @salesOrderNUmber as OrderNumber;

--First 10 customers that registered and made purchases online as part of a promotion
DECLARE @customerID2 AS INT = 1;
DECLARE @fname AS NVARCHAR(20);
DECLARE @lname AS NVARCHAR(30);
WHILE @customerID2 <=10
BEGIN    
SELECT @fname = FirstName, 
@lname = LastName 
FROM SalesLT.Customer        
WHERE CustomerID = @customerID2;    
PRINT @fname + N' ' + @lname;    
SET @customerID2 += 1;END;