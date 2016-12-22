package stringbuffer.demo1;

/**
 * Created by Denis on 30.10.2016.
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Буфер = " + sb);
        System.out.println("Длина =" + sb.length());
        System.out.println("Ёмкость" + sb.capacity());
    }
}
