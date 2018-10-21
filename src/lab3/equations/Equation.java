package lab3.equations;

import lab3.main.Main;
import lab3.methods.*;

public abstract class Equation {
    protected double[] borders;
    protected String str;

    public abstract double solve (double x);

    public abstract double solveDiff (double x);

    public void bisection() {
        ultimateOut( new Bisection(this) );
    }

    public void hords() {
        ultimateOut( new Hords(this) );
    }

    public void newton() {
        ultimateOut( new Newton(this) );
    }

    public void paraboles() {
        ultimateOut( new Paraboles(this) );
    }

    public void secants() {
        ultimateOut( new Secants(this) );
    }

    private void ultimateOut(MethodInterface method) {

        Main.out.print(String.format("Количество итераций: %d\n", Methods.roots(method, borders)));
    }

    public void printAll() {
        Main.out.print(str);
        Methods.printInfo( this );
    }
}
