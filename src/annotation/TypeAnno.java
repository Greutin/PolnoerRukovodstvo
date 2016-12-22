package annotation;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 * Created by Denis on 30.10.2016.
 */
//Аннотации-маркер, которые можно применить к типу данных
@Target(ElementType.TYPE_USE)
public @interface TypeAnno {
}

@Target(ElementType.TYPE_USE)
@interface NotZeroLen{}

@Target(ElementType.TYPE_USE)
@interface Unique{}

//Параметризированная аннотация, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface MaxLen{
    int value();
}

//аннотация которую можно применить к параметру типа
@Target(ElementType.TYPE_PARAMETER)
@interface What{
    String description();
}

//Аннотация, которую можно применить в объявлении поля
@Target(ElementType.FIELD)
@interface EmptyOK{}

//Аннотация, которую можно применить в объявлении метода
@Target(ElementType.METHOD)
@interface Recommended{}

class TypeAnnoDemo<@What(description = "Данные обобщенного типа") T>{
    //Применение типовой аннотации к конструктору
    public @Unique TypeAnnoDemo(){}

    //Аннотировать тип, но не поле
    @TypeAnno String str;

    //Аннотировать тест поля
    @EmptyOK String test;

    //Примененить типовую аннотацию для аннотирования ссылки this на объект
    public int f(@TypeAnno TypeAnnoDemo<T> this, int x)
    {
        return 10;
    }

    //Анотировать возвращаемый тип
    public @TypeAnno Integer f2(int j, int k)
    {
        return j + k;
    }

    //Аннотировать объявление метода
    public @Recommended Integer f3(String str) {
        return str.length() / 2;
    }

    //Применить типовую аннотацию в операторе throws
    public void f4() throws @TypeAnno NullPointerException
    {
        //...
    }

    //Аннотировать уровни доступа к массиву
    String @MaxLen(10) [] @NotZeroLen [] w;

    //Аннотирвоать тип элемента массива
    @TypeAnno Integer[] vec;

    public static void myMath(int i)
    {
        //Применить типовую аннотацию в аргументе типа
        TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();
        //Применить типовую аннотацию в операторе new
        @Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();

        Object x = 10;
        Integer y;

        //Применить типовую аннотацию в приведении типов
        y = (@TypeAnno Integer) x;

    }

    public static void main(String[] args) {
        myMath(10);
    }

    //Применить типовую аннотацию в выражении наследования
    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean>{}
}