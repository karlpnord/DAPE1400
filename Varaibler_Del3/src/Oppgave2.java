import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main (String[] args) {
        double prisPerBillett = 150;
        double prisPerBarneBillett = 150 * 0.9;

        String antallVoksenBilletterInput = showInputDialog("Hvor mange voksen billetter skal du ha?");
        String antallBarneBilletterInput = showInputDialog("Hvor mange barne billetter skal du ha?");

        double antallVoksenBilletter, antallBarneBilletter;

        try {
            antallVoksenBilletter = Double.parseDouble(antallVoksenBilletterInput);
            antallBarneBilletter = Double.parseDouble(antallBarneBilletterInput);
        } catch (Exception e) {
            antallVoksenBilletter = 0;
            antallBarneBilletter = 0;
            showMessageDialog(null, "Du må skrive riktig antall billetter!");
        }

        double totalSum = (antallVoksenBilletter * prisPerBillett) + (antallBarneBilletter * prisPerBarneBillett);
        System.out.println("Totalsummen for alle billettene blir: " + totalSum + "kr.");
    }
}
