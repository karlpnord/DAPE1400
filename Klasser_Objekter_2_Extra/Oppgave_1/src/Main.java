public class Main {
    public static void main(String[] args) {
        double salary = 1_240_000;
        double tax = Tax.calculateTax(salary);
        double stepTax = Tax.calculateStepTax(salary);
        double totalTax = tax + stepTax;
        System.out.println("Din skatt er: " + totalTax);
    }
}