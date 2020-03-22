package cn.itcast.day04.demo01;

import java.io.File;


public class FileDemo {



    public static void main(String[] args) {
        File file1=new File("D:\\dev\\ideaCode\\basic-code");
      //  System.out.println(file1);
     //   System.out.println(file1.getAbsolutePath());
        //System.out.println(file1.getPath());
//        System.out.println(file1.getName());
//        System.out.println(file1.length());

        File[] lists = file1.listFiles();
        for (int i = 0; i < lists.length; i++) {
            System.out.println(lists[i]);
        }

    }




}
