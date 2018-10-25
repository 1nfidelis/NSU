package stackCalc.commands.history;

import stackCalc.commands.CommandInterface;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class History implements CommandInterface{
    public static ArrayList<HistoryData> history = new ArrayList<>();

    public static void add (CommandInterface command, double a) {
        history.add( new HistoryData(command, a) );
    }

    public static void add (CommandInterface command, double a, double b) {
        history.add( new HistoryData(command, a, b) );
    }

    public static void add (CommandInterface command) {
        history.add( new HistoryData(command) );
    }

    public static void add (CommandInterface command, String name, double value) {
        history.add( new HistoryData(command, name, value) );
    }

    public static void add (CommandInterface command, String name) {
        history.add( new HistoryData(command, name) );
    }

    @Override
    public String commandName() {
        return "history";
    }

    public static String string() {
        String str = "";
        for (int i = 0; i < history.size(); i++) {
            str += history.get(i).toString();
        }
        return str;
    }

    @Override
    public void doCommand() throws EmptyStackException {
        System.out.println(string());
    }
}
