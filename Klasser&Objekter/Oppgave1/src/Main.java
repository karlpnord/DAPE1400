import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        String tittel = showInputDialog("Hva er tittel på boken?");
        String pris = showInputDialog("Hva er prisen på boken?");
        String forfatter = showInputDialog("Hvem har skrevet boken?");
        String iSBNNummer = showInputDialog("Hva er iSBN nummeret på boken?");

        Bøker bok1 = new Bøker(tittel, pris, forfatter, iSBNNummer);
        bok1.printBokInfo();
    }
}