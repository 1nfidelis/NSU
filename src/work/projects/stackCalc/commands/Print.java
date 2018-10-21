package work.projects.stackCalc.commands;

import work.projects.stackCalc.StackCalc;

public class Print implements CommandInterface {
    @Override
    public void doCommand() {
        String tmp = StackCalc.data.get(StackCalc.data.size() - 1).toString();
        StackCalc.out.print(tmp);
    }
}
