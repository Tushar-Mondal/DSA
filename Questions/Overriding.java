package Questions;
public class Overriding {
    public static void main(String[] args) {
        BY obj=new BY();
        int a=10,b=5;
        obj.sum(a,b);
    }
}
class AY{
    int x;
    void sum(int y,int z){
        x=y+z;
        System.out.println("The sum of 2 no is:"+x);
    }
}
class BY extends AY{
    void sum(int y,int z){
        x=y+(y*z);
        System.out.println("The sum of 2 no is:"+x);
    }
}