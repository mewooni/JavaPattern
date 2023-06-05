package practice3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class SetSemaphore<E> implements Set<E> {

    private Semaphore semaphore = new Semaphore(1, true);

    private volatile Set<Object> set = new HashSet<Object>();

    @Override
    public int size() {
        try{
            semaphore.acquire();
            return set.size();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean isEmpty() {
        try{
            semaphore.acquire();
            return set.isEmpty();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean contains(Object o) {
        try{
            semaphore.acquire();
            return set.contains(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Iterator<E> iterator() {
        try{
            semaphore.acquire();
            return (Iterator<E>) set.iterator();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Object[] toArray() {
        try{
            semaphore.acquire();
            return set.toArray();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        try{
            semaphore.acquire();
            return set.toArray(a);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean add(Object t) {
        try{
            semaphore.acquire();
            return set.add(t);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean remove(Object o) {
        try{
            semaphore.acquire();
            return set.remove(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        try{
            semaphore.acquire();
            return set.containsAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        try{
            semaphore.acquire();
            return set.addAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }    }

    @Override
    public boolean retainAll(Collection<?> c) {
        try{
            semaphore.acquire();
            return set.retainAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        try{
            semaphore.acquire();
            return set.removeAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public void clear() {
        try{
            semaphore.acquire();
            set.clear();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }

    }

    @Override
    public Spliterator<E> spliterator() {
        return Set.super.spliterator();
    }

    @Override
    public String toString() {
        try{
            semaphore.acquire();
            return set.toString();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }
}
