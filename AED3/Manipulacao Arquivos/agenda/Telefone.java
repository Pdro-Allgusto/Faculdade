package agenda;

import java.io.*;

class Telefone implements Serializable {
    private String numero;

    public String toString() {
        return numero;
    }

    public Telefone(String numero) {
        setNumero(numero);
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
