package Generic;

import Stack.FullStackException;

import java.util.EmptyStackException;

public class GenericStosWithInterface<T> implements Stak<String> {


    @Override
    public void push(String item) throws FullStackException {

    }

    @Override
    public String pop() throws EmptyStackException {
        return null;
    }

    @Override
    public String peek() throws EmptyStackException {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
