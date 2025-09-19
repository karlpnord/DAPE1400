import static javax.swing.JOptionPane.*;

public class Oppgave4 {
    public static void main(String[] args) {
        String radiusInput = showInputDialog("Radius på sirkel");

        double radius = Double.parseDouble(radiusInput);

        double omkrets = 2 * 3.14 * radius;

        String omkretsMedToDesimaler = String.format("%.2f", omkrets);

        System.out.println("Omkretsen av en sirkel med " + radius + " cm som radius blir " + omkretsMedToDesimaler + " cm");
    }
}