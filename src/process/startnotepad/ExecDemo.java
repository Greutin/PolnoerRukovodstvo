package process.startnotepad;

/**
 * Created by Denis on 30.10.2016.
 */
public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try{
            p = r.exec("cmd");
        }catch (Exception ex){
            System.out.println("Ошибка запуска программы.");
        }
    }
}
