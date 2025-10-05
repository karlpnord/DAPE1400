import static javax.swing.JOptionPane.*;

public class Oppgave8 {
    public static void main(String[] args) {
        String tallInput = showInputDialog("Skriv inn 5 sifret tall.");
        int tall = Integer.parseInt(tallInput);
        int lengde = String.valueOf(tall).length();

        while (lengde != 5) {
            tallInput = showInputDialog("Tallet var ikke 5 sifret, prøv på nytt");
            tall = Integer.parseInt(tallInput);
            lengde = String.valueOf(tall).length();
        }

        int tempTall = tall;
        int reversert = 0;

        for (int i = 0; i < lengde; i++) {
            int siffer = tempTall % 10;
            reversert = reversert * 10 + siffer;
            tempTall /= 10;
        }

        if (tall == reversert) {
            System.out.println("tallet er et palindrom");
        } else {
            System.out.println("tallet er ikke et palindrom");
        }
    }
}
