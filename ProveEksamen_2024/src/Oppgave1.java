public class Oppgave1 {
    public void investigateStringArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                if (strings[i].contains("a")) {
                    System.out.println(strings[i]);
                }
            }
        }

        int antallTegn = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                antallTegn += strings[i].length();
            }
        }
        System.out.println("Antall tegn i arrayet: " + antallTegn);

        int antallNull = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                antallNull += 1;
            }
        }
        System.out.println("Antall null: " + antallNull);
    }

    public static void main(String[] args) {
        String[] stringListe = {null, "test", "hallo", null, "faen", null};

        Oppgave1 oppgave = new Oppgave1();
        oppgave.investigateStringArray(stringListe);
    }
}