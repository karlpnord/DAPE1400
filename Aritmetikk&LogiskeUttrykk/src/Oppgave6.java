import static javax.swing.JOptionPane.*;

public class Oppgave6 {
    public static void main(String[] args) {
        String dollarInput = showInputDialog("Oppgi beløp i USD");

        double dollar = Double.parseDouble(dollarInput);
        double dollarToNok = dollar * 10.0759;

        System.out.println(dollarToNok + "NOK");
    }
}