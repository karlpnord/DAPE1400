public class Oppgave3 {
    public static void main(String[] args) {
        char[] array = {'T', 'A', 'F', 'D'};
        char[] reversedArray = reverseArray(array);

        for (char item : reversedArray) {
            System.out.print(item + " ");
        }
    }
    /* Metoden er satt til public fordi dette er bare en generell hjelpefunksjon som reverserer et array
    * Ved å bruke public vil den være tilgjengelig utenfor klassen.
    * Hvis den var private ville metoden kun vært synlig innenfor samme klasse noe som begrenser bruken av den
    * I dette tilfellet er det ingen grunn til å skjule funksjonaliteten.
    *  */

    public static char[] reverseArray(char[] charArray) {
        char[] reversedArray = new char[charArray.length];
        int count = 0;

        for (int i = charArray.length; i > 0; i--) {
            reversedArray[i - 1] = charArray[count];
            count ++;
        }

        return reversedArray;
    }
}
