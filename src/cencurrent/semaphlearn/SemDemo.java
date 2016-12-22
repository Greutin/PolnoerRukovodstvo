package cencurrent.semaphlearn;

import java.util.concurrent.Semaphore;

/**
 * Created by denba on 08.12.2016.
 */
public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}

class Shared
{
    static int count = 0;
}

class IncThread implements Runnable
{
    String name;
    Semaphore sem;

    public IncThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    public void run(){
        System.out.println("Запуск потока " + name);
        try
        {
            System.out.println("Поток " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешение");

            for(int i = 0; i < 5; i++)
            {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(10);
            }
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}

class DecThread implements Runnable
{
    String name;
    Semaphore sem;

    public DecThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    public void run(){
        System.out.println("Запуск потока " + name);
        try
        {
            System.out.println("Поток " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешение");

            for(int i = 0; i < 5; i++)
            {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(10);
            }
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}
