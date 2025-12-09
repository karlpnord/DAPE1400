public class SmartLight {
    private int brightnessPercentage;
    private boolean isOn;

    public SmartLight(int brightnessPercentage, boolean isOn) {
        this.brightnessPercentage = brightnessPercentage;
        this.isOn = isOn;
    }

    public int getBrightnessPercentage() { return this.brightnessPercentage; }
    public boolean getIsOn() { return this.isOn; }

    public void setBrightnessPercentage(int newBrightnessPercentage) {
        if (newBrightnessPercentage > 100 || newBrightnessPercentage < 0) {
            /* Fallback hvis brightnesspercentage er mindre enn 0 eller større enn 100 */
            this.brightnessPercentage = 0;
        } else {
            this.brightnessPercentage = newBrightnessPercentage;
        }
    }

    public void setIsOn(boolean newIsOn) { this.isOn = newIsOn; }

    @Override
    public String toString() {
        return "SmartLight{" +
                "brightnessPercentage=" + brightnessPercentage +
                ", isOn=" + isOn +
                '}';
    }
}
