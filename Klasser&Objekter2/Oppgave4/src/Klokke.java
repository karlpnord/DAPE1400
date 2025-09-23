public class Klokke {
    private int time;
    private int minutter;
    private int sekunder;

    public Klokke(int time, int minutter, int sekunder) {
        this.time = time;
        this.minutter = minutter;
        this.sekunder = sekunder;
    }

    public int getTime() {
        return this.time;
    }

    public int getMinutter() {
        return this.minutter;
    }

    public int getSekunder() {
        return this.sekunder;
    }

    public void setTime(int time) {
        if (time >= 0 && time <= 24) {
            this.time = time;
        } else {
            this.time = 0;
        }
    }

    public void setMinutter(int minutter) {
        if (minutter >= 0 && minutter <= 59) {
            this.minutter = minutter;
        } else {
            this.minutter = 0;
        }
    }

    public void setSekunder(int sekunder) {
        if (sekunder >= 0 && sekunder <= 24) {
            this.sekunder = sekunder;
        } else {
            this.sekunder = 0;
        }
    }

    public void visTiden() {
        System.out.println(time + ":" + minutter + ":" + sekunder);
    }
}
