package practice5;

public class Singleton3 {
    //cамая простая реализация
    /**
     * Плюсы:
     * Ленивая инициализация.
     *
     * Потокобезопасность
     *
     * Высокая производительность в многопоточной среде
     *
     * Минусы:
     * Не поддерживается на версиях Java ниже 1.5 (в версии 1.5 исправили работу ключевого слова volatile)
     *
     * Важно, что для корректной работы данного варианта реализации обязательно одно из двух условий.
     * Переменная INSTANCE должна быть либо final, либо volatile.
     * */
    private static Singleton3 INSTANCE;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton3.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton3();
                }
            }
        }
        return INSTANCE;
    }
}
