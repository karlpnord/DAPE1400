public class Oppgave2 {
    public static void main(String[] args) {
        int[] tallArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // SUM
        int sum = 0;
        for (int i = 0; i < tallArray.length; i++) {
            sum += tallArray[i];
        }
        System.out.println("Sum: " + sum);

        // GJENNOMSNITT
        int gjennomsnitt = sum / tallArray.length;
        System.out.println("Gjennomsnitt: " + gjennomsnitt);

        // SUMMER ALLE TALL STØRRE ENN 5
        int nySum = 0;
        int antallTallStorreEnn5 = 0;
        for (int i = 0; i < tallArray.length; i++) {
            if (tallArray[i] > 5) {
                antallTallStorreEnn5 ++;
                nySum += tallArray[i];
            }
        }
        System.out.println("Sum av tall større enn 5: " + nySum);

        // GJENNOMSNITT AV TALL STØRRE ENN 5 (litt fra den over og
        int nyGjennomsnitt = nySum / antallTallStorreEnn5;
        System.out.println(antallTallStorreEnn5);
        System.out.println("Gjennomsnitt av tall større enn 5: " + nyGjennomsnitt);

        // SUM MED FORENKLET LØKKE
        int nySum2 = 0;
        for (int i : tallArray) {
            nySum2 += i;
        }
        System.out.println("Forenklet løkke sum: " + nySum2);
    }
}
