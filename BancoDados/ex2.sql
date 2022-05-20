create database Form1
go

use Form1
go

create table PONTUACAO
(POSICAO 	int,
 PONTUACAO	int)	
go
	
create table EQUIPE
(EQUIPE_ID 	int primary key,	
 NOME	   	varchar(20))
go

create table PILOTO
(PILOTO_ID 	int primary key, 	
NOME		varchar(50),
PAIS_ORIGEM 	varchar(50),	
PONTOS		int,
EQUIPE_ID 	int foreign key references EQUIPE(EQUIPE_ID))
go

create table GRANDE_PREMIO
(GP_ID 		int primary key,	
 PAIS		varchar(50),
 DATA		datetime)
go

create table COLOCACAO
(PILOTO_ID	int foreign key references PILOTO(PILOTO_ID),
 GP_ID		int foreign key references GRANDE_PREMIO(GP_ID), 
 POSICAO	int
primary key (PILOTO_ID, GP_ID) 
)
go


insert into PONTUACAO (POSICAO, PONTUACAO) values (1, 10)
insert into PONTUACAO (POSICAO, PONTUACAO) values (2, 9)
insert into PONTUACAO (POSICAO, PONTUACAO) values (3, 8)
insert into PONTUACAO (POSICAO, PONTUACAO) values (4, 3)
insert into PONTUACAO (POSICAO, PONTUACAO) values (5, 2)
insert into PONTUACAO (POSICAO, PONTUACAO) values (6, 1)

insert into equipe (equipe_id, nome) values (1, 'Mc Laren')
insert into equipe (equipe_id, nome) values (2, 'Ferrari')
insert into equipe (equipe_id, nome) values (3, 'Williams')
insert into piloto (piloto_id, nome, pais_origem, equipe_id) values (1, 'Alain Prost', 'Fran�a', 1)
insert into piloto (piloto_id, nome, pais_origem, equipe_id) values (2, 'Ayrton Senna', 'Brasil', 1)
insert into piloto (piloto_id, nome, pais_origem, equipe_id) values (3, 'Rubens Barrichelo', 'Brasil', 2)
insert into piloto (piloto_id, nome, pais_origem, equipe_id) values (4, 'Michael Schumacher', 'Alemanha', 2)
insert into piloto (piloto_id, nome, pais_origem, equipe_id) values (5, 'Nigel Mansel', 'Inglaterra', 3)
insert into piloto (piloto_id, nome, pais_origem, equipe_id) values (6, 'Felipe Massa', 'Brasil', 3)

set dateformat mdy
insert into grande_premio (gp_id, pais, data) values (1, 'Brasil', '02/03/07')
insert into grande_premio (gp_id, pais, data) values (2, 'Alemanha', '03/04/07')
insert into grande_premio (gp_id, pais, data) values (3, 'Inglaterra', '03/15/07')

insert into colocacao (piloto_id, gp_id, posicao) values (1, 1, 3)
insert into colocacao (piloto_id, gp_id, posicao) values (2, 1, 1)
insert into colocacao (piloto_id, gp_id, posicao) values (3, 1, 6)
insert into colocacao (piloto_id, gp_id, posicao) values (4, 1, 2)
insert into colocacao (piloto_id, gp_id, posicao) values (5, 1, 4)
insert into colocacao (piloto_id, gp_id, posicao) values (6, 1, 5)
insert into colocacao (piloto_id, gp_id, posicao) values (1, 2, 5)
insert into colocacao (piloto_id, gp_id, posicao) values (2, 2, 2)
insert into colocacao (piloto_id, gp_id, posicao) values (3, 2, 4)
insert into colocacao (piloto_id, gp_id, posicao) values (4, 2, 3)
insert into colocacao (piloto_id, gp_id, posicao) values (5, 2, 1)
insert into colocacao (piloto_id, gp_id, posicao) values (6, 2, 6)
insert into colocacao (piloto_id, gp_id, posicao) values (1, 3, 5)
insert into colocacao (piloto_id, gp_id, posicao) values (2, 3, 3)
insert into colocacao (piloto_id, gp_id, posicao) values (3, 3, 1)
insert into colocacao (piloto_id, gp_id, posicao) values (4, 3, 4)
insert into colocacao (piloto_id, gp_id, posicao) values (5, 3, 6)
insert into colocacao (piloto_id, gp_id, posicao) values (6, 3, 2)


select *
from equipe --, GRANDE_PREMIO, COLOCACAO, PONTUACAO

-- 1 MC LAREN
-- 2 FERRARI
-- 3 WILLIANS


-- b)
select P.nome as Nome, P.PAIS_ORIGEM
from PILOTO P
WHERE P.EQUIPE_ID = 2

-- c)
select P.nome, P.PAIS_ORIGEM as PAIS_DE_ORIGEM, E.NOME
from PILOTO P, EQUIPE E
WHERE P.EQUIPE_ID = E.EQUIPE_ID


-- d)
select PAIS_ORIGEM, COUNT(*) "Quantidade Por País"
from PILOTO
GROUP BY PAIS_ORIGEM


--e) '____-03%'
select PAIS
from GRANDE_PREMIO G
WHERE DATEPART(MONTH, data) = 3
GROUP BY PAIS 

-- f)
select MAX(POSICAO) 
from COLOCACAO C
WHERE C.PILOTO_ID = 1

--exer3

--1)
select PILOTO_ID, NOME, PAIS_ORIGEM
from PILOTO
where NOME like 'A%' or NOME like 'F%'

--2)
select NOME, LEN(NOME) AS QTD_CARACTERES
from PILOTO

--3)
select REVERSE(NOME) as NOME_INVERTIDO
from PILOTO

--4)
SELECT NOME, right(NOME,3)
FROM EQUIPE

--5)
SELECT *
FROM GRANDE_PREMIO

select  MONTH(DATA), PAIS
from GRANDE_PREMIO 
GROUP BY DATA, PAIS
ORDER BY DATA DESC

--6)

select *
from GRANDE_PREMIO
where (PAIS like 'A%'  or PAIS like 'E%'  or PAIS like 'I%'   or PAIS like 'O%'  or PAIS like 'U%') AND DAY(DATA)<10 
 

--7)
SELECT DATEDIFF(MONTH, DATA, GETDATE() )
FROM GRANDE_PREMIO
