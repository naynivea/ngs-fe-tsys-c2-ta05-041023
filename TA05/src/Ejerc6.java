
/**
 * 
 */
import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final double IVA = 0.21;

		double valor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio"));
		JOptionPane.showMessageDialog(null, "El valor final del producto con el IVA es de: " + (valor + (valor * IVA)));

	}

}
