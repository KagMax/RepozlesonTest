package Stack;

import java.util.EmptyStackException;

public interface Stak {
    void push(String item) throws FullStackException;
    String pop() throws EmptyStackException;
    String peek() throws EmptyStackException;
    boolean isEmpty();
}
