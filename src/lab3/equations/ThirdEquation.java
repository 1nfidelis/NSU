package lab3.equations;

public class ThirdEquation extends Equation {

    public ThirdEquation() {
        borders = new double[3];
        borders[0] = 0;
        borders[1] = 0.45;
        borders[2] = 1;
        str = "Третье уравнение, два кореня";
    }

    @Override
    public double solve(double x) {
        double equation = Math.exp(x) - 1.59 * x - 0.945;
        return equation;
    }

    @Override
    public double solveDiff(double x) {
        double equation = Math.exp(x) - 1.59;
        return equation;
    }

}
