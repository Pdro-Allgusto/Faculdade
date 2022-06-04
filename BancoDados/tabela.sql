CREATE TABLE EMPREGADO (
	PNOME VARCHAR (255) NOT NULL,
	MINICIAL CHAR,
	UNOME VARCHAR (255) NOT NULL,
	DATANASC DATE,
	ENDERECO VARCHAR(255) NOT NULL,
	SEXO CHAR, 
		CHECK (SEXO = 'M' OR SEXO = 'F'),
	SALARIO FLOAT NOT NULL,
		CHECK (SALARIO >= 0),
	DNO INT, 
		CHECK (DNO > 0),
	SUPERSSN INT NOT NULL,
	SSN INT PRIMARY KEY,
	CONSTRAINT CODSSN
		FOREIGN KEY (SUPERSSN)
		REFERENCES EMPREGADO (SSN),
)

CREATE TABLE DEPARTAMENTO (
	DNOME VARCHAR(255) NOT NULL,
	DNUMERO INT PRIMARY KEY,
		CHECK (DNUMERO > 0),
	GERSSN INT,
	GERDATAINICIO DATE,
	
)

ALTER TABLE EMPREGADO 
	ADD CONSTRAINT FK_DNO 
	FOREIGN KEY (DNO) 
	REFERENCES DEPARTAMENTO (DNUMERO)

ALTER TABLE DEPARTAMENTO
	ADD CONSTRAINT FK_GSSN 
	FOREIGN KEY (GERSSN) 
	REFERENCES EMPREGADO (SSN)

CREATE TABLE DEPTO_LOCALIZACOES (
	DNUMERO INT,
	DLOCALIZACAO VARCHAR(255),
	PRIMARY KEY(DNUMERO, DLOCALIZACAO)
)


ALTER TABLE DEPTO_LOCALIZACOES
	ADD CONSTRAINT FK_DPTLOC
	FOREIGN KEY (DNUMERO) 
	REFERENCES DEPARTAMENTO (DNUMERO)

CREATE TABLE PROJETO (
	PJONOME VARCHAR (255),
	PNUMERO INT PRIMARY KEY,
	PLOCALIZACAO VARCHAR(255),
	DNUM INT
)


ALTER TABLE PROJETO
	ADD CONSTRAINT FK_PRJNUM 
	FOREIGN KEY (DNUM) 
	REFERENCES DEPARTAMENTO (DNUMERO)

CREATE TABLE TRABALHA_EM (
	ESSN INT,
	PNO INT,
	HORAS FLOAT,
	PRIMARY KEY (ESSN, PNO)
)


ALTER TABLE TRABALHA_EM
	ADD CONSTRAINT FK_EMPSSN
	FOREIGN KEY (ESSN) 
	REFERENCES EMPREGADO(SSN)


ALTER TABLE TRABALHA_EM
	ADD CONSTRAINT FK_TRBEPNO 
	FOREIGN KEY (PNO) 
	REFERENCES PROJETO (PNUMERO)



CREATE TABLE DEPENDENTE (
	ESSN INT,
	NOME_DEPENDENTE VARCHAR(255),
	SEXO CHAR, 
		CHECK (SEXO = 'M' OR SEXO = 'F'),
	DATANASC DATE,
	PRIMARY KEY(ESSN, NOME_DEPENDENTE)
)