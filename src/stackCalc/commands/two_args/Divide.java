package stackCalc.commands.two_args;

public class Divide extends TwoArgumentsPattern {

    @Override
    protected double solve(double a, double b) {
        return b / a;
    }

    @Override
    public String commandName() {
        return "divide";
    }
}
