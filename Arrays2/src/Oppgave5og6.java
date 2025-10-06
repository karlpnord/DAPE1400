import static javax.swing.JOptionPane.*;

public class Oppgave5og6 {
    public static void main(String[] args) {
        int antallAnmeldere, antallFilmer;

        String innAntallAnmeldere = showInputDialog("Antall anmeldere");
        try {
            antallAnmeldere = Integer.parseInt(innAntallAnmeldere);
        } catch (Exception e) {
            antallAnmeldere = 0;
        }

        String innAntallFilmer = showInputDialog("Antall filmer");
        try {
            antallFilmer = Integer.parseInt(innAntallFilmer);
        } catch (Exception e) {
            antallFilmer = 0;
        }

        if (antallFilmer == 0 || antallAnmeldere == 0) {
            showMessageDialog(null, "Programmet stoppes fordi riktig informasjon ikke er oppgitt");
        } else {
            int[][] score = new int[antallAnmeldere][antallFilmer];
            int filmScore;
            String innFilmScore;

            for (int rad = 0; rad < score.length; rad++) {
                for (int kolonne = 0; kolonne < score[rad].length; kolonne++) {
                    innFilmScore = showInputDialog("Score på filmen");

                    try {
                        filmScore = Integer.parseInt(innFilmScore);

                        if (filmScore >= 0 && filmScore <= 9) {
                            score[rad][kolonne] = filmScore;
                        }
                    } catch (Exception e) {
                        showMessageDialog(null, "Ikke gylid input");
                    }
                }
            }

            for (int rad = 0; rad < score.length; rad++) {
                int sum = 0;
                for (int kolonne = 0; kolonne < score[rad].length; kolonne++) {
                    sum += score[rad][kolonne];
                }

                int gjennomsnittScore = sum / score[rad].length;
                System.out.println("Gjennomsnitt for film " + (rad + 1) + ": " + gjennomsnittScore);
            }
        }


    }
}
