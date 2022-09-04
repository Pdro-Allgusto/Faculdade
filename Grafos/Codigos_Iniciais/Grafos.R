
#---
#--- Disciplina: Teoria de Grafos (prof. Marcos W. Rodrigues)
#---

#Matriz de adjacências
#Número de vértices n
#Número de arestas e
#Grau de vértices d(G)


#--- Pacotes de R

#install.packages('readr') # Para carregar a matriz de adjacencias
library(readr)


#--- Matriz de adjacencia

# Abre matriz de adjacencia sem rotulos
abrirMatrizAdjacencia_SemRotulo <- function(file){
  mtxAdj <- data.frame(read_delim(file=paste0(path, file, sep=""), delim=';', col_names=FALSE, quote="", locale=locale(asciify=TRUE), trim_ws=TRUE))
  return(mtxAdj)
}
K5 <- abrirMatrizAdjacencia_SemRotulo(file='K5.csv')

# Abre matriz de adjacencia com rotulos
abrirMatrizAdjacencia_ComRotulo <- function(file){
  mtxAdj <- data.frame(read_delim(file=paste0(path, file, sep=""), delim=';', col_names=TRUE, quote="", locale=locale(asciify=TRUE), trim_ws=TRUE))
  row.names(mtxAdj) <- colnames(mtxAdj)
  return(mtxAdj)
}
n3e2 <- abrirMatrizAdjacencia_ComRotulo(file='n3e2.csv')
n4e5 <- abrirMatrizAdjacencia_ComRotulo(file='n4e5.csv')



#--- Implementacoes basicas



numeroVertices <- function(mtxAdj){
  nN <- ncol(mtxAdj)
  return(nN)
}
n <- numeroVertices(K5)
cat("Numero de vertices:", n)


numeroArestas <- function(mtxAdj){
  nE <- sum(colSums(mtxAdj == 1)) / 2
  return(nE)
}
e <- numeroArestas(K5)
cat("Numero de arestas:", e)


grausVertices <- function(mtxAdj){
  dg <- as.numeric(colSums(mtxAdj))
  return(dg)
}
dG <- grausVertices(n4e5)
cat("Graus dos vertices:", dG)
dG <- grausVertices(n3e2)
cat("Graus dos vertices:", dG)

