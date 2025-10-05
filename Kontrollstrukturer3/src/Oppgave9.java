import static javax.swing.JOptionPane.*;

public class Oppgave9 {
    public static void main(String[] args) {
        String tallInput = showInputDialog("Regn ut fakultet av dette tallet.");
        int tall = Integer.parseInt(tallInput);

        while (tall < 1) {
            tallInput = showInputDialog("Tallet må være større enn null!");
            tall = Integer.parseInt(tallInput);
        }

        int sum = 1;

        for (int i = tall; i > 0; i--) {
            System.out.println("Summen er nå: " + sum);
            System.out.println("Tallet som skal ganges med summen nå er: " + i);
            sum = sum * i;
        }

        System.out.println(sum);
    }
}
