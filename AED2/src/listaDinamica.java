package Ordenacao;

public class listaDinamica {
    private Celula inicio;
    private Celula fim;
    private int contador;

    public listaDinamica() {
        inicio = null;
        fim = null;
        contador = 0;
    }

    public boolean vazia() {
        return (contador == 0);
    }

    public int tamanho() {
        return (contador);
    }

    private boolean chaveValida(int x) {
        return (1 <= x && x <= contador);
    }

    public void inserir(Object newItem, int posicao) {
        Celula newCelula, tempCelula;
        int i;

        if (posicao == contador + 1) {
            newCelula = new Celula(newItem);
            if (inicio == null) {
                inicio = newCelula;
            } else {
                fim.link = newCelula;
            }
            fim = newCelula;
            contador++;
        } else {
            if (posicao == 1) {
                newCelula = new Celula(newItem, inicio);
                if (fim == null) {
                    fim = newCelula;
                }
                inicio = newCelula;
                contador++;
            } else {
                if (!chaveValida(posicao)) {
                    System.out.println("ERRO:Indice invalido!");
                } else {
                    tempCelula = inicio;
                    for (i = 1; i < posicao; i++) {
                        tempCelula = tempCelula.link;
                    }
                    newCelula = new Celula(tempCelula.item, tempCelula.link);
                    tempCelula.link = tempCelula;
                    if (tempCelula == fim) {
                        fim = newCelula;
                    }
                    tempCelula.item = newItem;
                    contador++;
                }
            }
        }
    }

    public void inserir(Object newItem) {
        inserir(newItem, contador + 1);
    }

    public void inserirInicio(Object newItem) {
        inserir(newItem, 1);
    }

    // nao funciona
    public void inserirMeio(Object newItem) {
        int x;
        x = contador % 2;
        inserir(newItem, x);
    }

    public void inserirFim(Object newItem) {
        inserir(newItem, contador + 1);
    }

    public Object retirar(int posicao) {
        Object x = null;
        Celula tempCelula;
        int i;
        if (vazia()) {
            System.out.println("ERRO: Lista vazia!");
        } else {
            if (posicao == 1) {
                x = inicio.item;
                inicio = inicio.link;
                if (inicio == null) {
                    fim = null;
                }
                contador--;
            } else {
                if (posicao == contador) {
                    tempCelula = inicio;
                    for (i = 1; i < contador - 1; i++) {
                        tempCelula = tempCelula.link;
                    }
                    x = fim.item;
                    fim = tempCelula;
                    if (fim == null) {
                        inicio = fim;
                    } else {
                        fim.link = null;
                    }
                    contador--;
                } else {
                    if (!chaveValida(posicao)) {
                        System.out.println("ERRO:Indice invalido!");
                    } else {
                        tempCelula = inicio;
                        for (i = 1; i < posicao - 1; i++) {
                            tempCelula = tempCelula.link;
                        }
                        x = tempCelula.link.item;
                        tempCelula.link = tempCelula.link.link;
                        contador--;
                    }
                }
            }
        }
        return (x);
    }

    public Object retirar() {
        return (retirar(1));
    }

    public Object retirarInicio() {
        return (retirar(1));
    }

    public Object retirarMeio() {
        int x = contador % 2;
        return (retirar(x));
    }

    public Object retirarFim() {
        return (retirar(contador));
    }

    public Object retirarNaPosicao(int posicao) {
        return (retirar(posicao));
    }

    public String toString() {
        String listaCompleta = "[";
        if (vazia()) {
            listaCompleta = listaCompleta + null;
        } else {
            Celula listCelula = inicio;
            while (listCelula != null) {
                listaCompleta = listaCompleta + " " + listCelula.item;
                listCelula = listCelula.link;
            }
            listaCompleta = listaCompleta + " ]";
        }
        return (listaCompleta);
    }

}

