import static javax.swing.JOptionPane.*;

public class Oppgave11 {
    public static void main(String[] args) {
        // Primtallssjekk
        String tallInput = showInputDialog("Tall");
        int tall = Integer.parseInt(tallInput);
        boolean erPrimtall = true;

        for (int i = 2; i <= Math.sqrt(tall); i++) {
            if (tall % i == 0) {
                erPrimtall = false;
                System.out.println(tall + " er ikke et primtall");
                break;
            }
        }
        if (erPrimtall) {
            System.out.println(tall + " er et primtall");
        }
    }
}
