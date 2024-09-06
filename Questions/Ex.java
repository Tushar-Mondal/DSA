package Questions;
public class Ex {
    public static void main(String[] args) {
        E obj=new E();
        obj.setName("Tanjiro");
        obj.setIdnum("000");
        obj.setAge(20);
        System.out.println("The name is:"+obj.getName());
        System.out.println("The Id num is:"+obj.getIdnum());
        System.out.println("The age is:"+obj.getAge());
    }
}
class E{
    private String name;
    private String idnum;
    private float age;
    public String getName(){
        return name;
    }
    public String getIdnum(){
        return idnum;
    }
    public float getAge(){
        return age;
    }
    public void setName(String newname){
        this.name=newname;
    }
    public void setIdnum(String newidnum){
        this.idnum=newidnum;
    }
    public void setAge(float newage){
        this.age=newage;
    }
}