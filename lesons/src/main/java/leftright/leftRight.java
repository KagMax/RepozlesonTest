package leftright;

public interface leftRight<L extends Comparable<L>, R extends Comparable<R>> {
    L getLeft();
    R getRight();
    L getMin();
    R getMax();
}