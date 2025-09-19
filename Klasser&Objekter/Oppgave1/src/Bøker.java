import static javax.swing.JOptionPane.*;

public class Bøker {
    private String tittel;
    private String pris;
    private String forfatter;
    private String iSBNNummer;

    public Bøker(String tittel, String pris, String forfatter, String iSBNNummer) {
        this.tittel = tittel;
        this.pris = pris;
        this.forfatter = forfatter;
        this.iSBNNummer = iSBNNummer;
    }

    public void printBokInfo() {
        showMessageDialog(null, tittel + "\n" + pris + "\n" + forfatter + "\n" + iSBNNummer);
    }
}
