import java.util.ArrayList;

public class Oppgave3 {
    public static void main(String[] args) {
        int[] tallArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> nyTallListe = new ArrayList<>();

        for (int tall : tallArray) {
            nyTallListe.add(tall);
        }

        for (int tall : nyTallListe) {
            System.out.print(tall + " ");
        }
    }
}
