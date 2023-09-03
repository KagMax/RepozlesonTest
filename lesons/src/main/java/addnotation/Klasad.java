package addnotation;

public class Klasad {
    private int number;
    private String text;
    private double value;
    private AnotherClass another;

    public Klasad() {

    }

    public Klasad(int number, String text, double value, AnotherClass another) {
        this.number = number;
        this.text = text;
        this.value = value;
        this.another = another;


    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public AnotherClass getAnother() {
        return another;
    }

    public void setAnother(AnotherClass another) {
        this.another = another;
    }

    public int calculateSum() {
         return calculateSum(4, 5);
     }



     @SuperMethods(true)
     public int calculateSum(int a , int b ){
        return a+b;
     }

}
