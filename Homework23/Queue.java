package Homework23.task2;


import java.util.function.Function;
import java.util.function.Predicate;

public interface Queue {

    public Object get(int i);
    public void enqueue(Object elem);
    public void push(Object elem);
    public Object element();
    public Object peek();
    public Object dequeue();
    public Object remove();
    public int size();
    public boolean isEmpty();
    public void clear();

}