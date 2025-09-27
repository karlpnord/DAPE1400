public class Oppgave7 {
    public static void main(String[] args) {
        // Lag en while-løkke som viser alle partall mellom fra 0 til 20 med et mellomrom mellom tallene (0 til og med 18).
        int i = 0;
        String out = "";

        while (i < 20) {
            if (i % 2 == 0) {
                out += i + " ";
            }
            i++;
        }
        System.out.println(out);
    }
}
