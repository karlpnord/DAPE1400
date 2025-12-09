public class Train implements Transport {
    private static double costPerMeter = 0.01;
    private static double timePerThousandMeters = 0.5;

    public double calculateCost(int distance) {
        return costPerMeter * distance;
    }

    public double calculateTime(int distance, int minutesTilNextTransport) {
        return (distance * timePerThousandMeters) / 1000 + minutesTilNextTransport;
    }
}
