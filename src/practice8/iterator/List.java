package practice8.iterator;

public interface List {

    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object obj);
}