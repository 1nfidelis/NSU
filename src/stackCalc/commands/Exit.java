package stackCalc.commands;

import stackCalc.commands.history.History;

import java.util.NoSuchElementException;

public class Exit implements CommandInterface {
    @Override
    public void doCommand() {
        History.add(this);
        throw new NoSuchElementException();
    }

    @Override
    public String commandName() {
        return "exit";
    }
}
