public interface Transport {
    double calculateCost(int distance);
    double calculateTime(int distance, int minutesTilNextTransport);
}
