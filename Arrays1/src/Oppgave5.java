public class Oppgave5 {
    public static void main(String[] args) {
        int tallArray[] = {10, 34, 5, 8, 45, 2, 13, 25};

        int storsteTall = tallArray[0], minsteTall = tallArray[0];

        for (int i = 0; i < tallArray.length; i++) {
            if (tallArray[i] > storsteTall) {
                storsteTall = tallArray[i];
            }

            if (tallArray[i] < minsteTall) {
                minsteTall = tallArray[i];
            }
        }

        System.out.println("Minst: " + minsteTall);
        System.out.println("Størst: " + storsteTall);
    }
}
