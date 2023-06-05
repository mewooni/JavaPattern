package practice5;

public class Singleton5 {
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

    private Singleton5() {
    }

    private static class SingletonHolder {
        public static final Singleton5 HOLDER_INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
