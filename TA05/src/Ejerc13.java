
/**
 * 
 */
import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double operando1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el operando 1"));
		double operando2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el operando 2"));

		String operacio = JOptionPane.showInputDialog(
				"Qu operacin quieres hacer? Suma (+) Resta (-) Divisin (/) Multiplicacin (*) Potenciacin (^) Mdulo (%)");

		switch (operacio) {
		case "+":

			JOptionPane.showMessageDialog(null,
					"La suma de " + operando1 + " + " + operando2 + " = " + (operando1 + operando2));
			break;
		case "-":

			JOptionPane.showMessageDialog(null,
					"La resta de " + operando1 + " - " + operando2 + " = " + (operando1 - operando2));
			break;
		case "/":

			JOptionPane.showMessageDialog(null,
					"La divisin de " + operando1 + " / " + operando2 + " = " + (operando1 / operando2));
			break;
		case "*":

			JOptionPane.showMessageDialog(null,
					"La multiplicacin de " + operando1 + " * " + operando2 + " = " + (operando1 * operando2));
			break;
		case "^":
			JOptionPane.showMessageDialog(null,
					"La potencia de " + operando1 + " ^ " + operando2 + " = " + (Math.pow(operando1, operando2)));
			break;
		case "%":

			JOptionPane.showMessageDialog(null,
					"El mdulo de " + operando1 + " % " + operando2 + " = " + (operando1 % operando2));
			break;
		}

	}

}
