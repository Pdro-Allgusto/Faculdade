import javax.swing.JOptionPane;
public class exe4c4 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null,
		         "Qual seu nome?", 
		         "Questionario",
		         JOptionPane.QUESTION_MESSAGE);
		String numFilhosStr = JOptionPane.showInputDialog(null,
		         "Quantos filhos você tem?", 
		         "Qustionario",
		         JOptionPane.QUESTION_MESSAGE);  
		int numFilhos = Integer.valueOf(numFilhosStr).intValue();
	      JOptionPane.showMessageDialog(null,
	         "Nome: "+nome+"\nQuantidade de filhos: "+numFilhos, 
	         "Questionario",
	         JOptionPane.INFORMATION_MESSAGE);
	}

}
