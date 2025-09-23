public class Tax {
    private static final double FREE_LIMIT = 100_000;
    private static final double TAX_RATE = 0.22;
    private static double TRINN_1 = 217_400;
    private static double TRINN_2 = 306_050;
    private static double TRINN_3 = 697_150;
    private static double TRINN_4 = 942_400;
    private static double TRINN_5 = 1_410_750;

    public static double calculateTax(double salary) {
        if (salary < FREE_LIMIT) {
            return 0;
        }
        return (salary - FREE_LIMIT) * TAX_RATE;
    }

    public static double calculateStepTax(double salary) {
        if (salary < TRINN_1) {
            return 0;
        } else if (salary < TRINN_2) {
            return (salary - TRINN_1) * 0.017;
        } else if (salary < TRINN_3) {
            return (salary - TRINN_2) * 0.04;
        } else if (salary < TRINN_4) {
            return (salary - TRINN_3) * 0.137;
        } else if (salary < TRINN_5) {
            return (salary - TRINN_4) * 0.167;
        } else {
            return (salary - TRINN_5) * 0.177;
        }
    }
}
