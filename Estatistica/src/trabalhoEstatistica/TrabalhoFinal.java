package trabalhoEstatistica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Arrays;

public class TrabalhoFinal extends JFrame{
    calculosEstatisticos ce = new calculosEstatisticos();
    private JPanel principal;
    private JButton btnOk;
    private JButton btnClear;
    private JPanel medidas;
    private JPanel quartil;
    private JPanel decil;
    private JPanel percentil;
    private JLabel media;
    private JTable tabela;
    private JTextField entradaDados;
    private JLabel exibirDados;
    private JLabel mediana;
    private JLabel moda;
    private JLabel variancia;
    private JLabel desvio;
    private JLabel cVariacao;
    private JLabel Q1;
    private JLabel Q2;
    private JLabel Q3;
    private JComboBox boxDecil;
    private JComboBox boxPercentil;
    private JLabel Percentil;
    private JLabel Decil;
    private JLabel setA;
    private JLabel setK;
    private JLabel seta;
    private JLabel int0inicio;
    private JLabel int1inicio;
    private JLabel int2inicio;
    private JLabel int3inicio;
    private JLabel int4inicio;
    private JLabel int5inicio;
    private JLabel int6inicio;
    private JLabel int7inicio;
    private JLabel int8inicio;
    private JLabel int9inicio;
    private JLabel int0final;
    private JLabel int1final;
    private JLabel int2final;
    private JLabel int3final;
    private JLabel int4final;
    private JLabel int5final;
    private JLabel int6final;
    private JLabel int7final;
    private JLabel int8final;
    private JLabel int9final;
    private JLabel freq0;
    private JLabel freq1;
    private JLabel freq2;
    private JLabel freq3;
    private JLabel freq4;
    private JLabel freq5;
    private JLabel freq6;
    private JLabel freq7;
    private JLabel freq8;
    private JLabel freq9;
    private JLabel freqA0;
    private JLabel freqA1;
    private JLabel freqA2;
    private JLabel freqA3;
    private JLabel freqA4;
    private JLabel freqA5;
    private JLabel freqA6;
    private JLabel freqA7;
    private JLabel freqA8;
    private JLabel freqA9;
    private JLabel papa;

    public TrabalhoFinal(){
        setContentPane(principal);
        setTitle("Estatistica e Probabilidade");
        setSize(711,616);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double Media, Mediana, Moda, Variancia, desvioPadrao, cv;
                int cont=0, contA=0;
                int[] f, fA;
                double A = 0, a = 0, K = 0, posicaoDecil, posicaoPercentil;
                Object[] faixa;
                double[] quartil, decil, percentil;
                double[] limiteInferior = new double[10], limiteSuperior = new double[10];
                int[] freq = new int[10];
                int[] freqAcom = new int[10];



                //Entrada de dados
                String entrada = entradaDados.getText();

                //Separando os dados pelo espaco
                String[] arrayString = entrada.split(" ");

                // Transformando arraySting em Double
                double[] arrayDouble = Arrays.stream(arrayString).mapToDouble(Double::parseDouble).toArray();

                //Ordenando ArrayDouble
                arrayDouble = ce.BubbleSort(arrayDouble);
                exibirDados.setText(Arrays.toString(arrayDouble));

                //	Distribuicao de frequencia agrupada
                A = ce.distFrequenciaA(arrayDouble);
                setA.setText(String.valueOf(A));
                K = ce.distFrequenciaK(arrayDouble);
                setK.setText(String.valueOf(K));
                a = ce.distFrequenciaa(arrayDouble);
                seta.setText(String.valueOf(a));

                //calculos
                Media = ce.Media(arrayDouble);
                Mediana = ce.Mediana(arrayDouble);
                Moda = ce.Moda(arrayDouble);
                Variancia = ce.Variancia(arrayDouble);
                desvioPadrao = ce.DesvioPadrao(arrayDouble);
                cv = ce.coeficienteVariacao(arrayDouble);
                quartil = ce.quartis(arrayDouble);
                decil = ce.decil(arrayDouble);
                percentil = ce.percentil(arrayDouble);


                media.setText(String.valueOf(Media));
                mediana.setText(String.valueOf(Mediana));
                moda.setText(String.valueOf(Moda));
                variancia.setText(String.valueOf(Variancia));
                desvio.setText(String.valueOf(desvioPadrao));
                cVariacao.setText(String.valueOf(cv));
                Q1.setText(String.valueOf(quartil[0]));
                Q2.setText(String.valueOf(quartil[1]));
                Q3.setText(String.valueOf(quartil[2]));

                posicaoDecil = boxDecil.getSelectedIndex();
                Decil.setText(String.valueOf(decil[(int)posicaoDecil]));

                posicaoPercentil = boxPercentil.getSelectedIndex();
                Percentil.setText(String.valueOf(percentil[(int)posicaoPercentil]));

                int0inicio.setText(String.valueOf(arrayDouble[0]));
                int1inicio.setText(String.valueOf(arrayDouble[0]+a));
                int2inicio.setText(String.valueOf(arrayDouble[0]+(a*2)));
                int3inicio.setText(String.valueOf(arrayDouble[0]+(a*3)));
                int4inicio.setText(String.valueOf(arrayDouble[0]+(a*4)));
                int5inicio.setText(String.valueOf(arrayDouble[0]+(a*5)));
                int6inicio.setText(String.valueOf(arrayDouble[0]+(a*6)));
                int7inicio.setText(String.valueOf(arrayDouble[0]+(a*7)));
                int8inicio.setText(String.valueOf(arrayDouble[0]+(a*8)));
                int9inicio.setText(String.valueOf(arrayDouble[0]+(a*9)));

                int0final.setText(String.valueOf(arrayDouble[0]+a));
                int1final.setText(String.valueOf(arrayDouble[0]+(a*2)));
                int2final.setText(String.valueOf(arrayDouble[0]+(a*3)));
                int3final.setText(String.valueOf(arrayDouble[0]+(a*4)));
                int4final.setText(String.valueOf(arrayDouble[0]+(a*5)));
                int5final.setText(String.valueOf(arrayDouble[0]+(a*6)));
                int6final.setText(String.valueOf(arrayDouble[0]+(a*7)));
                int7final.setText(String.valueOf(arrayDouble[0]+(a*8)));
                int8final.setText(String.valueOf(arrayDouble[0]+(a*9)));
                int9final.setText(String.valueOf(arrayDouble[0]+(a*10)));

                    for (int i = 0; i < K; i++) {
                        if (i == (K - 1)) {
                            limiteInferior[i] = arrayDouble[0]+(a*i);
                            limiteSuperior[i] = arrayDouble[0]+(a*(i+1));
                        } else {
                            if(i==0){
                                limiteInferior[i] = arrayDouble[0];
                                limiteSuperior[i] = arrayDouble[0]+a;
                            }
                            limiteInferior[i] = arrayDouble[0]+(a*i);
                            limiteSuperior[i] = arrayDouble[0]+(a*(i+1));
                        }
                }
                for (int i = 0; i < K; i++) {
                    cont = 0;
                    if (i < K - 1) {
                        for (int j = 0; j < arrayDouble.length; j++) {
                            if (arrayDouble[j] >= limiteInferior[i] && arrayDouble[j] < limiteSuperior[i]) {
                                cont++;
                                contA++;
                            }
                        }
                        freq[i] = cont;
                        freqAcom[i] = contA;
                    } else {
                        for (int j = 0; j < arrayDouble.length; j++) {

                            if (arrayDouble[j] >= limiteInferior[i] && arrayDouble[j] < limiteSuperior[i]) {
                                cont++;
                                contA++;
                            }
                        }
                        cont++;
                        contA++;
                        freq[i] = cont;
                        freqAcom[i] = contA;
                        if(i==K-1){
                            freq[i] = cont-1;
                            freqAcom[i] = contA-1;
                        }
                    }

                }

                freq0.setText(String.valueOf(freq[0]));
                freq1.setText(String.valueOf(freq[1]));
                freq2.setText(String.valueOf(freq[2]));
                freq3.setText(String.valueOf(freq[3]));
                freq4.setText(String.valueOf(freq[4]));
                freq5.setText(String.valueOf(freq[5]));
                freq6.setText(String.valueOf(freq[6]));
                freq7.setText(String.valueOf(freq[7]));
                freq8.setText(String.valueOf(freq[8]));
                freq9.setText(String.valueOf(freq[9]));

                freqA0.setText(String.valueOf(freqAcom[0]));
                freqA1.setText(String.valueOf(freqAcom[1]));
                freqA2.setText(String.valueOf(freqAcom[2]));
                freqA3.setText(String.valueOf(freqAcom[3]));
                freqA4.setText(String.valueOf(freqAcom[4]));
                freqA5.setText(String.valueOf(freqAcom[5]));
                freqA6.setText(String.valueOf(freqAcom[6]));
                freqA7.setText(String.valueOf(freqAcom[7]));
                freqA8.setText(String.valueOf(freqAcom[8]));
                freqA9.setText(String.valueOf(freqAcom[9]));
            }
        });
        exibirDados.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entradaDados.setText("");
                exibirDados.setText("");
                media.setText("");
                mediana.setText("");
                moda.setText("");
                variancia.setText("");
                desvio.setText("");
                cVariacao.setText("");
                Q1.setText("");
                Q2.setText("");
                Q3.setText("");
                Decil.setText("");
                Percentil.setText("");
                freq0.setText("");
                freq1.setText("");
                freq2.setText("");
                freq3.setText("");
                freq4.setText("");
                freq5.setText("");
                freq6.setText("");
                freq7.setText("");
                freq8.setText("");
                freq9.setText("");
                freqA0.setText("");
                freqA1.setText("");
                freqA2.setText("");
                freqA3.setText("");
                freqA4.setText("");
                freqA5.setText("");
                freqA6.setText("");
                freqA7.setText("");
                freqA8.setText("");
                freqA9.setText("");
                int0inicio.setText("");
                int1inicio.setText("");
                int2inicio.setText("");
                int3inicio.setText("");
                int4inicio.setText("");
                int5inicio.setText("");
                int6inicio.setText("");
                int7inicio.setText("");
                int8inicio.setText("");
                int9inicio.setText("");

                int0final.setText("");
                int1final.setText("");
                int2final.setText("");
                int3final.setText("");
                int4final.setText("");
                int5final.setText("");
                int6final.setText("");
                int7final.setText("");
                int8final.setText("");
                int9final.setText("");
            }
        });
    }
    public static void main(String[] args) {
        TrabalhoFinal myMainframe = new TrabalhoFinal();

    }
}

