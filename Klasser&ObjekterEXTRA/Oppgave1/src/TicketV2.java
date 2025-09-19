import static javax.swing.JOptionPane.*;

public class TicketV2 {
    private String name;
    private String personNr;
    private String destination;

    public TicketV2(String name, String personNr, String destination) {
        int personNrLength = personNr.length();

        if (personNrLength == 11) {
            this.name = name;
            this.personNr = personNr;
            this.destination = destination;
        } else {
            showMessageDialog(null,"Advarsel, person nummer er feil!");
        }
    }

    public void printTicketInfo() {
        System.out.println("\nTicket info");
        System.out.println("Name: " + this.name);
        System.out.println("Person Nr: " + hidePersonNr(this.personNr) + "*****");
        System.out.println("Destination: " + this.destination);
    }

    private String hidePersonNr(String personNr) {
        return personNr.substring(0, 6);
    }

    public boolean checkPersonNr(String personNr) {
        return this.personNr.equals(personNr);
    }

    public void setPassengerInfo(String name, String personNr) {
        if (personNr.length() == 11) {
            this.name = name;
            this.personNr = personNr;
        } else {
            showMessageDialog(null, "Warning: Fødselnr hadde feil lengde. \n Passasjer detaljer ble ikke endret");
        }
    }

    public String getDestination() {
        return this.destination;
    }
}

