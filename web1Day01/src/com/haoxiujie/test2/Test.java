package com.haoxiujie.test2;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        //1.创建pro对象并加载
        Properties properties = new Properties();
        ClassLoader classLoader = Test.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        properties.load(is);
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getDeclaredMethod(methodName);
        method.invoke(o);

    }
}
