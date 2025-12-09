public class Bil implements Kjøretøy {
    public String carModel;
    public Dato carRegisterDate;
    public String signRegister;
    private int lasteKapasitet;

    // lag også konstruktør for alle attributtene
    public Bil (String carModel, Dato carRegisterDate, String signRegister, int lasteKapasitet) {
        this.carModel = carModel;
        this.carRegisterDate = carRegisterDate;
        this.signRegister = signRegister;
        this.lasteKapasitet = lasteKapasitet;
    }

    public String toString() {
        String ut = "Car Model: " + carModel +"\n" + "Registered: " + carRegisterDate + "\n" + "Sign: " + signRegister + "\n" + "Load Capacity: " + lasteKapasitet + "kg";
        return ut;
    }
}
