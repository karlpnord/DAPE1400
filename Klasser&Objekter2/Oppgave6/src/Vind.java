public class Vind {
    private double vindHastighet = 0.0;

    public Vind(double vindHastighet) {
        this.vindHastighet = vindHastighet;
    }

    public double getVindHastighet() {
        return vindHastighet;
    }

    public boolean erOrkan() {
        if (vindHastighet >= 120) {
            return true;
        }
        return false;
    }

    public boolean erVindstille() {
        if (vindHastighet <= 2) {
            return true;
        }
        return false;
    }

    public double getKnop() {
        return vindHastighet / 1.852;
    }

    public int getBeaufort() {
        int beaufort = (int)(Math.pow(vindHastighet/3.01, 0.6666)+0.5);
        if(beaufort > 12) {
            beaufort = 12;
        }
        return beaufort;
    }
}
