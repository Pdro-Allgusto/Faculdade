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
