package Ooops.Access;

public class ObjectDemo {
    int num;
    float gpa;
    public ObjectDemo(int num, float gpa){
        this.num = num;
        this.gpa = gpa;
    }
    public int hashCode(){
        return super.hashCode();
    }
    public boolean equals(Object obj){
        return this.num == ((ObjectDemo)obj).num;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String toString(){
        return super.toString();
    }
    protected void finalize() throws Throwable{
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(12, 56.8f);
        ObjectDemo obj1 = new ObjectDemo(12, 78.9f);
        if(obj == obj1){
            System.out.println("obj is equal to obj1");
        }
        if(obj.equals(obj1)){
            System.out.println("obj is equal to obj1");
        }
        System.out.println(obj.getClass());
//        System.out.println(obj.hashCode());
//        System.out.println(obj1.hashCode());
    }
}
