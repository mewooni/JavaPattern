package practice2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class HumanApp {
    private Stream<Human> temp;

    public  Stream<Human> getHumans(){
        List<Human> input = new ArrayList<>();
        input.add(new Human(18,"Cristiano","Ronaldo", LocalDate.of(2005,02,05),70));
        input.add(new Human(36,"Lionel","Messi", LocalDate.of(1988,04,10),55));
        input.add(new Human(31,"Neymar","Jr", LocalDate.of(1992,11,06),80));
        input.add(new Human(50,"Van","Darkholm", LocalDate.of(1973,05,03),60));
        input.add(new Human(30,"Ronney","Coleman", LocalDate.of(1992,12,01),100));
        Stream<Human> stream = input.stream();
        return stream;
    }

    public void sortByAge(Stream<Human> temp) {
        temp.sorted((human1, human2) ->
                (Integer.compare((Integer) human1.getAge(), (Integer) human2.getAge()))).forEach(System.out::println);
    }

    public void filterByAge(Stream<Human> temp) {
        temp.filter(human -> human.getAge() < 20).forEach(System.out::println);
    }

    public void filterByName(Stream<Human> temp) {
        temp.filter(human -> human.getFirstName().contains("e")).forEach(System.out::println);
    }

    public void print(Stream<Human> temp) {
        temp.forEach(System.out::println);
    }

    public void concatFirstLetters(Stream<Human> temp) {
        temp.map(human -> human.getFirstName().charAt(0)).collect(Collectors.toList()).forEach(System.out::print);
    }


}