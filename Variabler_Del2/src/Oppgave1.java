import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main (String[] args) {
        String alder = showInputDialog("Hva er din alder?");
        showMessageDialog(null, "Min alder er " + alder + " år.");
    }
}
