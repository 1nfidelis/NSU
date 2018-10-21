package stackCalc.commands;

import java.util.NoSuchElementException;

public class Exit implements CommandInterface {
    @Override
    public void doCommand() {
        throw new NoSuchElementException();
    }
}
