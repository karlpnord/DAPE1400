import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        String navn = showInputDialog("Navn?");
        String personNr = showInputDialog("Personnummer?");
        String destinasjon = showInputDialog("Destinasjon?");

        TicketV2 ticket1 = new TicketV2(navn, personNr, destinasjon);
        ticket1.printTicketInfo();
    }
}
