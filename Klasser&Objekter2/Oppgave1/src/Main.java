import static javax.swing.JOptionPane.*;

public class Main {
    static void main(String[] args) {
        String fornavn = showInputDialog("Fornavn?");
        String etternavn = showInputDialog("Etternavn?");
        String adresse = showInputDialog("Adresse?");
        String telefonnr = showInputDialog("Telefonnummer?");

        Person person1 = new Person(fornavn, etternavn, adresse, telefonnr);
        person1.printPersonInfo();
    }
}