package practice5;

public enum Singleton2 {

    //через enum (второй пример из методички)
    INSTANCE;
    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
