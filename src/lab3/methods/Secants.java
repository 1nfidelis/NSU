package lab3.methods;

import lab3.equations.Equation;
import lab3.main.Main;

public class Secants implements MethodInterface {
    private Equation equation;

    public Secants(Equation equation) {
        this.equation = equation;
    }

    @Override
    public int solve(double a, double b) {

        int counter = 0;
        double c = (a + b) / 2;

        while (Math.abs(equation.solve(c)) > 1.0E-12) {
            b = a;
            a = c;
            c = a - equation.solve(a) * (a - b) / (equation.solve(a) - equation.solve(b));
            counter++;
        }

        Main.out.print(String.format("Точка: %e", c));
        return counter;
    }
}
