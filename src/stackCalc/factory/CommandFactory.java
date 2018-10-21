package stackCalc.factory;

import stackCalc.StackCalc;
import stackCalc.commands.*;
import stackCalc.commands.define.Define;

public class CommandFactory {

    public static CommandInterface makeCommand(String str) {

        while (true) {
            str.toLowerCase();
            switch (str) {
                case "divide": return new Divide();
                case "multiply": return new Multiply();
                case "minus": return new Minus();
                case "sqrt": return new Sqrt();
                case "plus": return new Plus();
                case "define": return new Define();
                case "#": return new Comment();
                case "print": return new Print();
                case "push": return new Push();
                case "exit": return new Exit();

                default: {
                    if (str.charAt(0) == '#') { return new Comment(); }
                    StackCalc.out.print("Повторите попытку ввода: ");
                    str = StackCalc.read.readString();
                }
            }

        }
    }
}
