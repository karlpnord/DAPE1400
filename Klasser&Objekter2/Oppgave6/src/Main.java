import static javax.swing.JOptionPane.*;

public class Main {
    static void main(String[] args) {
        String innVind = showInputDialog("Oppgi vindhastigheten: ");
        double vind = Double.parseDouble(innVind);

        Vind sjekkVind = new Vind(vind);
        String utskrift = "Vindhastigheten er " + sjekkVind.getVindHastighet() + "\n";

        if(sjekkVind.erOrkan()) {
            utskrift += "Det er orkan.\n";
        }

        if(sjekkVind.erVindstille()) {
            utskrift += "Det er vindstille.\n";
        }

        String knop = String.format("%.2f", sjekkVind.getKnop());
        utskrift += "Det er " + knop + " knop.\n";

        utskrift += "Og det tilsvarer " + sjekkVind.getBeaufort() + " på beaufort-skalaen";
        showMessageDialog(null, utskrift);
    }
}