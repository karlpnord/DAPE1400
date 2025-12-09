import java.util.ArrayList;

public class Oppgave5 {
    public static void main(String[] args) {
        Train train1 = new Train();
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        ArrayList<Transport> arrayList = new ArrayList<>();
        arrayList.add(train1);
        arrayList.add(taxi1);
        arrayList.add(taxi2);

        double priceFor1000Meters = 0, timeFor1000Meters = 0;
        for (Transport item : arrayList) {
            priceFor1000Meters += item.calculateCost(50000);

            if (item instanceof Train) {
                timeFor1000Meters += item.calculateTime(50000, 30);
            } else if (item instanceof Taxi) {
                timeFor1000Meters += item.calculateTime(50000, 5);
            }
        }
        System.out.println("Price for 1000 meters: " + priceFor1000Meters + " kr");
        System.out.println("Time for 1000 meters: " + timeFor1000Meters + " minutes");
    }
}
