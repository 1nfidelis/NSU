package stackCalc.commands.one_arg;

import stackCalc.StackCalc;
import stackCalc.commands.CommandInterface;
import stackCalc.commands.history.History;

import java.util.EmptyStackException;

public abstract class OneArgumentPattern implements CommandInterface {

    protected abstract double solve(double a);

    public abstract String commandName();

    @Override
    public void doCommand() throws EmptyStackException {
        errorCheck();
    }

    private void errorCheck () {
        double a = 0;

        if ( StackCalc.data.empty() ) {
            throw new EmptyStackException();
        }

        try {
            a = StackCalc.data.pop();
            Double tmp = Double.valueOf(solve(a));
            StackCalc.data.push(tmp);
            History.add(this, a);
        } catch (EmptyStackException e) {
            StackCalc.data.push(Double.valueOf(a));
            throw new EmptyStackException();
        }
    }
}
