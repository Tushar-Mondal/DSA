package Questions;
public class Sun_Breathing {
    public static void main(String[] args) {
        Sun obj=new Sun();
        Moon obj1=new Moon();
        Stone obj2=new Stone();
        System.out.println(obj instanceof Sun);
        System.out.println(obj1 instanceof Moon);
        System.out.println(obj2 instanceof Sun);
    }
}
class Sun{

}
class Moon extends Sun{

}
class Stone extends Sun{

}
