import static javax.swing.JOptionPane.*;

public class Oppgave5 {
    public static void main(String[] args) {
        String fahrenheitInput = showInputDialog("Hva er temperaturen i Fahrenheit?");

        double fahrenheit = Double.parseDouble(fahrenheitInput);
        double celsius = ( fahrenheit - 32 ) / 1.8;
        String celsiusMedToDesimaler = String.format("%.1f", celsius);

        System.out.println("Temperaturen " + fahrenheit + "F blir " + celsiusMedToDesimaler + "C");
    }
}