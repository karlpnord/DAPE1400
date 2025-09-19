import static javax.swing.JOptionPane.*;

public class Oppgave3 {
    public static void main(String[] args) {
        String breddeInput = showInputDialog("Bredde på rektangel");
        String lengdeInput = showInputDialog("Lengde på rektangel");

        double bredde = Double.parseDouble(breddeInput);
        double lengde = Double.parseDouble(lengdeInput);

        double areal = bredde * lengde;

        System.out.println("Et rektangel på " + bredde + " cm og lengde " + lengde + " cm har et areal på " + areal + " cm^2");
    }
}