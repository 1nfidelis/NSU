package my_classes.out;

import work.projects.lab3.main.Main;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutLab extends FileOut {

    public FileOutLab(String fileName) {
        try {
            fileOut = new FileWriter(fileName);
        } catch (IOException e) {
            Main.out = new ConsoleOut();
            Main.out.print("Ошибка вывода в файл");
        }
    }
}
