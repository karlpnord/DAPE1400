import static javax.swing.JOptionPane.*;

public class Oppgave4 {
    public static void main(String[] args) {
        int teller = 0;
        String nummerInput;
        int nummer = 0;
        int storstTall = 0;
        int nestStorsteTall = 0;

        while (teller < 10) {
            nummerInput = showInputDialog("Skriv inn et tall");
            nummer = Integer.parseInt(nummerInput);

            if (nummer > storstTall) {
                nestStorsteTall = storstTall;
                storstTall = nummer;
            }

            System.out.println("Det største tallet er: " + storstTall);
            System.out.println("Det nest største tallet er: " + nestStorsteTall);
            teller++;
        }
        String ut = storstTall + " var det største tallet og " + nestStorsteTall + " var det nest største tallet";
        showMessageDialog(null, ut);
    }
}
