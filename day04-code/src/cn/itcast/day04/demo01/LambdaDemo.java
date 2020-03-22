package cn.itcast.day04.demo01;


public class LambdaDemo {
    //runable正常写法

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行run方法");
            }
        }).start();


        //lambda写法
        new Thread(()-> System.out.println("执行run方法")).start();

    }






}
