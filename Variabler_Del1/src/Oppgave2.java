import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main (String[] args) {
        String fornavn = showInputDialog("Hva er ditt fornavn?");
        String etternavn = showInputDialog("Hva er ditt etternavn?");
        String alder = showInputDialog("Hvor gammel er du?");

        String fulltNavn = fornavn + " " + etternavn;
        showMessageDialog(null, "Alderen til " + fulltNavn + " er " + alder);
    }
}
