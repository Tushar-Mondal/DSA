package Ooops.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,9,1};
    }
//    public Object clone() throws CloneNotSupportedException{
//        //This is shallow copy.
//        return super.clone();
//    }
    public Object clone() throws CloneNotSupportedException{
        //This is deep copy.
        Human Tushar =  (Human) super.clone(); // This is actually shallow copy.
        Tushar.arr = new int[Tushar.arr.length];
        for (int i = 0; i < Tushar.arr.length; i++) {
            Tushar.arr[i] = this.arr[i];
        }
        return Tushar;
    }
}
