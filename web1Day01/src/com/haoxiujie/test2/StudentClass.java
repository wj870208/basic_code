package com.haoxiujie.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentClass {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<Student> studentClass = Student.class;
        Field[] declaredFields = studentClass.getDeclaredFields();//遍历成员变量
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field id = studentClass.getDeclaredField("id");
        Student s = new Student();
        System.out.println(id.get(s));
        id.set(s, 150906034);
        System.out.println(id.get(s));
        System.out.println("--------------");
        Constructor<?>[] declaredConstructors = studentClass.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; i++) {
            Constructor<?> declaredConstructor = declaredConstructors[i];
            System.out.println(declaredConstructor);
        }
        Constructor<Student> constructor = studentClass.getDeclaredConstructor(String.class, int.class, int.class);
        Student s2 = constructor.newInstance("小明", 18, 10001);
        System.out.println(s2);
        System.out.println("----------");
        Method[] methods = studentClass.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            System.out.println(method);
        }
        Method method = studentClass.getDeclaredMethod("eat", String.class);
        method.invoke(s2, "开封菜");
    }
}
