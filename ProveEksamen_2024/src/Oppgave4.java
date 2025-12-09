public class Oppgave4 {
    public static void main(String[] args) {
        SmartLamp lamp1 = new SmartLamp(new SmartLight(40, true), "HomeWifi");
        SmartLamp lamp2 = new SmartLamp("KitchenWifi");

        System.out.println(lamp1);
        System.out.println(lamp2);

        lamp1.setBrightnessLamp(80);
        System.out.println(lamp1);
    }
}
