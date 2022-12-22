package Homework20;


public class task1<T extends String, V extends Animal, K extends Number> {
    private T type;
    private V value;
    private K key;

    public task1(T type, V value, K key) {
        this.type = type;
        this.value = value;
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public T getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "task_1{" +
                "type=" + type +
                ", value=" + value +
                ", key=" + key +
                '}';
    }

    public static void main(String[] args) {
        task1<String,Animal,Integer> task = new task1<>("Cat",new Cat(),15);
        System.out.println(task);
    }
}