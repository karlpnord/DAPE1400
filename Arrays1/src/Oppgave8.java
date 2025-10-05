import static javax.swing.JOptionPane.*;

public class Oppgave8 {
    public static void main(String[] args) {
        int antall, poeng;
        String innAntall, innPoeng;
        innAntall = showInputDialog("Hvor mange poengsummer");

        try {
            antall = Integer.parseInt(innAntall);
        } catch (Exception e) {
            showMessageDialog(null, "Tallet må være et heltall over 0");
            antall = 0;
        }

        int[] poengsum = new int[antall];

        while (antall > 0) {
            innPoeng = showInputDialog("Antall poeng?");

            try {
                poeng = Integer.parseInt(innPoeng);
                poengsum[antall - 1] = poeng;
                antall --;
            } catch (Exception e) {
                showMessageDialog(null, "Ikke et heltall over 0");
            }
        }

        int sum = 0;
        for (int i : poengsum) {
            sum += i;
        }

        if (poengsum.length > 0) {
            double gjennomsnitt = (double)sum / poengsum.length;
            showMessageDialog(null, "Gjennomsnittet er: " + String.format("%.2f", gjennomsnitt));
        }

        for (int i = 0; i < poengsum.length; i++) {
            System.out.print(poengsum[i] + " ");
        }
    }
}
