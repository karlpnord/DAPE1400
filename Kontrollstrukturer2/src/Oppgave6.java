public class Oppgave6 {
    public static void main(String[] args) {
        // Lag en while-løkke som summerer alle tallene fra 0 til 10 og viser summen (0 til og med 9)
        int i = 0;
        int sum = 0;

        while (i < 10) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}
