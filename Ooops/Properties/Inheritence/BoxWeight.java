package Ooops.Properties.Inheritence;

public class BoxWeight extends Box{
    double weight;
    BoxWeight (){
        this.weight = 10;
    }
    BoxWeight (BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
    BoxWeight (double side, double weight){
        super(side);
        this.weight = weight;
    }
    BoxWeight (double l, double h, double w, double weight){
        super(l, h, w);
        System.out.println(super.weight);
        this.weight = weight;
        System.out.println(this.weight);
    }

    public static void main(String[] args) {
        BoxWeight obj = new BoxWeight(5,6,5,10);
        System.out.println(obj.weight);
    }
}
