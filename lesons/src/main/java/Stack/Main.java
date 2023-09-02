package Stack;

import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        try {
            stack.push("Item 1");
            stack.push("Item 2");
            stack.push("Item 3");

            System.out.println("Peek: " + stack.peek()); // Ostatni element bez usuwania
            System.out.println("Pop: " + stack.pop()); // Usunięcie ostatniego elementu

            System.out.println("Is empty? " + stack.isEmpty()); // Czy stos jest pusty?
        } catch (FullStackException | EmptyStackException e) {
            e.printStackTrace();
        }
    }
}

