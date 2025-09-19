import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        String navn = showInputDialog("Navn?");
        String personNr = showInputDialog("Personnummer?");
        String destinasjon = showInputDialog("Destinasjon?");

        TicketV2 ticket1 = new TicketV2(navn, personNr, destinasjon);
        ticket1.printTicketInfo();

        String passportPersonNr = showInputDialog("Checking counter, please input passport person nr");
        boolean personNrIsCorrect = ticket1.checkPersonNr(passportPersonNr);

        if (personNrIsCorrect) {
            showMessageDialog(null,"Welcome aboard");
        } else {
            showMessageDialog(null, "Call PST");
        }
    }
}
