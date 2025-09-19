import static javax.swing.JOptionPane.*;

public class Oppgave3 {
    public static void main (String[] args) {
        String fornavn = showInputDialog("Hva er ditt fornavn?");
        String etternavn = showInputDialog("Hva er ditt etternavn?");
        String alder = showInputDialog("Hvor gammel er du?");
        String adresse = showInputDialog("Hva er din adresse?");
        String poststed = showInputDialog("Hva er ditt poststed?");
        String postnummer = showInputDialog("Hva er ditt postnummer?");

        String fulltNavn = fornavn + " " + etternavn;
        String fullString = fulltNavn + " bor i " + adresse + " som har postnummer " + postnummer + " i " + poststed + ". " + fornavn + "'s alder er " + alder;
        showMessageDialog(null, fullString);
    }
}
