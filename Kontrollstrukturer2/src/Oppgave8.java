public class Oppgave8 {
    public static void main(String[] args) {
        // Lag en while-løkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 98).
        int i = 0;
        int sum = 0;
        int antall = 0;

        while (i < 100) {
            if (i % 2 == 0) {
                sum += i;
                antall++;
            }

            i++;
        }

        int gjennomsnitt = sum / antall;
        System.out.println("Sum: " + sum);
        System.out.println("Gjnsnitt: " + gjennomsnitt);

    }
}
