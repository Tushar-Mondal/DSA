package Questions;
class A{
    private String name;
    private int idnum;
    private int age;
    public String getName(){
        return name;}
    public int getIdnum(){
        return idnum;}
    public int getAge(){
        return age;}
    public void setName(String newname){
        name=newname;}
    public void setIdnum(int newidnum){
        idnum=newidnum;}
    public void setAge(int newage){
        age=newage;}
}
public class Abc extends A{
    public static void main(String[]args){
        Abc x=new Abc();
        x.setName("Tushar");
        x.setIdnum(003);
        x.setAge(20);
        System.out.println("The name is:"+x.getName());
        System.out.println("The Idnum is:"+x.getIdnum());
        System.out.println("The age is:"+x.getAge());
    }
}