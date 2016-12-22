package netprojects;

import java.net.*;
import java.io.*;
import java.util.*;

/**
 * Created by Denis on 24.11.2016.
 */
public class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");

        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        System.out.println("Метод запроса: " + hpCon.getRequestMethod());
        System.out.println("Код ответа: " + hpCon.getResponseCode());
        System.out.println("Ответное сообщение: " + hpCon.getResponseMessage());

        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nДалее следует заголовок: ");

        for(String element: hdrField)
        {
            System.out.println("Ключ: " + element + " Значение: " + hdrMap.get(element));
        }
    }
}
