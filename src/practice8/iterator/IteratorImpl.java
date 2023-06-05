package practice8.iterator;

import java.util.List;

public class IteratorImpl implements Iterator {

    private ListImpl list;

    private int index;

    public IteratorImpl(ListImpl list) {
        index = 0;
        this.list = list;
    }

    public void first() {
        index = 0;
    }

    public void last() {
        index = list.getSize();
    }

    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }

    public boolean hasNext() {
        return index < list.getSize();
    }
}