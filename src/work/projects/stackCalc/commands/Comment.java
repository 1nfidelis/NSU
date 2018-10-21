package work.projects.stackCalc.commands;

import static work.projects.stackCalc.StackCalc.read;

public class Comment implements CommandInterface {

    @Override
    public void doCommand() {
        read.comment();
    }


}
