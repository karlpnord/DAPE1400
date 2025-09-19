import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        BensinKjøp bensinKjop1 = new BensinKjøp("Circle K Asker", "Diesel", 40, 20.47, "Fredag");
        double prisen = bensinKjop1.finnTotalPrisen();
        System.out.println(String.format("%.2f", prisen) + "kr");
    }
}
