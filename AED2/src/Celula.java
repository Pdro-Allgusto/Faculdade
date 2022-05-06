package Ordenacao;

public class Celula {
    Object item;
    Ordenacao.Celula link;

    public Celula() {
        item = null;
        link = null;
    }

    public Celula(Object ValorItem) {
        item = ValorItem;
        link = null;
    }

    public Celula(Object ValorItem, Ordenacao.Celula linkCelula) {
        item = ValorItem;
        link = linkCelula;
    }
}