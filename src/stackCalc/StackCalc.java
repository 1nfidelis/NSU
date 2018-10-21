package stackCalc;


import my_classes.out.ConsoleOut;
import my_classes.out.Out;
import stackCalc.commands.CommandInterface;
import stackCalc.factory.CommandFactory;
import stackCalc.read.ConsoleReader;
import stackCalc.read.FileRead;
import stackCalc.read.Reader;

import java.io.FileNotFoundException;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;


public class StackCalc {
    public static Stack<Double> data = new Stack<>();
    public static Reader read = new ConsoleReader();
    public static Out out = new ConsoleOut();


    public static void main(String[] args) {
        try {
            out.print("Введите путь до файла с командами:");
            read = new FileRead(read.readString());
        } catch (FileNotFoundException e) {
            out.print("Файл не найдет. Вводите команды с консоли:");
            read = new ConsoleReader();
        }

        try {
            String CommandName;
            while (true) {
                try {
                    CommandName = read.readString();
                    CommandInterface command = CommandFactory.makeCommand(CommandName);
                    command.doCommand();
                } catch (EmptyStackException e) {
                    StackCalc.out.print("Извините, недостаточно элементов в стеке");
                }
            }
        } catch (NoSuchElementException e) {
            out.print("До свидания!");
        }


    }

}