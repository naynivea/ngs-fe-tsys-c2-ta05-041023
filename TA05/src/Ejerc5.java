
/**
 * 
 */
import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String texto_num = JOptionPane.showInputDialog("Introduce un número y te diré si la división por 2 es exacta");

		double num = Double.parseDouble(texto_num);

		
		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Es divisible entre dos");
		} else {
			JOptionPane.showMessageDialog(null, "No es divisible entre dos");
		}

	}

}
