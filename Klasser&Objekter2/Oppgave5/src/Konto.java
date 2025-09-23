import static javax.swing.JOptionPane.*;

public class Konto {
    private String navn;
    private String kontonummer;
    private int saldo;

    public Konto(String navn, String kontonummer, int saldo) {
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    public void skrivUtKonto() {
        showMessageDialog(null, "Navn: " + navn + "\nKontonummer: " + kontonummer + "+\nSaldo: " + saldo);
    }

    public void leggTilSaldo(int belop) {
        saldo += belop;
        System.out.println("Nytt saldobeløp er: " + saldo);
    }

    public void uttak(int belop) {
        if (belop < saldo) {
            saldo -= belop;
            System.out.println("Nytt saldobeløp er: " + saldo);
        } else {
            System.out.println("Uttak ikke mulig, saldoen er for lav");
        }
    }
}
