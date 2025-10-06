import java.util.ArrayList;

public class Oppgave1 {
    public static void main(String[] args) {
        ArrayList<Integer> tallListe = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            tallListe.add(i);
        }
        System.out.println("Element nr 3: " + tallListe.get(3));
        System.out.println("Element nr 6: " + tallListe.get(6));
    }
}
