package lab3.equations;

public class SecondEquation extends Equation {

    public SecondEquation() {
        borders = new double[4];
        borders[0] = 0;
        borders[1] = 0.3;
        borders[2] = 0.48;
        borders[3] = 1;
        str = "Второе уравнение, три корня";
    }

    @Override
    public double solve(double x) {
        double equation = Math.pow(x, 3) - 1.44*Math.pow(x,2) + 0.6203*x - 0.07866;
        return equation;
    }

    @Override
    public double solveDiff(double x) {
        double equation = 3*Math.pow(x,2) + 0.6203 - 2.88*x;
        return equation;
    }

}
