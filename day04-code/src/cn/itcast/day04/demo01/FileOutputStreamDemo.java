package cn.itcast.day04.demo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception {
            FileOutputStream fops=new FileOutputStream("d:\\123.txt");

//            fops.write("你好".getBytes());
              //  fops.write();



            fops.close();


    }

}
