import static javax.swing.JOptionPane.*;

public class Oppgave7 {
    public static void main(String[] args) {
        String antallPizzaInput = showInputDialog("Hvor mange pizza?");
        String antallPersonerInput = showInputDialog("Hvor mange personer?");
        String antallSlicesPerPizzaInput = showInputDialog("Hvor mange slices per pizza?");

        int antallPizza = Integer.parseInt(antallPizzaInput);
        int antallPersoner = Integer.parseInt(antallPersonerInput);
        int antallSlicesPerPizza = Integer.parseInt(antallSlicesPerPizzaInput);

        int totalSlices = antallPizza * antallSlicesPerPizza;
        int slicesPerPerson = totalSlices / antallPersoner;
        int slicesTilOvers = totalSlices % antallPersoner;

        System.out.println("Dersom man er " + antallPersoner + " personer og har " + antallPizza + " pizzaer får hver person " + slicesPerPerson + " slices og " + slicesTilOvers + " blir til overs");
    }
}