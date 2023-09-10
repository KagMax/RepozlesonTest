package addnotation;

public class Main {
    public static void main(String[] args) {
        Klasad myObject = new Klasad(42, "Hello", 3.14, new AnotherClass());

        int sum = myObject.calculateSum(10, 20);
        System.out.println("Sum: " + sum);

        double product = myObject.calculateProduct(3.0);
        System.out.println("Product: " + product);

        String concatenated = myObject.concatenateStrings("Java", " is fun!");
        System.out.println("Concatenated: " + concatenated);

    }
}
