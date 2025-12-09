public class SmartLamp {
    private SmartLight installedBulb;
    private String wifiName;

    public SmartLamp(SmartLight installedBulb, String wifiName) {
        this.installedBulb = installedBulb;
        this.wifiName = wifiName;
    }

    public SmartLamp(String wifiName) {
        this.wifiName = wifiName;
    }

    public SmartLight getInstalledBulb() { return this.installedBulb; }
    public String getWifiName() { return this.wifiName; }

    public void setInstalledBulb(SmartLight newInstalledBulb) { this.installedBulb = newInstalledBulb; }
    public void setWifiName(String newWifiName) { this.wifiName = newWifiName; }

    public void setBrightnessLamp(int newBrightness) {
        installedBulb.setBrightnessPercentage(newBrightness);
    }

    @Override
    public String toString() {
        return "SmartLamp{" +
                "installedBulb=" + installedBulb +
                ", wifiName='" + wifiName + '\'' +
                '}';
    }
}
