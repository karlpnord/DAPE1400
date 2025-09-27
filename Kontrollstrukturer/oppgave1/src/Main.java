import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        String alderInput = showInputDialog("Alder");
        int alder = Integer.parseInt(alderInput);

        if (alder >= 18 && alder <= 20) {
            System.out.println("Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet");
        } else {
            System.out.println("Du er enten umyndig eller så kan du kjøpe hva du vil på polet");
        }
    }
}
