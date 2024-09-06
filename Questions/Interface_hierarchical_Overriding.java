package Questions;
public class Interface_hierarchical_Overriding {
    public static void main(String[] args) {
        Bank obj=new SBI();
        System.out.println("ROI: "+obj.rateofInterest());
    }
}
interface Bank{
    float rateofInterest();
}
class SBI implements Bank{
    public float rateofInterest(){
        return 9.15F;
    }
}
class PNB implements Bank{
    public float rateofInterest(){
        return 9.7F;
    }
}