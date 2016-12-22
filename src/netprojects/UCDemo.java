package netprojects;

import java.io.*;
import java.net.*;
import java.util.Date;
/**
 * Created by Denis on 24.11.2016.
 */
public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;

        URL hp = new URL("http://www.vk.com");
        URLConnection hpCon = hp.openConnection();
        long d = hpCon.getDate();
        if(d == 0)
        {
            System.out.println("Сведения о дате отсутствуют");
        }
        else
        {
            System.out.println("Дата: " + new Date(d));
        }

        System.out.println("Тип содержисого: " + hpCon.getContentType());

        d = hpCon.getExpiration();
        if(d == 0)
        {
            System.out.println("Сведения о сроку действия отсутствуют.");
        }
        else
        {
            System.out.println("Срок действия истекает: " + new Date(d));
        }

        d = hpCon.getLastModified();
        if(d == 0)
        {
            System.out.println("Сведения о дате последней модификации отсутствуют.");
        }
        else
        {
            System.out.println("Дата последней модификации: " + new Date(d));
        }

        long len = hpCon.getContentLength();
        if(len == -1)
        {
            System.out.println("Длина содержимого недоступна.");
        }
        else
        {
            System.out.println("Длина содержимого: " + len);
        }

        if(len != 0)
        {
            System.out.println("=== Содержимое ===");
            InputStream input = hpCon.getInputStream();
            while((c = input.read()) != -1)
            {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("Содержимое недоступно.");
        }
    }
}
