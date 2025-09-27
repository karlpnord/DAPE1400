import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {
        String alderInput = showInputDialog("Alder");
        int alder = Integer.parseInt(alderInput);

        if (alder < 18) {
            System.out.println("Du er for ung til å ta førerkort for bil");
        } else if (alder <= 70) {
            System.out.println("Du kan ta førerkort for bil og du trenger ikke årlige legesjekker");
        } else {
            System.out.println("Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }
    }
}