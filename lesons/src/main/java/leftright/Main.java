package leftright;

public class Main {
    public static void main(String[] args) {
        Typle<Integer, String> tuple1 = new Typle<>(42, "Hello");
        Typle<String, Double> tuple2 = new Typle<>("World", 3.14);

        System.out.println("Tuple 1: Left=" + tuple1.getLeft() + ", Right=" + tuple1.getRight());
        System.out.println("Tuple 2: Left=" + tuple2.getLeft() + ", Right=" + tuple2.getRight());

            Tuplecomparable<Integer, Integer> tuple3 = new Tuplecomparable<>(42, 23);
            Tuplecomparable<String, String> tuple4 = new Tuplecomparable<>("Hello", "World");

            System.out.println("Tuple 1: Left=" + tuple3.getLeft() + ", Right=" + tuple3.getRight());
            System.out.println("Tuple 1: Min=" + tuple3.getMin() + ", Max=" + tuple3.getMax());

            System.out.println("Tuple 2: Left=" + tuple4.getLeft() + ", Right=" + tuple4.getRight());
            System.out.println("Tuple 2: Min=" + tuple4.getMin() + ", Max=" + tuple4.getMax());
        }
    }




