package work.projects.stackCalc.commands;


import work.projects.stackCalc.StackCalc;

public class Sqrt implements CommandInterface {
    @Override
    public void doCommand() {
        double a = StackCalc.data.pop();
        Double tmp = Double.valueOf(Math.sqrt(a));
        StackCalc.data.push(tmp);
    }
}
