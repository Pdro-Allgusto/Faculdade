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

INSERT INTO FUNCIONARIO VALUES (1234567,'João','B','Silva')
INSERT INTO FUNCIONARIO VALUES (3334455,'Fernando','T','Wong')
INSERT INTO FUNCIONARIO VALUES (9998877,'Alice','J','Zelaya')
INSERT INTO FUNCIONARIO VALUES (9876543,'Jennifer','S','Souza')
INSERT INTO FUNCIONARIO VALUES (6668844,'Ronaldo','K','Lima')
INSERT INTO FUNCIONARIO VALUES (4534534,'Joice','A','Leite')
INSERT INTO FUNCIONARIO VALUES (9879879,'André','V','Pereira')
INSERT INTO FUNCIONARIO VALUES (8886655,'Jorge','E','Brito')
GO

ALTER TABLE FUNCIONARIO ADD LOGIN VARCHAR(255);
GO

CREATE FUNCTION Remove_Acentuacao(@String VARCHAR(MAX))
RETURNS VARCHAR(MAX)
AS
BEGIN
    /**************************************************************************************/
    /** RETIRA ACENTUAÇÃO DAS VOGAIS **/
    /**************************************************************************************/
    SET @String = REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(@String,'á','a'),'à','a'),'â','a'),'ã','a'),'ä','a')
    SET @String = REPLACE(REPLACE(REPLACE(REPLACE(@String,'é','e'),'è','e'),'ê','e'),'ë','e')
    SET @String = REPLACE(REPLACE(REPLACE(REPLACE(@String,'í','i'),'ì','i'),'î','i'),'ï','i')
    SET @String = REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(@String,'ó','o'),'ò','o'),'ô','o'),'õ','o'),'ö','o')
    SET @String = REPLACE(REPLACE(REPLACE(REPLACE(@String,'ú','u'),'ù','u'),'û','u'),'ü','u')
    
    /**************************************************************************************/
    /** RETIRA ACENTUAÇÃO DAS CONSOANTES **/
    /**************************************************************************************/    
    SET @String = REPLACE(@String,'ý','y')
    SET @String = REPLACE(@String,'ñ','n')
    SET @String = REPLACE(@String,'ç','c')

    RETURN (@String) -- --RETURN UPPER(@String)
END
GO

-- Atualização da tabela com inserção do login de cada funcionário
DECLARE @id INT, 
		@pnome VARCHAR(255), 
		@minicial CHAR(1), 
		@sobrenome VARCHAR(50), 
		@login VARCHAR(255)

-- Declaração do cursor 
-- Nesse é especificado qual consulta o cursor deverá manipular
DECLARE crs CURSOR FOR
SELECT FUNCIONARIO_ID, PNOME, MINICIAL, UNOME, LOGIN 
FROM FUNCIONARIO

-- Abre o cursor
OPEN crs 

-- Busca a primeira linha e preenche as variáveis com
-- cada valor de cada campo da linha
FETCH crs 
INTO @id, @pnome, @minicial, @sobrenome, @login

-- Loop enquanto existem linhas
WHILE (@@FETCH_STATUS <> -1)
	BEGIN
		-- percorre linha a linha da tabela atualizando 
		-- o campo de login de cada funcionário
		UPDATE FUNCIONARIO 
		SET LOGIN = LOWER(dbo.Remove_Acentuacao(@pnome)) + '.' + 
					LOWER(dbo.Remove_Acentuacao(@sobrenome)) 
		WHERE FUNCIONARIO_ID = @id
		-- Busca cada linha da tabela e preenche as variáveis com
		-- cada valor de cada campo da linha
		FETCH crs 
		INTO @id, @pnome, @minicial, @sobrenome, @login	
	END
	
-- Fecha o cursor
CLOSE crs
-- Remove a referência do cursor. 
DEALLOCATE crs
GO

SELECT * FROM FUNCIONARIO