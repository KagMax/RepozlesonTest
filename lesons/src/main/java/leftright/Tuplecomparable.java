package leftright;

 public class Tuplecomparable<L extends Comparable<L>, R extends Comparable<R>> {
    private L left;
    private L max;
    private R min;
    private R right;



     public Tuplecomparable(L left, R right) {
         this.left = left;
         this.right = right;
     }

     public L getLeft() {
         return left;
     }

     public R getRight() {
         return right;
     }

     public L getMax() {
         return max;
     }

     public R getMin() {
         return min;
     }
 }
