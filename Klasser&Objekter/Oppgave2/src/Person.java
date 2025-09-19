import static javax.swing.JOptionPane.*;

public class Person {
    private String navn;
    private String adresse;
    private String telefonnr;
    private String fødselsår;

    public Person(String navn, String adresse, String telefonnr, String fødselsår) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
        this.fødselsår = fødselsår;
    }

    public int personAlder() {
        int alder = Integer.parseInt(fødselsår);
        return 2025 - alder;
    }

    public void skrivUtPerson(int alder) {
        String utskrift = "Navn: " + navn + "\nAdresse: " + adresse + "\nTelefonnr: " + telefonnr + "\nAlder: " + alder;
        showMessageDialog(null, utskrift);
    }
}
