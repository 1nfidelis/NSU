package work.projects.stackCalc.commands;

import work.projects.stackCalc.StackCalc;

import java.util.EmptyStackException;

public class Divide implements CommandInterface {
    @Override
    public void doCommand() throws EmptyStackException {
            double a = StackCalc.data.pop();
            double b = StackCalc.data.pop();
            Double tmp = Double.valueOf(b / a);
            StackCalc.data.push(tmp);
    }
}
