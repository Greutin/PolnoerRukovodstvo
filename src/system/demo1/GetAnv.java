package system.demo1;

import java.util.Map;

/**
 * Created by Denis on 30.10.2016.
 */
public class GetAnv {
    public static void main(String[] args) {
        Map<String, String> map = System.getenv();
        for (Map.Entry<String, String> element: map.entrySet())
        {
            System.out.println(element.getKey() + ": " + element.getValue());
        }
        System.out.println(System.getProperty("user.dir"));
    }
}
