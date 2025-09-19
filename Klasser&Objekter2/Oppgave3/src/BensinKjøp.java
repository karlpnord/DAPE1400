public class BensinKjøp {
    private String lokasjon;
    private String bensinType;
    private double antallLiter;
    private double prisPerLiter;
    private String tidspunkt;

    public BensinKjøp(String lokasjon, String bensinType, double antallLiter, double prisPerLiter, String tidspunkt) {
        this.lokasjon = lokasjon;
        this.bensinType = bensinType;
        this.antallLiter = antallLiter;
        this.prisPerLiter = prisPerLiter;
        this.tidspunkt = tidspunkt;
    }

    public String getLokasjon() {
        return this.lokasjon;
    }

    public void setLokasjon(String lokasjon) {
        this.lokasjon = lokasjon;
    }

    public String getBensinType() {
        return this.bensinType;
    }

    public void setBensinType(String bensinType) {
        this.bensinType = bensinType;
    }

    public double getAntallLiter() {
        return this.antallLiter;
    }

    public void setAntallLiter(double antallLiter) {
        this.antallLiter = antallLiter;
    }

    public double getPrisPerLiter() {
        return this.prisPerLiter;
    }

    public void setPrisPerLiter(double prisPerLiter) {
        this.prisPerLiter = prisPerLiter;
    }

    public String getTidspunkt() {
        return this.tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public double finnTotalPrisen() {
        return prisPerLiter * antallLiter;
    }
}
