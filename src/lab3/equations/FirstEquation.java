package lab3.equations;


public class FirstEquation extends Equation {

    public FirstEquation() {
        borders = new double[2];
        borders[0] = 0;
        borders[1] = 1;
        str = "Первое уравнение, один корень";
    }

    @Override
    public  double solve(double x) {
        double equation = Math.cos(x) - x;
        return equation;
    }

    @Override
    public double solveDiff(double x) {
        double equation = - Math.sin(x) - 1;
        return equation;
    }
}
