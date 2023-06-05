package practice1;

@FunctionalInterface

public interface Consumer<T> {
    String replaceEachThird(T t);
}