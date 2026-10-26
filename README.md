# SDP_assignment5 — Strategy Pattern

**Author:** Amerkhanova Aruzhan  
**Group:** SE-2529  
**Topic:** Option B — Calculator

Four interchangeable strategies perform addition, subtraction, multiplication and division.
`Main` changes the strategy on the same `Calculator` object while the program runs.

## Structure

- `src/Strategy.java` — common `execute(int a, int b)` method.
- `src/AddStrategy.java`, `SubtractStrategy.java`, `MultiplyStrategy.java`, `DivideStrategy.java` — algorithms.
- `src/Calculator.java` — stores a strategy and delegates calculation.
- `src/Main.java` — client and runtime switching demonstration.
- [report.md](report.md) — UML, Clean Code discussion and Strategy vs. State.

## Run in IntelliJ IDEA

1. Open the `SDP_assignment5` folder.
2. In **File → Project Structure → Project**, select JDK 17 and language level 17.
   If needed, use **Add SDK → JDK** and select your JDK 17 installation folder.
3. Ensure `src` is marked as **Sources Root**. The included module file declares this folder.
4. Open `src/Main.java` and run `Main.main()`.

## Run from a terminal

With JDK 17 on PATH, run these commands from the project folder:

```text
javac -d out src/*.java
java -cp out Main
```

Expected output:

```text
Amerkhanova Aruzhan | SE-2529
Addition: 16.0
Subtraction: 8.0
Multiplication: 48.0
Division: 3.0
Division (5 / 2): 2.5
Warning: Cannot divide by zero.
```

No libraries, build tools or user input are required. Strategies must be non-null.
Inputs are `int` values; results are `double` so division preserves the fractional part.
`DivideStrategy` throws `ArithmeticException` for a zero divisor. `Main` catches it
and prints an English warning without a stack trace.

## Add another strategy

Create a class implementing `Strategy` and implement `execute(int a, int b)`.
Select its instance in the client with `calculator.setStrategy(new YourStrategy())`.
The interface, calculator and existing strategies do not need changes.

Repository: https://github.com/xelllion/SDP_assignment5
