package Questions;
class Encapsulate1{
    private String name;
    public String getName() { return name; }
    public void setName(String newName)
    {
        name = newName;
    }
}
public class TestEncapsulation1 {
    public static void main(String[] args) {
        Encapsulate1 obj=new Encapsulate1();
        obj.setName("Sign Ayush");
        System.out.println("The legends name is: "+obj.getName());
    }
}