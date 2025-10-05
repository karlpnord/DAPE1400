public class Oppgave3 {
    public static void main(String[] args) {
        String array[] = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};
        int counter = 0;

        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i] + " " + array[i+1]);
        }
    }
}
