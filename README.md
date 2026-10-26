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

Expected output with the current values `a = 12` and `b = 0`:

```text
Amerkhanova Aruzhan | SE-2529
Addition: 12.0
Subtraction: 12.0
Multiplication: 0.0
Warning: Cannot divide by zero.
```

No libraries, build tools or user input are required. Strategies must be non-null.
Inputs are `int` values; results are `double` so division preserves the fractional part.
`DivideStrategy` throws `ArithmeticException` for a zero divisor. `Main` catches it
and prints an English warning without a stack trace.

## Change the numbers and check division

Edit only `a` and `b` at the beginning of `Main.main()`, then run `Main` again.
All four strategies use those same values. There are no separate hard-coded division examples.

| Values | Expected division output |
| --- | --- |
| `a = 12`, `b = 4` | `Division: 3.0` |
| `a = 5`, `b = 2` | `Division: 2.5` |
| `a = -5`, `b = 2` | `Division: -2.5` |
| `a = 0`, `b = 2` | `Division: 0.0` |
| `a = 12`, `b = 0` | `Warning: Cannot divide by zero.` |

The division call is inside `try/catch`, so a zero divisor produces a warning
and the program finishes normally (exit code 0), without an exception stack trace.

## Add another strategy

Create a class implementing `Strategy` and implement `execute(int a, int b)`.
Select its instance in the client with `calculator.setStrategy(new YourStrategy())`.
The interface, calculator and existing strategies do not need changes.

Repository: https://github.com/xelllion/SDP_assignment5
