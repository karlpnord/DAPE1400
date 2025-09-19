import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[] args) {
        String navnInput = showInputDialog("Hva heter du?");
        String alderInput = showInputDialog("Hvor gammel er du?");

        int alder = Integer.parseInt(alderInput);

        String printStreng = navnInput + " er idag " + alder + " år. Han er født i " + (2025 - alder) + ". I " + (2025 + alder) + " er han " + (alder * 2) + "år gammel.";
        System.out.println(printStreng);
    }
}