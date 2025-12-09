public class Motorsykkel extends Kjøretøy {
    public Motorsykkel (String carModel, Dato carRegisterDate, String signRegister) {
        super(carModel, carRegisterDate, signRegister);
    }

    public String toString() {
        String ut = "Car Model: " + carModel +"\n" + "Registered: " + carRegisterDate + "\n" + "Sign: " + signRegister;
        return ut;
    }
}