package practice3;
//создать set потокобезопасные имплементации Semaphore List Lock

import java.util.*;

public class Pr3Test {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ListLock<>();

        List<String> firstList = new ArrayList<>(Arrays.asList("SUII", "SIUU", "ronaldo", "ishowspeed", "ronaldo"));

        List<String> secondList = new ArrayList<>(Arrays.asList("fuji", "fumiko", "owleeng", "fuji", "greyro"));

        int n = 5;
        int m = 5;

        Thread one = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                list.add(firstList.get(i));
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < m; i++) {
                list.add(secondList.get(i));
            }
        });

        one.start();
        two.start();

        Thread.sleep(1000); // главный поток "спит" секунду - ждем завершения двух других потоков

        list.forEach((key) -> System.out.println(key));

        System.out.println("-----------------------------------------------------------------------------------------");

        Set<String> mySet = new SetSemaphore<>();

        int k = 5;
        int l = 5;

        one = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                mySet.add(firstList.get(i));
            }
        });

        two = new Thread(() -> {
            for (int i = 0; i < m; i++) {
                mySet.add(secondList.get(i));
            }
        });

        one.start();
        two.start();

        Thread.sleep(1000); // главный поток "спит" секунду - ждем завершения четырех других потоков

        mySet.forEach(System.out::println);
    }
}
