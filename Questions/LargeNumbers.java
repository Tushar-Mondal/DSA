package Questions;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(1255555434);
        BigInteger C = new BigInteger("56445563");
        BigInteger X = new BigInteger("5645164653254689945563");

        //Constants
        BigInteger D = BigInteger.ZERO;

        //Additions
        BigInteger S = A.add(B);
        System.out.println(S);

        //Multiply
        BigInteger M = C.multiply(X);
        System.out.println(M);

        //Subtract
        BigInteger sub = C.subtract(X);
        System.out.println(sub);

        //Division
        BigInteger div = C.divide(X);
        System.out.println(div);

        //Now times to play with BigDecimal.
        BigDecimal Bd = new BigDecimal("0.03");
        BigDecimal Bd2 = new BigDecimal("0.04");
        BigDecimal ans = Bd2.subtract(Bd);
        System.out.println(ans);
        //Every properties BigInteger has that can all are present in BigDecimal.
    }
}
