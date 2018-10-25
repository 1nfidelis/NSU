package stackCalc.commands;

import stackCalc.StackCalc;
import stackCalc.commands.history.History;

public class Print implements CommandInterface {
    @Override
    public String commandName() {
        return "print";
    }

    @Override
    public void doCommand() {
        String tmpString = StackCalc.data.peek().toString();
        StackCalc.out.print(tmpString);
        History.add(this);
    }
}
