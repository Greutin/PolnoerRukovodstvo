package netprojects;

import java.net.*;
import java.io.*;
/**
 * Created by Denis on 24.11.2016.
 */
public class Whois {
    public static void main(String[] args) throws IOException {
        int c;

        Socket s = new Socket("whois.internic.net", 43);

        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        String str = (args.length == 0 ? "MHProfessional.com" : args[0]);

        byte buf[] = str.getBytes();

        out.write(buf);

        while ((c = in.read()) != -1)
        {
            System.out.println((char) c);
        }
        s.close();
    }
}
