package Strings;
public class StringInJava {
    public static void main(String[] args) {
//        String name = "Tushar";
//        System.out.println(name);
        String a = "Tushar";
        String b = "Tushar";
//        System.out.println(a==b);
        String c = new String("Tushar");//Tell Java to create strings explicitly.
//        System.out.println(b == c);
        System.out.println(b.equals(c));//it checks whether the two objects values are same or not by doing comparison.
    }
}
