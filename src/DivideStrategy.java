public class DivideStrategy implements Strategy {
    @Override
    public double execute(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) a / b;
    }
}
