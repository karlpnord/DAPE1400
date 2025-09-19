import static javax.swing.JOptionPane.*;

public class Oppgave11 {
    public static void main(String[] args) {
        String tallInput = showInputDialog("Skriv inn ett tall mellom 0-1000");
        int tall = Integer.parseInt(tallInput);

        int siffer1 = tall % 10;
        int nyttTall1 = tall / 10;

        int siffer2 = nyttTall1 % 10;
        int nyttTall2 = nyttTall1 / 10;

        int siffer3 = nyttTall2 % 10;
        int nyttTall3 = nyttTall2 / 10;

        int siffer4 = nyttTall3 % 10;

        int tverrsum = siffer1 + siffer2 + siffer3 + siffer4;

        System.out.println(tverrsum);
    }
}