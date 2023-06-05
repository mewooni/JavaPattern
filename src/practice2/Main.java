package practice2;
//Stream API реализуем класс и риложение с промежуточными функциями

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        HumanApp humanApp = new HumanApp();
        Stream<Human> humans =  humanApp.getHumans();
        humanApp.print(humans);
        System.out.println();

        HumanApp humanApp1 = new HumanApp();
        Stream<Human> humans1 =  humanApp1.getHumans();
        humanApp1.sortByAge(humans1);
        System.out.println();

        HumanApp humanApp2 = new HumanApp();
        Stream<Human> humans2 =  humanApp2.getHumans();
        humanApp2.filterByAge(humans2);
        System.out.println();

        HumanApp humanApp4 = new HumanApp();
        Stream<Human> humans4 =  humanApp4.getHumans();
        humanApp4.filterByName(humans4);
        System.out.println();

        System.out.println();
        HumanApp humanApp3 = new HumanApp();
        Stream<Human> humans3 =  humanApp3.getHumans();
        humanApp3.concatFirstLetters(humans3);
    }
}