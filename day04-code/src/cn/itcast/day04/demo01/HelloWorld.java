package cn.itcast.day04.demo01;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) throws ParseException {

        /*Date date=new Date();
        DateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String sdf = simpleDateFormat.format(date);
        System.out.println(sdf);

        Date date1 = simpleDateFormat.parse("2020-02-11 04:37:36");
        System.out.println(date1);*/


       /* long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);*/

     /*  String [] str1={"aaa","bbb","ccc"};
       String [] str2={"ddd","eee","fff"};
       System.arraycopy(str1,0,str2,0,2);
        System.out.print
        ln(Arrays.toString(str2));
*/
       /* StringBuilder stringBuilder = new StringBuilder("abc");
        StringBuilder sb2 = stringBuilder.append("abc");
        String string = sb2.toString();
        System.out.println(string);
    */


    DemoInterface<String > dif=new DemoInterfaceImpl();
    dif.method("dsd");














    }
}
