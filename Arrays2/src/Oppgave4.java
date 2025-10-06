import java.util.ArrayList;

public class Oppgave4 {
    public static void main(String[] args) {
        ArrayList<Integer> tallListe = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            tallListe.add(i);
        }

        int[] tallListe2 = new int[tallListe.size()];

        for (int i = 0; i < tallListe.size(); i++) {
            tallListe2[i] = tallListe.get(i);
        }

        for (int tall : tallListe2) {
            System.out.print(tall + " ");
        }
    }
}
