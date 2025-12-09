import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main(String[] args) {
        String inputString;

        do {
            inputString = showInputDialog("Dagens Visdomsord (ord)\nDagens vær (vær)\nAvslutt program (x)");

            switch (inputString) {
                case "ord" -> dagensVisdomsord();
                case "vær" -> dagensVær();
                case "x" -> avsluttProgram();
                default -> showMessageDialog(null, "Ugyldig input, prøv igjen!");
            }

        } while (!inputString.equals("x"));
    }

    public static void dagensVisdomsord() {
        showMessageDialog(null, "Dagens visdomsord er: bla bla bla");
    }

    public static void dagensVær() {
        showMessageDialog(null, "Dagens vær: sol og 30 grader");
    }

    public static void avsluttProgram() {
        showMessageDialog(null, "Program avsluttet");
    }
}
