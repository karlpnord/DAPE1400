import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        String navn = showInputDialog("Hva er ditt navn?");
        String adresse = showInputDialog("Hva er din adresse?");
        String telefonnr = showInputDialog("Hva er ditt telefonnummer?");
        String fødselsår = showInputDialog("Hvilket år er du født?");

        Person person1 = new Person(navn, adresse, telefonnr, fødselsår);
        int alder = person1.personAlder();
        person1.skrivUtPerson(alder);

    }
}