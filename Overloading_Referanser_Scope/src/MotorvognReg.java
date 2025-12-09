import java.util.ArrayList;

public class MotorvognReg {

    public static void main(String[] args) {
        // opprett et array av Biler
        ArrayList<Kjøretøy> register = new ArrayList<>();

        // Sett inn noen biler i arrayet
        register.add(new Bil("Toyota", new Dato(15, 3, 2020), "FE12312", 42));
        register.add(new Bil("Volvo", new Dato(1, 7, 2018), "AD13445", 40));
        register.add(new Bil("BMW", new Dato(20, 11, 2022), "LG12312", 41));
        register.add(new Motorsykkel("Yamaha", new Dato(5, 12, 2017), "KG12333"));

        // List motorvognregisteret (arrayet) ved hjelp av en løkke
        for (Kjøretøy etKjøretøy : register) {
            System.out.println(etKjøretøy);
            System.out.println("---------------");
        }
    }
}
