package staticimport;


import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * Created by Denis on 30.10.2016.
 */
public class Demo1 {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;

        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println(hypot);
    }

}
