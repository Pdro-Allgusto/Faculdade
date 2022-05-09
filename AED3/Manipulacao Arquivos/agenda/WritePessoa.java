package agenda;

import java.io.*;

public class WritePessoa {
    public static void main(String[] args) throws IOException {

        int numElem = 2;
        // Le vetor de objetos da classe Pessoa a partir do console
        // Pessoa[] vetor = consoleReadPessoa(numElem);

        // Le vetor de objetos já criados da classe Pessoa
        Pessoa[] vetor = readVetorPessoa();

        // Cria stream para escrita de objetos
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("person.dat"));
        // Escreve tamanho do vetor
        out.writeInt(vetor.length);
        for (Pessoa pessoa : vetor)
            out.writeObject(pessoa);    // Escreve cada objeto
        out.close();                    // Fecha stream

    } // fim main ( )

    private static Pessoa[] readVetorPessoa() {

        Pessoa[] vet = new Pessoa[5];
        vet[0] = new Pessoa(10, "Maria Cláudia Santos");
        vet[1] = new Pessoa(11, "Ana Paula Souza");
        vet[2] = new Pessoa(15, "João Fernando Silva");
        vet[3] = new Pessoa(17, "Pedro Cardoso Queiroz");
        vet[4] = new Pessoa(21, "Beatriz Miranda de Oliveira");
        return vet;
    }

    private static Pessoa[] consoleReadPessoa(int numElem) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String nome;
        int id;
        Pessoa[] vet = new Pessoa[numElem];

        for (int i = 0; i < numElem; i++) {

            System.out.println("\nEntre com dados da " + (i + 1) + "a. pessoa:");
            System.out.print("Id : ");
            id = Integer.parseInt(in.readLine());

            System.out.print("Nome : ");
            nome = in.readLine();

            vet[i] = new Pessoa(id, nome);
        }
        return vet;
    } // fim readVetorPessoa
} // fim writePessoa class
