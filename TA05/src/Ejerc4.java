
/**
 * 
 */
import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final double PI = 3.14;

		String texto_radio = JOptionPane.showInputDialog("Introduce el radio del círculo");

		double radio = Double.parseDouble(texto_radio);

		double area = PI * (Math.pow(radio, 2));

		JOptionPane.showMessageDialog(null, "El rea del círculo es: " + area);

	}

}
