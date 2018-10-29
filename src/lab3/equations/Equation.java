package lab3.equations;

import lab3.main.Main;
import lab3.methods.*;

import java.util.Arrays;

public abstract class Equation {
    protected double[] borders;
    protected String str;

    public abstract double solve(double x);

    public abstract double solveDiff(double x);

    protected double[] getBorders () {
        double h = 1/100.0;
        double[] border = new double[0];

        for (int i = 1; i < 101; i++) {
            if (Math.signum(solve((i-1)*h)) != Math.signum(solve(i*h)) ) {
                int tmp = border.length;
                border = Arrays.copyOf(border, tmp + 2);
                border[tmp] = (i-1)*h;
                border[tmp + 1] = i*h;
            }
        }
        System.out.println(border[1]);
        return border;
    }

    public void bisection() {
        ultimateOut(new Bisection(this));
    }

    public void hords() {
        ultimateOut(new Hords(this));
    }

    public void newton() {
        ultimateOut(new Newton(this));
    }

    public void paraboles() {
        ultimateOut(new Paraboles(this));
    }

    public void secants() {
        ultimateOut(new Secants(this));
    }

    private void ultimateOut(MethodInterface method) {

        Main.out.print(String.format("Количество итераций: %d\n", Methods.roots(method, borders)));
    }

    public void printAll() {
        Main.out.print(str);
        Methods.printInfo(this);
    }
}
