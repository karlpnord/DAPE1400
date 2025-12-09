public class Taxi implements Transport {
    private static double costPerMeter = 0.05;
    private static double basePrice = 50.0;
    private static double timePerThousandMeters = 1.0;

    public double calculateCost(int distance) {
        return costPerMeter * distance + basePrice;
    }

    public double calculateTime(int distance, int minutesTilNextTransport) {
        return (distance * timePerThousandMeters) / 1000 + minutesTilNextTransport;
    }
}
