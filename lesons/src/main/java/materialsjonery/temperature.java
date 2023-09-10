package materialsjonery;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("jaka mas temperature?");
        int t = scanner.nextInt();

        float temperature = t;
        if (temperature > 36.6f) {
            System.out.println("mash garacke");

        } else {
            System.out.println("wzsystko okej");
        }
    }
}
