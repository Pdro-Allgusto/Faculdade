import java.util.Scanner; 
public class exe6c12 {
   public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);      
     String vet[] = new String[12];
     for (int aux=0; aux<12; aux++) {
        System.out.print("Informe os nomes dos 12 meses do ano (em ordem cronológica) : ");
        vet[aux] = teclado.nextLine();
     }
     for (int aux=11; aux>=0; aux--) {
        System.out.print(vet[aux]+" ");
     }
     teclado.close();
   }
}