
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
		String diaSemana = JOptionPane.showInputDialog("Introduce el día de la semana");

		switch (diaSemana) {
		case "lunes":
			System.out.println("Es un día laborable");
			break;
		case "martes":
			System.out.println("Es un día laborable");
			break;
		case "miércoles":
			System.out.println("Es un día laborable");
			break;
		case "jueves":
			System.out.println("Es un día laborable");
			break;
		case "viernes":
			System.out.println("Es un día laborable");
			break;
		case "sábado":
			System.out.println("No es un día laborable");
			break;
		case "domingo":
			System.out.println("No es un día laborable");
			break;
		}

	}

}