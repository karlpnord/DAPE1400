public class Oppgave3 {
    // Lag en forløkke som viser alle partall mellom fra 0 til 20 med et mellomrom mellom tallene (0 til og med 18).
    public static void main(String[] args) {
        String ut = "";

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                ut += i + " ";
            }
        }
        System.out.println(ut);
    }
}
