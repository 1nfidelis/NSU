package work.projects.lab3.methods;

import work.projects.lab3.equations.Equation;
import work.projects.lab3.main.Main;

public class Bisection implements MethodInterface {

    private Equation equation;
    public Bisection (Equation equation) {
        this.equation = equation;
    }

    public int solve(double a, double b) {
        double newA = a;
        double newB = b;
        double point = (newB + newA)* 0.5;
        int counter = 0;

        while (Math.abs(equation.solve(point)) > 1.0E-12) {
            counter++;
            if (sign(newA, point)) {
                newB = point;
            }

            if (sign(point, newB)) {
                newA = point;
            }
            point = (newB + newA)* 0.5;
        }

        Main.out.print(String.format("Точка: %e",point));
        return counter;
    }

    private boolean sign (double a, double b) {
        return Math.signum(equation.solve(a)) != Math.signum(equation.solve(b));
    }

}
