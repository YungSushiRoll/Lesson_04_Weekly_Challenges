package Weekly_Challenges.Letters;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class BigIntegerLetters {
    public static void main(String[] args) {

        BigInteger Ca = new BigInteger("38041430");
        BigInteger Wi = new BigInteger("5726398");
        BigInteger Tx = new BigInteger("26059203");

        DecimalFormat df = new DecimalFormat("#,###.####");

        BigInteger Wi2Ca = Wi.multiply(Ca);
        System.out.println(Wi2Ca + " letters sent from Wisconsin to California");
        BigInteger Ca2Tx = Wi2Ca.multiply(Tx);
        System.out.println(Ca2Tx + " copies sent from California to Texas");
        BigDecimal copyCost = new BigDecimal("3.23");
        BigDecimal totalCost = copyCost.multiply(new BigDecimal(Ca2Tx));
        System.out.println("It would cost $" + df.format(totalCost));

    }
}
