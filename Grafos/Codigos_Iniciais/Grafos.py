#---
#--- Disciplina: Teoria de Grafos - Prof. Marcos W. Rodrigues
#---

#Matriz de adjacências
#Número de vértices n
#Número de arestas e
#Grau de vértices d(G)

#--- Pacotes do Python

import numpy as np
import pandas as pd
import csv

#--- Matriz de adjacências

# Abre matriz de adjacencia sem rotulos
K5 = pd.read_csv("K5.csv", sep=';', header=None, engine='python')
K5

# Abre matriz de adjacencia com rotulos
n3e2 = pd.read_csv("n3e2.csv", sep=';', header=0, engine='python')
n3e2

# Abre matriz de adjacencia com rotulos
n4e5 = pd.read_csv("n4e5.csv", sep=';', header=0, engine='python')
n4e5

#--- Implementacoes basicas


numeroVertices = len(K5.index)
print("Numero de vertices:", numeroVertices)


numeroArestas = (K5.sum(axis=0).sum() / 2)
print("Numero de arestas:", numeroArestas)


grausVertices = n4e5.sum(axis=0)
print("Graus dos vertices:", np.array(grausVertices))

