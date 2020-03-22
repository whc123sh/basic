package cn.itcast.day04.demo01;

public class DemoRunnable {
    public static void main(String[] args) {
        Runnable r=new RunnableImpl();
        Thread t=new Thread(r);
        t.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }

    }

}
