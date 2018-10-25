package stackCalc.commands;

import stackCalc.StackCalc;
import stackCalc.commands.define.Define;
import stackCalc.commands.history.History;


public class Push implements CommandInterface {
    @Override
    public String commandName() {
        return "push";
    }

    @Override
    public void doCommand() {
        try {
            String data = StackCalc.read.readString();
            double value = Define.searchDefine(data);
            if (Double.isNaN(value) == true) {
                value = Double.parseDouble(data);
                History.add(this, value);
            } else {
                History.add(this, data);
            }

            StackCalc.data.push(Double.valueOf(value));

        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }
}
