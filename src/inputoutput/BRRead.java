package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Denis on 30.10.2016.
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do{
            c = (char) reader.read();
            System.out.println(c);
        }while (c != 'q');
    }
}
