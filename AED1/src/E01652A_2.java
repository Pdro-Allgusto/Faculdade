import java.text.DecimalFormat;

public class E01652A_2 {

    public static void main(String[] args) {
        double media, y = 0, fx = 0;
        int cont = 0;
        DecimalFormat deci = new DecimalFormat("0.0000");
        for (int aux = -99; aux <= 100; aux += 2)
            if (aux == 1) {
                cont++;
                System.out.println("x = 1 -> f(x) = 0");
            } else if (aux < 1) {
                y = Math.pow(aux, 2) - 4 * aux + 3;
                fx += Math.pow(aux, 2) - 4 * aux + 3;
                cont++;
                System.out.println("x = " + aux + " -> f(x) = " + deci.format(y));
            } else {
                y = (aux - 1) / (Math.pow(aux, 2) + 1);
                fx += (aux - 1) / (Math.pow(aux, 2) + 1);
                cont++;
                System.out.println("x = " + aux + " -> f(x) = " + deci.format(y));
            }

        media = fx / cont;
        System.out.println("M�dia = " + media);
    }
}