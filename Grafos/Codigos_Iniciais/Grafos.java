
/*
 * Pacotes necessarios para o desenvolvimento dos algoritmos da disciplina de Teoria de Grafos
 *
 * IMPORTANTE: TODA IMPLEMENTACAO NAO DEVE UTILIZAR PACOTES PRONTOS QUE POSSUAM ALGORITMOS DE GRAFOS!
 *
 */

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * Classe principal (publica): Responsavel por executar os codigos implementados na classe TGrafo.
 */

public class Grafos {
	
	public static void main(String[] args) {
		
		//--- O grafo K5 eh atribuido para o objeto g1
		
		TGrafo g1 = new TGrafo("K5.csv"); // Objeto g1 instanciado e inicializado para o grafo K5
		
		System.out.println(g1.toString()); // Exibe info do grafo g1
		
		// Outro modo de obter e exibir a info do grafo G
		//System.out.println( "Matriz do grafo K5:\n" + g1.exibirMatrix(g1.getMatrizAdjacencias()) );
		//System.out.println( "Numero de vertices: " + g1.getNumVertices() );
		//System.out.println( "Numero de arestas: " + g1.getNumArestas() );
		//System.out.println( "Grau dos vertices: " + g1.exibirVetor(g1.getGrausVertices()) );
		System.out.println( "Grau do vertice 2: " + g1.getGrauVertice(2) );
		
		//--- Outros grafos...
		
		//TGrafo g2 = new TGrafo("n3e2.csv");
		
		//TGrafo g3 = new TGrafo("n4e5.csv");
}

/*
 * Classe TGrafo onde os codigos devem ser implementados.
 */

class TGrafo {
    
	private int        numVertices;         // qtde de vertices
	private int        numArestas;          // qtde de arestas
	private String[]   vertices; 			// array que armazena o nome de cada vertice
	private String[]   arestas; 			// array que armazena o nome de cada aresta
	private int[][]    matrizAdjacencias; 	// matriz de adjacencias numvertices X numvertices
	private int[][]    matrizPesos; 	    // matriz de pesos

	private int grausVertices[];			// grau de todos os vertices

    //------------------------------------------------------------------------------

	public Grafos(){}
	
	public Grafos(String nomearquivo){
		this.lerArquivo(nomearquivo);
	}
	
	//----------------------------------------
	
	private void setNumVertices(int numVertices){
		this.numVertices = numVertices;
	}
	public int getNumVertices(){
		return(this.numVertices);
	}

	private void setNumArestas(int numArestas){
		this.numArestas = numArestas;
	}
	public int getNumArestas(){
		return(this.numArestas);
	}

	private void setVertices(String[] vertices){
		this.vertices = vertices;
	}
	public String[] getVertices(){
		return(this.vertices);
	}
	
	/*private void setArestas(String[] arestas){
		this.arestas = arestas;
	}*/
	public String[] getArestas(){
		return(this.arestas);
	}

	public int[][] getMatrizAdjacencias(){
		return(this.matrizAdjacencias);
	}
	
	public int getGrauVertice(int vertice){
		int grau = 0;
		for(int i = 0; i < this.vertices.length; i++){
			if(this.matrizAdjacencias[vertice][i] == 1){
				grau++;
			}
		}
		return(grau);
	}
	
	//Grau de todos os vertices - OK!
	public int[] getGrausVertices(){
		this.grausVertices = new int[this.getNumVertices()];
		if(this.getNumVertices() > 0){
			for(int i = 0; i < this.getNumVertices(); i++){
				this.grausVertices[i] = this.getGrauVertice(i);
			}
		}else{
			System.out.println("ERRO: Nao existem vertices no grafo!");
		}
		return(this.grausVertices);
	}
	
    //------------------------------------------------------------------------------

	public void lerArquivo(String nomearquivo) {
		try {
			RandomAccessFile arqEntrada = new RandomAccessFile(new File(nomearquivo), "r");

			// Rotulo dos vertices
			String linha = arqEntrada.readLine();
			String vertices[] = linha.split(";");
			this.setVertices(vertices);
			
			this.setNumVertices( vertices.length ); // Qtde de vertices
			
			this.matrizAdjacencias = new int[this.numVertices][this.numVertices];
			this.matrizPesos = new int[this.numVertices][this.numVertices];
			
			linha = arqEntrada.readLine();
			int nLin = 0; // Primeia linha da matriz
			while (linha != null) {
				String lin[] = linha.split(";");
				for (int j = 0; j < lin.length; j++) {
					if(lin[j].equals("0")) {
						this.matrizPesos[nLin][j] = 0;
						this.matrizAdjacencias[nLin][j] = 0;
					}else{
						this.matrizPesos[nLin][j] = Integer.parseInt(lin[j]);
						this.matrizAdjacencias[nLin][j] = 1;
						this.numArestas++;
					}
				}
				nLin++;
				linha = arqEntrada.readLine();
			}
			this.setNumArestas(this.numArestas); // Qtde de arestas
			this.grausVertices = this.getGrausVertices(); // Grau de todos os vertices

			arqEntrada.close();

		} catch (IOException e) {
			System.out.println("ERRO: Leitura de arquivo invalida!");
		} catch (NumberFormatException e) {
			System.out.println("ERRO: Formato de numero invalido!");
		}
	}
        
    //------------------------------------------------------------------------------
    // ALGORITMOS EM GRAFOS
    //------------------------------------------------------------------------------
    
	//--- BUSCA EM GRAFOS
	
    /*public String buscaAmplitude(String verticeInicial){ 
    	
    }
    private void BFS(int verticeInicial) {
    	
    }
    */
	
    /*public String buscaProfundidade(String verticeInicial){ 
    	
    }
    private void DFS(int verticeInicial) {
    	
    }
    */
	
	//--- CAMINHOS MINIMOS
    
    /*public String Dijkstra(String verticeInicial){ 
    	
    }
    */

    /*public String Bellman_Ford(String verticeInicial){ 
    	
    }
    */
	
    /*public String Floyd_Warshall(String verticeInicial){
    	
    }
    */
	
	//--- ARVORE GERADORA MINIMA (AGM)
	
    /*public String Kruskal(String verticeInicial){ 
    	
    }
    */

    /*public String Prim(String verticeInicial){ 
    	
    }
    */
	
	//--- FLUXO MAXIMO

    /*public String Ford_Fulkerson(String verticeInicial){ 
    	
    }
    */
	
	/*public String Edmonds-Karp(String verticeInicial){ 
    	
    }
    */
	
	//--- COMPONENTES FORTEMENTE CONECTADOS

    /*public String Kosaraju(String verticeInicial){ 
    	
    }
    */

    //------------------------------------------------------------------------------
    // METODOS AUXILIARES
	//------------------------------------------------------------------------------

    public String exibirVetor(int[] vet) {
        String res = "";
        for (int i = 0; i < vet.length; i++) {
            res += ((i < (vet.length - 1)) ? vet[i] + "-" : vet[i]);
        }
        return (res);
    }

    public String exibirMatrix(int[][] mat) {
        String res = "";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res += ((j < (mat[0].length - 1)) ? mat[i][j] + "  " : mat[i][j]);
            }
            res += ((i < (mat.length - 1)) ? "\n" : "");
        }
        return (res);
    }
    
	public String toString(){
		return(">>> Classe Grafos (G) <<<" + "\n\n" + 
				"Matriz de adjacencias  :\n" + this.exibirMatrix(this.getMatrizAdjacencias()) + "\n" + 
				"Numero de vertices (n) : " + this.getNumVertices() + "\n" + 
				"Numero de arestas (e)  : " + this.getNumArestas() + "\n" + 
				"Graus dos vertices de G: " + this.exibirVetor(this.getGrausVertices()) + "\n"
		);
	}	
}