
select *
from equipe --, GRANDE_PREMIO, COLOCACAO, PONTUACAO

-- 1 MC LAREN
-- 2 FERRARI
-- 3 WILLIANS


-- B)
select P.nome as Nome, P.PAIS_ORIGEM
from PILOTO P
WHERE P.EQUIPE_ID = 2

-- C)
select P.nome, P.PAIS_ORIGEM as PAIS_DE_ORIGEM, E.NOME
from PILOTO P, EQUIPE E
WHERE P.EQUIPE_ID = E.EQUIPE_ID


-- D)
select PAIS_ORIGEM, COUNT(*) "Quantidade Por Pa�s"
from PILOTO
GROUP BY PAIS_ORIGEM


-- E) '____-03%'
select PAIS
from GRANDE_PREMIO G
WHERE DATEPART(MONTH, data) = 3
GROUP BY PAIS 

-- F)
select MAX(POSICAO) 
from COLOCACAO C
WHERE C.PILOTO_ID = 1
