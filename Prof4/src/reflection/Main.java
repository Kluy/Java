package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        Class<?> cl = Person.class;

        System.out.println(cl.getSimpleName());
        System.out.println(cl.getName());
        System.out.println(cl);

        Constructor[] constructors = cl.getConstructors();
        Method[] methods = cl.getDeclaredMethods();
        Field[] fields = cl.getDeclaredFields();
        int modifiers = cl.getModifiers();

        System.out.println("\nПоля");

        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.print("Имя: " + field.getType());
            System.out.print(", тип: " + fieldType.getName());
            System.out.print(", пользоватльское имя: " + field.getName());
            System.out.println(", модификаторы: " + field.getModifiers());
        }

        System.out.println("\nКонструкторы");

        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("\nМетоды");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // Изменение значения приватного поля
        try {
            Person person = new Person();
            // По имени name получаем класс Field
            Field field = cl.getDeclaredField("name");
            // true - снимаем модификатор до public, false - запрещаем
            field.setAccessible(true);
            // У класса Field, есть различные методы get
            System.out.println("\nPrivate field value: " + field.get(person));
            field.set(person, "Вася");
            System.out.println("New private field value: " + field.get(person));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("\nМодификатор класса public");
        System.out.println(Modifier.isPublic(modifiers));
    }
}
