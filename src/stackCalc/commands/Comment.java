package stackCalc.commands;

import static stackCalc.StackCalc.read;

public class Comment implements CommandInterface {

    @Override
    public void doCommand() {
        read.comment();
    }


}
