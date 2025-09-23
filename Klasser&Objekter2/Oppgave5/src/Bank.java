public class Bank {
    static void main(String[] args) {
        Konto nyKonto = new Konto("Karl", "12121121212", 400);

        nyKonto.skrivUtKonto();

        nyKonto.leggTilSaldo(600);
        nyKonto.skrivUtKonto();

        nyKonto.uttak(700);
        nyKonto.skrivUtKonto();

        nyKonto.uttak(1000);
    }
}