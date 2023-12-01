
/**
 * 
 */
import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de ventas"));

		double resultado = 0;

		for (int i = 0; i < numVentas; i++) {

			double venta = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la venta"));
			resultado += venta;
		}

		JOptionPane.showMessageDialog(null, "El valor final de las ventas es de: " + resultado);

	}

}
