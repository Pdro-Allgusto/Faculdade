package trabalhoEstatistica;

import java.util.Arrays;

public class calculosEstatisticos {

    public Double Soma(double[] valor) {
        Double soma = 0.0;
        for (int i = 0; i < valor.length; i++) {
            soma += valor[i];
        }
        return soma;
    }

    public Double Media(double[] valor) {
        return Soma(valor) / valor.length;
    }

    public Double Mediana(double[] valor) {
        double x = 0;

        if (valor.length % 2 == 1) {
            x = valor[((valor.length + 1) / 2) - 1];

        } else {
            x = (valor[valor.length / 2 - 1] + valor[valor.length / 2]) / 2;
        }
        return (x);
    }

    public Double Moda(double[] valor) {
        int modeCount = 0;
        double mode = 0;
        int currCount = 0;
        int currElement;

        for (double candidateMode : valor) {
            currCount = 0;
            for (double element : valor) {
                if (candidateMode == element) {
                    currCount++;
                }
            }
            if (currCount > modeCount) {
                modeCount = currCount;
                mode = candidateMode;
            }
        }
        if(modeCount == currCount){
            return 0.0;
        }
        return mode;
    }

    public Double Variancia(double[] valor) {
        double variancia = 0, tam = valor.length, soma = 0, med = 0;

        for (int i = 0; i <= tam - 1; i++) {
            soma += valor[i];
        }
        med = soma / tam;
        for (int i = 0; i <= tam - 1; i++) {
            variancia += Math.pow(valor[i] - med, 2);
        }
        variancia = variancia / tam;
        return (variancia);
    }

    public Double DesvioPadrao(double[] valor) {
        double variancia = this.Variancia(valor);
        return (Math.sqrt(variancia));
    }

    public Double coeficienteVariacao(double[] valor) {
        double desvio = this.DesvioPadrao(valor);
        double med = this.Media(valor);
        double cv;
        cv = (desvio / med) * 100;
        return (cv);
    }

    // Calculando A, K, a *
    public double distFrequenciaA(double[] valor) {
        double max = 0, A = 0;
        max = valor.length;
        A = valor[(int) (max - 1)] - valor[0];
        return (A);
    }

    public double distFrequenciaK(double[] valor) {
        double K;
        K = Math.sqrt(valor.length);
        return ((int) K);
    }

    public double distFrequenciaa(double[] valor) {
        double a, A, K;
        A = distFrequenciaA(valor);
        K = distFrequenciaK(valor);
        a = A / K;
        return (Math.ceil(a));
    }

    public double[] BubbleSort(double[] arrayDouble) {
        for (int i = 0; i < arrayDouble.length; i++) {
            for (int j = 0; j < arrayDouble.length - 1; j++) {
                if (arrayDouble[j] > arrayDouble[j + 1]) {
                    double aux = arrayDouble[j];
                    arrayDouble[j] = arrayDouble[j + 1];
                    arrayDouble[j + 1] = aux;
                }
            }
        }
        return (arrayDouble);
    }

    public double[] quartis(double[] arrayDouble) {
        double vet[] = new double[5];
        int contVetor = 0;

        for (int i = 0; i < 4; i++) {
            contVetor++;
        }

        for (int quartileType = 1; quartileType < contVetor; quartileType++) {
            float length = arrayDouble.length + 1;
            double quartil;
            float tamVet = ((length * ((float) (quartileType) * 1 / 4)) - 1);
            Arrays.sort(arrayDouble);
            if (tamVet % 1 == 0) {
                quartil = arrayDouble[(int) (tamVet)];
            } else {
                int tamVet1 = (int) (tamVet);
                quartil = (arrayDouble[tamVet1] + arrayDouble[tamVet1 + 1]) / 2;
            }
            vet[quartileType - 1] = quartil;
        }
        return (vet);
    }

    public double[] decil(double[] arrayDouble) {
        double vet[] = new double[11];
        int contVetor = 0;

        for (int i = 0; i < 10; i++) {
            contVetor++;
        }
        for (int decilType = 1; decilType < contVetor; decilType++) {
            float length = arrayDouble.length + 1;
            double decil;
            float tamVet = (length * ((float) (decilType) * 1 / 10)) - 1;
            Arrays.sort(arrayDouble);
            if (tamVet % 1 == 0) {
                decil = arrayDouble[(int) (tamVet)];
            } else {
                int tamVet1 = (int) (tamVet);
                decil = (arrayDouble[tamVet1] + arrayDouble[tamVet1 + 1]) / 2;
            }
            vet[decilType - 1] = decil;
        }
        return (vet);
    }

    public double[] percentil(double[] arrayDouble) {
        double vet[] = new double[100];
        int contVetor = 0;

        for (int i = 0; i < 99; i++) {
            contVetor++;
        }

        for (int percentilType = 1; percentilType < contVetor; percentilType++) {
            float length = arrayDouble.length + 1;
            double percentil;
            float dadosVet = (length * ((float) (percentilType) * 1 / 100)) - 1;
            Arrays.sort(arrayDouble);
            if (dadosVet % 1 == 0) {
                percentil = arrayDouble[(int) (dadosVet)];
            } else {
                int tamVet = (int) (dadosVet);
                percentil = (arrayDouble[tamVet] + arrayDouble[tamVet + 1]) / 2;
            }
            vet[percentilType - 1] = percentil;
        }
        return (vet);
    }


}
