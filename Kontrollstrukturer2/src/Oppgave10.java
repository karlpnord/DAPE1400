import static javax.swing.JOptionPane.*;

public class Oppgave10 {
    public static void main(String[] args) {
        // Primtallsgenerator
        String valgtTallInput = showInputDialog("Tall");
        int valgtTall = Integer.parseInt(valgtTallInput);

        for (int i = 2; i < valgtTall; i++) {
            boolean erPrimtall = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    erPrimtall = false;
                    break;
                }
            }

            if (erPrimtall) {
                System.out.println(i);
            }
        }
    }
}
