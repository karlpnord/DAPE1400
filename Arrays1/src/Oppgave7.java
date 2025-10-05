public class Oppgave7 {
    public static void main(String[] args) {
        int liste[] = {11, 34, 5, 8, 45, 2, 13, 25};
        int antallPartall = 0, antallOddetall = 0;

        for (int i = 0; i < liste.length; i++) {
            if (liste[i] % 2 == 0) {
                antallPartall ++;
            } else {
                antallOddetall ++;
            }
        }
        System.out.println("Antall partall: " + antallPartall);
        System.out.println("Antall oddetall: " + antallOddetall);
    }
}
