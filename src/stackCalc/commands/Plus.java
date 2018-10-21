package stackCalc.commands;

import stackCalc.StackCalc;

import java.util.EmptyStackException;

public class Plus implements CommandInterface {

    @Override
    public void doCommand() throws EmptyStackException {
        double a = StackCalc.data.pop();
        double b = StackCalc.data.pop();
        Double tmp = Double.valueOf(a + b);
        StackCalc.data.push(tmp);
    }
}
