public class Oppgave4 {
    public static void main(String[] args) {
        // Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 99)
        int sum = 0;
        int antallTall = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                antallTall ++;
            }
        }

        int gjennomSnitt = sum / antallTall;
        System.out.println("Summen er: " + sum);
        System.out.println("Gjennomsnittet er: " + gjennomSnitt);
    }
}
