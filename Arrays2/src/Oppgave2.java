import java.util.ArrayList;

public class Oppgave2 {
    public static void main(String[] args) {
        ArrayList<Integer> tallListe = new ArrayList<>();

        for (int i = 1; i < 12; i++) {
            tallListe.add(i);
        }

        // Kan også legge til tall på denne måten
        // tallListe.add(10);
        // tallListe.add(11);

        tallListe.remove(1);
        tallListe.remove(1);

        for (int tall : tallListe) {
            System.out.println(tall);
        }

        int lengde = tallListe.size();
        System.out.println("Lengden på ArrayListen er: " + lengde);
    }
}
