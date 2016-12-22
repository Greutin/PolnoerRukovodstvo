package annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by Denis on 29.10.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}
//Контейнер аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos{
    MyAnno[] value();
}

class Meta{
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        try{
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException ex){
            System.out.println("Метод не найден!");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}

class RepeatAnno {
    @MyAnno(str = "Первая Аннотация", val = -1)
    @MyAnno(str = "Вторая аннотация", val = 100)
    public static void myMeth(String str, int i){
        RepeatAnno ob = new RepeatAnno();

        try{
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        }catch (NoSuchMethodException ex)
        {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("тест", 10);
    }
}