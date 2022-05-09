import java.io.*;

public class Acao implements Serializable {
    private int codigoAcao;
    private String nomeAcao;
    private float valorAcao;

    public Acao() {
    }

    public Acao(int codigoAcao, String nomeAcao, float valorAcao) {
        this.codigoAcao = codigoAcao;
        this.nomeAcao = nomeAcao;
        this.valorAcao = valorAcao;
    }

    public int getCodigoAcao() {
        return codigoAcao;
    }

    public void setCodigoAcao(int codigoAcao) {
        this.codigoAcao = codigoAcao;
    }

    public String getNomeAcao() {
        return nomeAcao;
    }

    public void setNomeAcao(String nomeAcao) {
        this.nomeAcao = nomeAcao;
    }

    public float getValorAcao() {
        return valorAcao;
    }

    public void setValorAcao(float valorAcao) {
        this.valorAcao = valorAcao;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "codigoAcao=" + codigoAcao +
                ", nomeAcao='" + nomeAcao + '\'' +
                ", valorAcao=" + valorAcao +
                '}';
    }
}
