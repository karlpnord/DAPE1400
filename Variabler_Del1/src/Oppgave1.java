import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main (String[] args) {
        String fornavn = showInputDialog("Hva er ditt fornavn?");
        String etternavn = showInputDialog("Hva er ditt etternavn?");

        String fulltNavn = fornavn + " " + etternavn;
        showMessageDialog(null, "Ditt fulle navn er: " + fulltNavn);
    }
}
