package work.projects.lab3.main;

import my_classes.out.FileOutLab;
import my_classes.out.Out;
import work.projects.lab3.equations.Equation;
import work.projects.lab3.equations.FirstEquation;
import work.projects.lab3.equations.SecondEquation;
import work.projects.lab3.equations.ThirdEquation;

public class Main {
    public static Out out = new FileOutLab("/Users/infidelis/IdeaProjects/NSUProg/src/work.projects.lab3/out.txt");

    public static void main(String[] args) {
        Equation first = new FirstEquation();
        Equation second = new SecondEquation();
        Equation third = new ThirdEquation();

        first.printAll();
        second.printAll();
        third.printAll();

        }


}
