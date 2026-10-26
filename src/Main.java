public class Main {
    public static void main(String[] args) {
        System.out.println("Amerkhanova Aruzhan | SE-2529");

        int a = 12;
        int b = 0;
        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println("Addition: " + calculator.calculate(a, b));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtraction: " + calculator.calculate(a, b));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " + calculator.calculate(a, b));

        calculator.setStrategy(new DivideStrategy());
        try {
            System.out.println("Division: " + calculator.calculate(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Warning: " + e.getMessage());
        }
    }
}
