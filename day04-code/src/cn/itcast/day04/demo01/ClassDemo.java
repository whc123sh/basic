package cn.itcast.day04.demo01;

import java.lang.reflect.Field;

public class ClassDemo {

    public static void main(String[] args) throws Exception {
       //第一种方式
        Class<?> aClass = Class.forName("cn.itcast.day04.demo01.Student");
        System.out.println(aClass);

        //第二种方式
        Class<Student> sClass = Student.class;
        System.out.println(sClass);

        //第三种方式
        Class<? extends Student> aClass1 = new Student().getClass();
        System.out.println(aClass1);


        System.out.println();


        //获取成员变量
        Field id = sClass.getDeclaredField("id");
         id.setAccessible(true);//暴力反射
        Object s = id.get(new Student());
        System.out.println(s);
    }
}
