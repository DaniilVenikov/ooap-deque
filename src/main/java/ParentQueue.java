public abstract class ParentQueue<T> {

    // конструктор
    public abstract ParentQueue<T> ParentQueue();

    // команды

    // постусловие: произведена вставка в хвост очереди
    public abstract void addTail(T item);

    // предусловие: очередь не пуста;
    // постусловие: из головы очереди удалён элемент
    public abstract void removeFront();


    // запросы

    // предусловие: очередь не пустая
    public abstract T get(); // значение элемента из головы очереди

    public abstract int size();
    public abstract int getGetStatus();
    public abstract int getRemoveFrontStatus(); // успешно; очередь пуста
}

abstract class QueueATD<T> extends ParentQueue<T> {

    // конструктор
    public abstract QueueATD<T> QueueATD();
}

abstract class DequeATD<T> extends ParentQueue<T> {

    // конструктор
    public abstract DequeATD<T> DequeATD();


    // команды

    // постусловие: произведена вставка в голову очереди
    public abstract void addFront(T item);

    // предусловие: очередь не пуста;
    // постусловие: из хвоста очереди удалён элемент
    public abstract void removeTail();


    // запросы

    public abstract int getRemoveTailStatus(); // успешно; очередь пуста
}
