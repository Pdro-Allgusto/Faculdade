package Ordenacao;

public class pilhaDinamica {
    private Celula topo;
    private int contador;

    public pilhaDinamica() {
        topo = null;
        contador = 0;
    }

    public boolean vazia() {
        return (topo == null);
    }

    public int tamanho() {
        return (contador);
    }

    public void empilhar(Object novoItem) {
        Celula novaCelula = new Celula(novoItem);
        novaCelula.link = topo;
        topo = novaCelula;
        contador++;
    }

    public Object desempilhar() {
        Object x = null;
        if (vazia()) {
            System.out.println("ERRO: pilha vazia!");
        } else {
            Celula tempCelula = topo;
            topo = topo.link;
            x = tempCelula.item;
        }
        return (x);
    }

    public Object consultarTopo() {
        Object x = null;
        if (vazia()) {
            System.out.println("ERRO: pilha vazia!");
        } else {
            x = topo.item;
        }
        return (x);
    }

    public Object copiar() {
        Ordenacao.pilhaDinamica tempPilha = new Ordenacao.pilhaDinamica();
        Ordenacao.pilhaDinamica copiaPilha = new Ordenacao.pilhaDinamica();
        while (!vazia()) {
            tempPilha.empilhar(desempilhar());

        }
        while (!tempPilha.vazia()) {
            Object x = tempPilha.desempilhar();
            empilhar(x);
            copiaPilha.empilhar(x);
        }
        return (copiaPilha);
    }

    public String toString() {
        String pilhaCheia = "";
        if (vazia()) {
            pilhaCheia = null;
        } else {
            Ordenacao.pilhaDinamica copiaPilha = (Ordenacao.pilhaDinamica) copiar();
            while (!copiaPilha.vazia()) {
                pilhaCheia += "\n" + copiaPilha.desempilhar();
            }
        }
        return (pilhaCheia);
    }

    public Object clonarPilha() {
        Ordenacao.pilhaDinamica temPilha = new Ordenacao.pilhaDinamica();
        Ordenacao.pilhaDinamica copia = new Ordenacao.pilhaDinamica();

        if (this.vazia()) {
            System.out.println("ERRO: Pilha vazia!");
        } else {
            while (!vazia()) {
                Object x = this.desempilhar();
                temPilha.empilhar(x);
            }
            while (!temPilha.vazia()) {
                Object x = temPilha.desempilhar();
                copia.empilhar(x);
                this.empilhar(x);
            }
        }
        return (copia);
    }
}
