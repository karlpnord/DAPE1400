import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main(String[] args) {
        String innVarePris = showInputDialog("Skriv inn prisen op varen og avslutt med 0");
        double varePris = Double.parseDouble(innVarePris);

        double totaltPris = 0;

        while (varePris > 0) {
            totaltPris += varePris;
            innVarePris = showInputDialog("Skriv inn prisen op varen og avslutt med 0");
            varePris = Double.parseDouble(innVarePris);
        }

        double kommisjon = totaltPris * 0.09;
        showMessageDialog(null, "Kommisjonen for totalt" + totaltPris + " kr blir " + kommisjon + " kr");
    }
}
