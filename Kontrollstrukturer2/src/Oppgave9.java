public class Oppgave9 {
    public static void main(String[] args) {
        int antall = 10;
        double sum = 0;

        for (double i = 0; i < antall; i++) {
            sum += (4.0 / (2 * i + 1)) * Math.pow(-1, i);
        }

        System.out.println(sum);
    }
}
