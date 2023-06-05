package practice3;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ListLock<E> implements List<E>{
    private static final Lock lock = new ReentrantLock();
    private volatile List<E> list = new ArrayList<>();

    @Override
    public int size() {
        int size = 0;
        try {
            lock.lock();
            size = list.size();
        } finally {
            lock.unlock();
        }
        return  size;

    }

    @Override
    public boolean isEmpty() {
        boolean emptiness = true;

        try {
            lock.lock();
            emptiness = list.isEmpty();
        } finally {
            lock.unlock();
        }
        return emptiness;
    }

    @Override
    public boolean contains(Object o) {
        boolean temp = false;
        try {
            lock.lock();
            temp = list.contains(o);
        }finally {
            lock.unlock();
        }
        return  temp;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = null;
        try {
            lock.lock();
            iterator = list.iterator();
        }finally {
            lock.unlock();
        }
        return  iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[]{};
        try {
            lock.lock();
            objects = list.toArray();
        }finally {
            lock.unlock();
        }
        return objects;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Object[] objects = new Object[]{};
        try {
            lock.lock();
            objects = list.toArray();
        }finally {
            lock.unlock();
        }
        return  (T[]) objects;
    }

    @Override
    public boolean add(E e) {
        boolean add_status = false;
        try {
            lock.lock();
            add_status = list.add(e);
        }finally {
            lock.unlock();
        }
        return  add_status;
    }

    @Override
    public boolean remove(Object o) {
        boolean remove_status = false;
        try {
            lock.lock();
            remove_status = list.remove(o);
        }finally {
            lock.unlock();
        }
        return  remove_status;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean contains_status = false;
        try {
            lock.lock();
            contains_status = list.containsAll(c);
        }finally {
            lock.unlock();
        }
        return contains_status;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean add_All = false;
        try {
            lock.lock();
            add_All = list.addAll(c);
        }finally {
            lock.unlock();
        }
        return  add_All;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        boolean add_status = false;
        try {
            lock.lock();
            add_status = list.addAll(index,c);
        }finally {
            lock.unlock();
        }
        return  add_status;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean removeAllStatus = false;
        try {
            lock.lock();
            removeAllStatus = list.removeAll(c);
        }finally {
            lock.unlock();
        }
        return  removeAllStatus;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean status = false;
        try {
            lock.lock();
            status = list.retainAll(c);
        }finally {
            lock.unlock();
        }
        return  status;
    }

    @Override
    public void clear() {
        try {
            lock.lock();
            list.clear();
        }finally {
            lock.unlock();
        }
    }

    @Override
    public E get(int index) {
        Object object = null;
        try {
            lock.lock();
            object = list.get(index);
        }finally {
            lock.unlock();
        }
        return (E) object;
    }

    @Override
    public E set(int index, E element) {
        Object object = null;
        try {
            lock.lock();
            object = list.set(index,element);
        }finally {
            lock.unlock();
        }
        return (E) object;
    }

    @Override
    public void add(int index, E element) {
        boolean status = false;
        try {
            lock.lock();
            list.add(index,element);
        }finally {
            lock.unlock();
        }
    }

    @Override
    public E remove(int index) {
        Object object = null;
        boolean status = false;
        try {
            lock.lock();
            object = list.remove(index);
        }finally {
            lock.unlock();
        }
        return (E) object;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        boolean status = false;
        try {
            lock.lock();
            index = list.lastIndexOf(o);
        }finally {
            lock.unlock();
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        try {
            lock.lock();
            index = list.lastIndexOf(o);
        }finally {
            lock.unlock();
        }
        return  index;
    }

    @Override
    public ListIterator<E> listIterator() {
        ListIterator<E> listIt = null;
        boolean status = false;
        try {
            lock.lock();
            listIt = list.listIterator();
        }finally {
            lock.unlock();
        }
        return listIt;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        ListIterator<E> listIt = null;
        boolean status = false;
        try {
            lock.lock();
            listIt = list.listIterator(index);
        }finally {
            lock.unlock();
        }
        return listIt;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        boolean status = false;
        List<E> subList = null;
        try {
            lock.lock();
            subList = list.subList(fromIndex,toIndex);
        }finally {
            lock.unlock();
        }
        return subList;
    }
}
