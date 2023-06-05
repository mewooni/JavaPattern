package practice8.iterator;

public class Test {
    public static void main(String[] args) {
        List list = new ListImpl();
        System.out.println("First iteration (next):");
        list.add("Crystal Maiden");
        list.add("Lina");
        list.add("Marci");
        list.add("Death Prophet");
        // Первая итерация
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Second iteration (get):");
        // Вторая итерация
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
