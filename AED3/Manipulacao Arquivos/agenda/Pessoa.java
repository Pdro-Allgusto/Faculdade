package agenda;

import java.io.Serializable;

class Pessoa implements Serializable {

    private int id;
    private String nome;

    public Pessoa(int id, String nome) {
        setId(id);
        setNome(nome);
    }

    public String toString() {
        return "Id: " + id + " - Nome: " + nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
