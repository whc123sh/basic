package cn.itcast.day04.demo01;

public class DemoInterfaceImpl<Y> implements DemoInterface <Y>{
    @Override
    public void method(Y y) {
        System.out.println(y);
    }
}
