package my_classes.out;

import work.projects.stackCalc.StackCalc;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutCalc extends FileOut {

    public FileOutCalc(String fileName) {
        try {
            fileOut = new FileWriter(fileName);
        } catch (IOException e) {
            StackCalc.out = new ConsoleOut();
            StackCalc.out.print("Ошибка вывода в файл");
        }
    }
}

