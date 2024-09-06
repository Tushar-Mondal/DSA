package Strings;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        System.out.println(generate(10));
    }
    public static String generate(int size){
        StringBuffer buffer = new StringBuffer(size);

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            buffer.append((char)randomChar);
        }
        return buffer.toString();
    }
}
