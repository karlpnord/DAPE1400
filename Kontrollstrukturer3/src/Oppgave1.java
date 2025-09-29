import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[] args) {
        String innKm = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
        double antallKm = Double.parseDouble(innKm);

        String innLiter = showInputDialog("Skriv inn antall liter som ble brukt på turen: ");
        double antallLiter = Double.parseDouble(innLiter);

        double totaltAntallKm = 0, totaltAntallLiter = 0;

        while (antallKm > 0) {
            totaltAntallKm += antallKm;
            totaltAntallLiter = antallLiter;

            innKm = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
            antallKm = Double.parseDouble(innKm);

            innLiter = showInputDialog("Skriv inn antall liter som ble brukt på turen: ");
            antallLiter = Double.parseDouble(innLiter);
        }

        double gjennomsnitt = totaltAntallLiter / totaltAntallKm * 10;
        showMessageDialog(null, "Gjennomsnittlig forbruk per mil er " + gjennomsnitt + " liter.");
    }
}
