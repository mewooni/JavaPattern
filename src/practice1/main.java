package practice1;

import practice1.Consumer;
//имплементировать интерфейс

public class main {
    public static void main(String[] args)
    {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public String replaceEachThird(String s) {
                String new_string = "";
                for(int i = 0; i < s.length(); ++i) {
                    if (i%3==2) {
                        new_string += s.substring(i,i+1).toUpperCase();
                    }
                    else new_string += s.charAt(i);
                }
                return new_string;
            }
        };

        System.out.println(consumer.replaceEachThird("cristianoronaldo"));

    }

}