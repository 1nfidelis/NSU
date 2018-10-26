package lab3.main;

import lab3.equations.Equation;
import lab3.equations.FirstEquation;
import lab3.equations.SecondEquation;
import lab3.equations.ThirdEquation;
import my_classes.out.FileOutLab;
import my_classes.out.Out;

public class Main {
    public static Out out = new FileOutLab("/Users/infidelis/IdeaProjects/NSUProg/src/lab3/out.txt");

    public static void main(String[] args) {
        Equation first = new FirstEquation();
        Equation second = new SecondEquation();
        Equation third = new ThirdEquation();


        first.printAll();
        second.printAll();
        third.printAll();

    }


}
