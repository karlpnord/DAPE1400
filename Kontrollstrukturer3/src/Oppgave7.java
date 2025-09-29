import static javax.swing.JOptionPane.*;

public class Oppgave7 {
    public static void main(String[] args) {
        String grunnflateStjernerInput = showInputDialog("Antall stjerner på grunnflaten");
        int grunnflateStjerner = Integer.parseInt(grunnflateStjernerInput);

        for (int i = 1; i <= grunnflateStjerner; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }

            System.out.println();
        }
    }
}
