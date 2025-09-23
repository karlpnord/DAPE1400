public class Main {
    public  static void main(String[] args) {
        Apartment apartment = new Apartment();

        apartment.inputRooms();

        double totalArea = apartment.getTotalArea();

        double declaredArea = 51;

        if (totalArea == declaredArea) {
            System.out.println("Arealet er riktig");
            System.out.println(totalArea);
        } else {
            System.out.println("Arealet stemmer ikke");
            System.out.println(totalArea);
        }
    }
}