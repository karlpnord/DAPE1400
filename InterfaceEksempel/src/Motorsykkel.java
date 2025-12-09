public class Motorsykkel implements Kjøretøy {
    public String carModel;
    public Dato carRegisterDate;
    public String signRegister;

    // lag også konstruktør for alle attributtene
    public Motorsykkel (String carModel, Dato carRegisterDate, String signRegister) {
        this.carModel = carModel;
        this.carRegisterDate = carRegisterDate;
        this.signRegister = signRegister;
    }

    public String toString() {
        String ut = "Car Model: " + carModel +"\n" + "Registered: " + carRegisterDate + "\n" + "Sign: " + signRegister;
        return ut;
    }
}
