package Generic;

import Stack.FullStackException;

import java.util.EmptyStackException;

public interface Stak <T> {
    void push(T item) throws FullStackException;
    T pop() throws EmptyStackException;
    T peek() throws EmptyStackException;
    boolean isEmpty();
}
