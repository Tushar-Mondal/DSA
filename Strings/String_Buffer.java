package Strings;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class String_Buffer {
    public static void main(String[] args) {
        //Constructor 1.
        StringBuffer buffer = new StringBuffer();
        buffer.append("WeMakeDevs");
        buffer.append(" is nice");
        buffer.insert(0, "Kunal's ");
        buffer.replace(21, 28, " Amazing");
        //Constructor 2.
        StringBuffer buffer2 = new StringBuffer("Tushar Mondal");

        //Constructor 3.
        StringBuffer buffer3 = new StringBuffer(30);
        System.out.println(buffer.toString());
        System.out.println(buffer2.toString());

        Random rabdom = new Random();
        System.out.println(rabdom.nextFloat());
        //Remove white spaces
        String sentence = "huiulvkhviu fdsfuglif fsfs fdsupf ilfs  fdysh  yiuh;  j hih;sd  ihvv vfihvf vkjh;zov ";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll(" ", ""));

        //split

        String arr = "Tushar Bell Tanjiro";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        //Rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.2));
    }
}
