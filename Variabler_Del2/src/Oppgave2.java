import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main (String[] args) {
        String tall1input = showInputDialog("Skriv inn et tilfeldig tall.");
        String tall2input = showInputDialog("Skriv inn et tilfeldig tall.");
        String tall3input = showInputDialog("Skriv inn et tilfeldig tall.");

        double tall1, tall2, tall3;

        try {
            tall1 = Double.parseDouble(tall1input);
            tall2 = Double.parseDouble(tall2input);
            tall3 = Double.parseDouble(tall3input);
        } catch (Exception e) {
            tall1 = 0;
            tall2 = 0;
            tall3 = 0;
        }

        double sum = tall1 + tall2 + tall3;
        System.out.println("Summen av tallene er: " + sum);
    }
}
