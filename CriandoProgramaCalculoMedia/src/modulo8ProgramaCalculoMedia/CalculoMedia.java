package modulo8ProgramaCalculoMedia;

import javax.swing.JOptionPane;

public class CalculoMedia {
	
	public static void main(String[] args) {
		
		String nota01 = JOptionPane.showInputDialog("Informe a 1ª nota");
		String nota02 = JOptionPane.showInputDialog("Informe a 2ª nota");
		String nota03 = JOptionPane.showInputDialog("Informe a 3ª nota");
		String nota04 = JOptionPane.showInputDialog("Informe a 4ª nota");
		
		double notaD01 = Double.parseDouble(nota01);
		double notaD02 = Double.parseDouble(nota02);
		double notaD03 = Double.parseDouble(nota03);
		double notaD04 = Double.parseDouble(nota04);
		
		double media = (notaD01 + notaD02 + notaD03 + notaD04) / 4;
		
		/*Media para aprovação é 70*/
		
		if (media >= 50 ) {
			
			if (media >= 70) {
				
				if (media >= 90) {
					JOptionPane.showConfirmDialog(null, "Aluno passou com excelência, média final: " + media);
				}else {
					JOptionPane.showConfirmDialog(null, "Aluno está aprovado com média: " + media);					
				}				
			}else {
				JOptionPane.showConfirmDialog(null, "Alunno está em recuperação, média: " + media);	
			}						
		}else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado média: " + media);
		}
		
		
	}

}
