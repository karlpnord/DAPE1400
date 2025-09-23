public class Room {
    private double lengde;
    private double bredde;
    private String navn;

    public Room(double lengde, double bredde, String navn) {
        this.lengde = lengde;
        this.bredde = bredde;
        this.navn = navn;
    }

    public double getArea() {
        return lengde * bredde;
    }
}