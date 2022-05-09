import java.io.*;

public class Movimentacao implements Serializable {
    int codigoAcao;
    char movimentacao;
    float valorMovimentacao;

    public Movimentacao() {
    }

    public Movimentacao(int codigoAcao, char movimentacao, float valorMovimentacao) {
        this.codigoAcao = codigoAcao;
        this.movimentacao = movimentacao;
        this.valorMovimentacao = valorMovimentacao;
    }

    public int getCodigoAcao() {
        return codigoAcao;
    }

    public void setCodigoAcao(int codigoAcao) {
        this.codigoAcao = codigoAcao;
    }

    public char getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(char movimentacao) {
        this.movimentacao = movimentacao;
    }

    public float getValorMovimentacao() {
        return valorMovimentacao;
    }

    public void setValorMovimentacao(float valorMovimentacao) {
        this.valorMovimentacao = valorMovimentacao;
    }

    @Override
    public String toString() {
        return "Movimentacao{" +
                "codigoAcao=" + codigoAcao +
                ", movimentacao=" + movimentacao +
                ", valorMovimentacao=" + valorMovimentacao +
                '}';
    }
}
