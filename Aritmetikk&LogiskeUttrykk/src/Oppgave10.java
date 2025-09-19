import static javax.swing.JOptionPane.*;

public class Oppgave10 {
    public static void main(String[] args) {
        String alderInput = showInputDialog("Hva er din alder?");
        int alder = Integer.parseInt(alderInput);

        if (alder >= 18) {
            System.out.println("Du kan ta førerkort for bil da du er gammel nok.");
        } else {
            System.out.println("Du kan ikke ta førerkort for bil.");
        }
    }
}