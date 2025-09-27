import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {
        String alderInput = showInputDialog("Alder");
        int alder = Integer.parseInt(alderInput);

        if (alder >= 18) {
            System.out.println("Du kan ta førerkortet for bil da du er gammel nok");
        } else {
            System.out.println("Du er for ung til å ta førerkort for bil");
        }
    }
}