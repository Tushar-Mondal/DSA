package Ooops.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a, b);
            //Mimicking
            String str = "Tushar";
            if(str.equals("Tushar")){
               throw  new Exception("Name is Tushar");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Normal Exception");
        }finally {
            System.out.println("This will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please don't divided by zero");
        }
        return a/b;
    }
}
