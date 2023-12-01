
/**
 * 
 */
import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String contraCorrecta = "abcf";

		String contrasenaIntroducida = null;

		int i = 0;

		while (!contraCorrecta.equals(contrasenaIntroducida) && i < 3) {

			contrasenaIntroducida = JOptionPane.showInputDialog("Introduce la contraseña");

			i++;
		}

		if (contrasenaIntroducida.equals(contraCorrecta)) {
			JOptionPane.showMessageDialog(null, "¡Enhorabuena!");
		} else if (i >= 3) {
			JOptionPane.showMessageDialog(null, "Lo siento.. Has superado los intentos");
		}

	}

}
