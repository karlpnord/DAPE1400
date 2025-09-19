import static javax.swing.JOptionPane.*;

public class TicketV2 {
    private String name;
    private String personNr;
    private String destination;

    public TicketV2(String name, String personNr, String destination) {
        int personNrLength = personNr.length();
        int nameLength = name.length();

        if (personNrLength >= 11 && nameLength >= 2) {
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

    public void setPassengerInfo(String name, String personNr) {
        this.name = name;
        this.personNr = personNr;
    }

    public String getDestination() {
        return this.destination;
    }
}

