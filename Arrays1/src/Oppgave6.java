public class Oppgave6 {
    public static void main(String[] args) {
        int liste1[] = {10, 34, 5, 8, 45, 2, 13, 25};
        int liste2[] = {10, 34, 5, 8, 45, 2, 13, 25};

        if (liste1.length != liste2.length) {
            System.out.println("De er ikke like lange");
        } else {
            boolean like = true;
            for (int i = 0; i < liste1.length; i++) {
                if (liste1[i] != liste2[i]) {
                    like = false;
                }
            }
            if (like) {
                System.out.println("Arrayene er like");
            } else {
                System.out.println("Arrayene er ikke like");
            }
        }
    }
}
