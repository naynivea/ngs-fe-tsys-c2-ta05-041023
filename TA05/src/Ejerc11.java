
/**
 * 
 */
import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String diaSemana = JOptionPane.showInputDialog("Introduce el d�a de la semana");

		switch (diaSemana) {
		case "lunes":
			System.out.println("Es un d�a laborable");
			break;
		case "martes":
			System.out.println("Es un d�a laborable");
			break;
		case "mi�rcoles":
			System.out.println("Es un d�a laborable");
			break;
		case "jueves":
			System.out.println("Es un d�a laborable");
			break;
		case "viernes":
			System.out.println("Es un d�a laborable");
			break;
		case "s�bado":
			System.out.println("No es un d�a laborable");
			break;
		case "domingo":
			System.out.println("No es un d�a laborable");
			break;
		}

	}

}