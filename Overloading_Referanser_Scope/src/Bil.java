public class Bil extends Kjøretøy {
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer
    private int lasteKapasitet;

    // lag også konstruktør for alle attributtene
    public Bil (String carModel, Dato carRegisterDate, String signRegister, int lasteKapasitet) {
        super(carModel, carRegisterDate, signRegister);
        this.lasteKapasitet = lasteKapasitet;
    }

    public String toString() {
        String ut = "Car Model: " + carModel +"\n" + "Registered: " + carRegisterDate + "\n" + "Sign: " + signRegister + "\n" + "Load Capacity: " + lasteKapasitet;
        return ut;
    }
}