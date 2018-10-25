package stackCalc.commands;

import java.util.EmptyStackException;

public interface CommandInterface {
    void doCommand() throws EmptyStackException;

    String toString();
    String commandName();
}
