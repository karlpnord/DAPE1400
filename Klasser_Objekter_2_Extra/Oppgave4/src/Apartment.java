import static javax.swing.JOptionPane.*;

public class Apartment {
    private Room stue;
    private Room kjokken;
    private Room soverom;
    private Room bad;
    private Room entre;

    public void inputRooms() {
        stue = createRoom("Stue");
        bad = createRoom("Bad");
        entre = createRoom("Entre");
        kjokken = createRoom("Kjokken");
        soverom = createRoom("Soverom");
    }

    private Room createRoom(String rom) {
        String lengdeInput = showInputDialog("Lengde");
        String breddeInput = showInputDialog("Bredde");

        double lengde = Double.parseDouble(lengdeInput);
        double bredde = Double.parseDouble(breddeInput);

        Room newRoom = new Room(lengde, bredde, rom);

        return newRoom;
    }

    public double getTotalArea() {
        return stue.getArea() + bad.getArea() + entre.getArea() + soverom.getArea() + kjokken.getArea();
    }
}
