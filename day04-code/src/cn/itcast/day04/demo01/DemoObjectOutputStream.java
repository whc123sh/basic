package cn.itcast.day04.demo01;

import javax.naming.Name;
import java.io.*;

public class DemoObjectOutputStream {
    public static void main(String[] args) throws Exception {
//        ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("d:\\person.txt"));
//
//        oo.writeObject(new Person(11,"王和聪"));
//         oo.close();

        ObjectInputStream o1=new ObjectInputStream(new FileInputStream("d:\\person.txt"));
        Person person = (Person) o1.readObject();
        System.out.println(person);
    }


}

class Person implements Serializable {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
