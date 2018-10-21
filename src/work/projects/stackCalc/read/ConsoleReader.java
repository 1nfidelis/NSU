package work.projects.stackCalc.read;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    private Scanner scan;


    public ConsoleReader() {
        scan = new Scanner(System.in);
    }

    @Override
    public double readDouble() {
        return scan.nextDouble();
    }

    @Override
    public String readString() {
        return scan.next();
    }

    @Override
    public void comment() {
        scan.nextLine();
    }
}

