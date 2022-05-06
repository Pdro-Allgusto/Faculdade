package Ordenacao;

public class testeLista {
    private static listaEstatica listaE;
    private static listaDinamica listaD;

    public static void main(String[] args) {

		System.out.println("\n>>>LISTA ESTATICA<<<\n");

		listaE = new listaEstatica(4);

		System.out.println("A Lista esta vazia? " + listaE.vazia());
		System.out.println("Frente da Lista: " + listaE.consultarInicio());
		System.out.println();

		listaE.inserir("A");
		listaE.inserir("B");
		listaE.inserir("C");
		listaE.inserir("D");
		listaE.inserir("E");
		System.out.println("A Lista esta vazia? " + listaE.vazia());
		System.out.println("Conteudo da Lista: " + listaE.toString());
		System.out.println("Tamanho da Lista: " + listaE.tamanho());
		System.out.println("O primeiro item da Lista: " + listaE.consultarInicio());
		System.out.println("O ultimo item da Lista: " + listaE.consultarFim());
		System.out.println("Retirando o primeiro item da Lista!");
		listaE.retirarInicio();
		System.out.println("Retirando o ultimo item da Lista!");
		listaE.retirarFim();
		System.out.println("Retirando o primeiro item da Lista!");
		listaE.retirarInicio();
		System.out.println("Retirando o ultimo item da Lista!");
		listaE.retirarFim();
		System.out.println("Tamanho da Lista: " + listaE.tamanho());
		System.out.println();

		listaE.inserir(1);
		listaE.inserir(2);
		listaE.inserir(3);
		listaE.inserir(4);
		listaE.inserir(5);
		System.out.println("O primeiro item da Lista: " + listaE.consultarInicio());
		System.out.println("O ultimo item da Lista: " + listaE.consultarFim());
		System.out.println("Limpando a lista!");
		listaE.limpar();
		System.out.println("Conteudo da Lista: " + listaE.toString());
		System.out.println("Tamanho da Lista: " + listaE.tamanho());
		System.out.println();

		System.out.println("O primeiro item da Lista: " + listaE.consultarInicio());
		System.out.println("O ultimo item da Lista: " + listaE.consultarFim());
		System.out.println("Limpando a lista!");
		listaE.limpar();
		System.out.println();

        System.out.println("\n>>>LISTA DINAMICA<<<\n");

        listaD = new listaDinamica();

        listaD.inserir("A");
        listaD.inserir("B");
        System.out.println("Conteudo da Lista: " + listaD.toString());
        System.out.println("Tamanho da Lista: " + listaD.tamanho());
        listaD.inserirInicio("C");
        System.out.println("Conteudo da Lista: " + listaD.toString());
        System.out.println("Tamanho da Lista: " + listaD.tamanho());
        listaD.inserirFim("D");
        System.out.println("Conteudo da Lista: " + listaD.toString());
        System.out.println("Tamanho da Lista: " + listaD.tamanho());
        listaD.inserirMeio("E");
        System.out.println("Conteudo da Lista: " + listaD.toString());
        System.out.println("Tamanho da Lista: " + listaD.tamanho());
        //listaD.inserirNaPosicao("F", 1000);
        System.out.println("Conteudo da Lista: " + listaD.toString());
        System.out.println("Tamanho da Lista: " + listaD.tamanho());
        System.out.println();

		System.out.println("Retirando o primeiro item da Lista!");
		listaD.retirarInicio();
		System.out.println("Conteudo da Lista: " + listaD.toString());
		System.out.println("Tamanho da Lista: " + listaD.tamanho());

		System.out.println("Retirando o ultimo item da Lista!");
		listaD.retirarFim();
		System.out.println("Conteudo da Lista: " + listaD.toString());
		System.out.println("Tamanho da Lista: " + listaD.tamanho());

		System.out.println("Retirando o meio item da Lista!");
		listaD.retirarMeio();
		System.out.println("Conteudo da Lista: " + listaD.toString());
		System.out.println("Tamanho da Lista: " + listaD.tamanho());

		System.out.println("Retirando o item da Lista  na posi��o -1!");
		listaD.retirarNaPosicao(-1);
		System.out.println("Conteudo da Lista: " + listaD.toString());
		System.out.println("Tamanho da Lista: " + listaD.tamanho());
		System.out.println();
    }
}

