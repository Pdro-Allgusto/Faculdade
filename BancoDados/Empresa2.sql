CREATE DATABASE EMPRESA2
GO

USE EMPRESA2
GO

CREATE TABLE FUNCIONARIO (
	FUNCIONARIO_ID	INT,
	PNOME			VARCHAR(255) NOT NULL,
	MINICIAL		CHAR(1),
	UNOME			VARCHAR(255) NOT NULL,
	CONSTRAINT PK_EMPREGADO PRIMARY KEY (FUNCIONARIO_ID),
);
GO

INSERT INTO FUNCIONARIO VALUES (1234567,'Jo�o','B','Silva')
INSERT INTO FUNCIONARIO VALUES (3334455,'Fernando','T','Wong')
INSERT INTO FUNCIONARIO VALUES (9998877,'Alice','J','Zelaya')
INSERT INTO FUNCIONARIO VALUES (9876543,'Jennifer','S','Souza')
INSERT INTO FUNCIONARIO VALUES (6668844,'Ronaldo','K','Lima')
INSERT INTO FUNCIONARIO VALUES (4534534,'Joice','A','Leite')
INSERT INTO FUNCIONARIO VALUES (9879879,'Andr�','V','Pereira')
INSERT INTO FUNCIONARIO VALUES (8886655,'Jorge','E','Brito')
GO

ALTER TABLE FUNCIONARIO ADD LOGIN VARCHAR(255);
GO

CREATE FUNCTION Remove_Acentuacao(@String VARCHAR(MAX))
RETURNS VARCHAR(MAX)
AS
BEGIN
    /**************************************************************************************/
    /** RETIRA ACENTUA��O DAS VOGAIS **/
    /**************************************************************************************/
    SET @String = REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(@String,'�','a'),'�','a'),'�','a'),'�','a'),'�','a')
    SET @String = REPLACE(REPLACE(REPLACE(REPLACE(@String,'�','e'),'�','e'),'�','e'),'�','e')
    SET @String = REPLACE(REPLACE(REPLACE(REPLACE(@String,'�','i'),'�','i'),'�','i'),'�','i')
    SET @String = REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(@String,'�','o'),'�','o'),'�','o'),'�','o'),'�','o')
    SET @String = REPLACE(REPLACE(REPLACE(REPLACE(@String,'�','u'),'�','u'),'�','u'),'�','u')
    
    /**************************************************************************************/
    /** RETIRA ACENTUA��O DAS CONSOANTES **/
    /**************************************************************************************/    
    SET @String = REPLACE(@String,'�','y')
    SET @String = REPLACE(@String,'�','n')
    SET @String = REPLACE(@String,'�','c')

    RETURN (@String) -- --RETURN UPPER(@String)
END
GO

-- Atualiza��o da tabela com inser��o do login de cada funcion�rio
DECLARE @id INT, 
		@pnome VARCHAR(255), 
		@minicial CHAR(1), 
		@sobrenome VARCHAR(50), 
		@login VARCHAR(255)

-- Declara��o do cursor 
-- Nesse � especificado qual consulta o cursor dever� manipular
DECLARE crs CURSOR FOR
SELECT FUNCIONARIO_ID, PNOME, MINICIAL, UNOME, LOGIN 
FROM FUNCIONARIO

-- Abre o cursor
OPEN crs 

-- Busca a primeira linha e preenche as vari�veis com
-- cada valor de cada campo da linha
FETCH crs 
INTO @id, @pnome, @minicial, @sobrenome, @login

-- Loop enquanto existem linhas
WHILE (@@FETCH_STATUS <> -1)
	BEGIN
		-- percorre linha a linha da tabela atualizando 
		-- o campo de login de cada funcion�rio
		UPDATE FUNCIONARIO 
		SET LOGIN = LOWER(dbo.Remove_Acentuacao(@pnome)) + '.' + 
					LOWER(dbo.Remove_Acentuacao(@sobrenome)) 
		WHERE FUNCIONARIO_ID = @id
		-- Busca cada linha da tabela e preenche as vari�veis com
		-- cada valor de cada campo da linha
		FETCH crs 
		INTO @id, @pnome, @minicial, @sobrenome, @login	
	END
	
-- Fecha o cursor
CLOSE crs
-- Remove a refer�ncia do cursor. 
DEALLOCATE crs
GO

SELECT * FROM FUNCIONARIO