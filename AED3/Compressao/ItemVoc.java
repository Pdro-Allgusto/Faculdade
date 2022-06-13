package huffman.versaoziviani;


public class ItemVoc implements Item {
    private String palavra;
    private int freq, ordem;

    // @{\it outros componentes do registro}@
    public ItemVoc(String palavra, int freq, int ordem) {
        this.palavra = palavra;
        this.freq = freq;
        this.ordem = ordem;
    }

    public int compara(Item it) {
        ItemVoc item = (ItemVoc) it;
        if (this.freq < item.freq) return 1;
        else if (this.freq > item.freq) return -1;
        return 0;
    }

    public void alteraChave(Object freq) {
        Integer ch = (Integer) freq;
        this.freq = ch.intValue();
    }

    public Object recuperaChave() {
        return this.freq;
    }

    public void alteraOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int recuperaOrdem() {
        return this.ordem;
    }

    public String palavra() {
        return this.palavra;
    }
}