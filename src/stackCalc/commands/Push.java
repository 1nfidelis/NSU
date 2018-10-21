package stackCalc.commands;

import stackCalc.StackCalc;
import stackCalc.commands.define.Define;

public class Push implements CommandInterface {
    @Override
    public void doCommand() {
        String data = StackCalc.read.readString();
        double value = Define.searchDefine(data);
        if (Double.isNaN(value) == true) {
            value = Double.parseDouble(data);
        }

        StackCalc.data.push(Double.valueOf(value));
    }
}
