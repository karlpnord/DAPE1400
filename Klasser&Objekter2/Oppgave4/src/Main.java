public class Main {
    static void main(String[] args) {
        Klokke nyTid1 = new Klokke(23, 56, 24);
        nyTid1.visTiden();

        nyTid1.setSekunder(23);
        nyTid1.setMinutter(11);
        nyTid1.setTime(11);
        nyTid1.visTiden();
    }
}