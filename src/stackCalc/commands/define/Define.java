package stackCalc.commands.define;


import stackCalc.StackCalc;
import stackCalc.commands.CommandInterface;

import java.util.ArrayList;

public class Define implements CommandInterface {

    public static ArrayList<DefineElement> array = new ArrayList<>();

    @Override
    public void doCommand() {
        String tmpStr = StackCalc.read.readString();
        double tmpDouble = StackCalc.read.readDouble();

        createNew(new DefineElement(tmpStr, tmpDouble));
    }

    private void createNew(DefineElement element) {
        if (search(element)) {
            array.add(element);
        }

    }

    public static double searchDefine(String name) {

        for (int i = 0; i < array.size(); i++) {
            var tmp = array.get(i);
            if (tmp.name.equals(name)) {
                return tmp.value;
            }
        }
        return Double.NaN;
    }

    private boolean search(DefineElement element) {

        for (int i = 0; i < array.size(); i++) {
            var tmp = array.get(i);
            if (tmp.name.equals(element.name)) {
                tmp.value = element.value;
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (var tmp : array) {
            str.append(tmp.toString() + "\n");
        }
        return str.toString();
    }
}
