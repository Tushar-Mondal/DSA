package Questions;
public class Inheritence {
    public static void main(String[] args) {
        CA obj=new CA();
        int a=10,b=5;
        obj.sum(a,b);
        obj.sub(a,b);
        obj.mul(a,b);
        obj.div(a,b);
    }
}
class AB{
    int x;
    void sum(int y,int z){
        x=y+z;
        System.out.println("The sum of 2 no is:"+x);
    }
} 
class BC extends AB{
    void sub(int y,int z){
        x=y-z;
        System.out.println("The sub of 2 no is:"+x);
    }
}
class CA extends BC{
    void mul(int y,int z){
        x=y*z;
        System.out.println("The mul of 2 no is:"+x);
    }
    void div(int y,int z){
        x=y/z;
        System.out.println("The div of 2 no is:"+x);
    }
}