package cn.itcast.day04.demo01;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class DemoBaozi {
    static Boolean flag = false;


    public static void main(String[] args) {
        Object o = new Object();


        new Thread() {//吃货
            @Override
            public void run() {
                synchronized (o) {
                    try {
                        while (true) {
                            if (flag == false) {//如果没包子

                                System.out.println("吃货说：没包子了，快做包子!");
                                o.notify();
                                o.wait();

                            } else {//如果有包子
                                System.out.println("吃货说：真好吃!");
                                Thread.sleep(1000);
                                flag = false;
                                System.out.println("吃货说：没包子了，快做包子!");
                                o.notify();//唤醒店家
                                o.wait();
                            }
                        }

                    } catch (Exception e) {
                    }
                    ;

                }
            }
        }.start();


        new Thread(new Runnable() {//包子铺
            @Override
            public void run() {
                synchronized (o) {

                   while (true){

                       try {
                           System.out.println("正在制作");
                           Thread.sleep(5000);//花五秒做包子\
                           flag = true;  //有包子了
                           System.out.println("包子铺说:包子做好了");
                           Thread.sleep(1000);
                           o.notify();//告知吃货
                            o.wait();//包子铺休息
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }

                }
            }
        }).start();

    }
}
