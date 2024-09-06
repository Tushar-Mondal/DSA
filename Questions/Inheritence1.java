package Questions;
public class Inheritence1 {
    public static void main(String[] args) {
        Bc obj=new Bc();
        Ca obj1=new Ca();
        int a=10,b=5;
        obj.mul(a,b);
        obj1.div(a,b);
    }
}
class Ab{
    int sum(int y,int z){
        return (y+z);
    }
}
class Bc extends Ab{
    void mul(int y,int z){
        int x;
        x=sum(y,z)*y*z;
        System.out.println("The mul is:"+x);
    }
}
class Ca extends Ab{
    void div(int y,int z){
        int w;
        w=sum(y,z)/(y/z);
        System.out.println("The div is:"+w);
    }
}