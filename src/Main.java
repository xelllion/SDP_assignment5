public class Main {
    public static void main(String[] args) {
        System.out.println("Amerkhanova Aruzhan | SE-2529");

        int a = 12;
        int b = 4;
        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println("Addition: " + calculator.calculate(a, b));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtraction: " + calculator.calculate(a, b));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " + calculator.calculate(a, b));

        calculator.setStrategy(new DivideStrategy());
        System.out.println("Division: " + calculator.calculate(a, b));
        System.out.println("Division (5 / 2): " + calculator.calculate(5, 2));

        try {
            System.out.println("Division (12 / 0): " + calculator.calculate(a, 0));
        } catch (ArithmeticException e) {
            System.out.println("Warning: " + e.getMessage());
        }
    }
}
