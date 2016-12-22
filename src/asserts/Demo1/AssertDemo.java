package asserts.Demo1;

/**
 * Created by Denis on 30.10.2016.
 */
public class AssertDemo {

    static int val = 3;
    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++){
            n = getnum();
            assert n > 0: "Error";
            System.out.println(n);
        }
    }
}
