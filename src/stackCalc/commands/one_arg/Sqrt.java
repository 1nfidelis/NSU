package stackCalc.commands.one_arg;



public class Sqrt extends OneArgumentPattern {

    @Override
    public String commandName() {
        return "sqrt";
    }

    @Override
    protected double solve(double a) {
        return Math.sqrt(a);
    }

}
