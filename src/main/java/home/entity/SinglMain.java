package home.entity;

import java.math.BigDecimal;
import java.math.MathContext;

public class SinglMain {

    public static void main(String[] args) {
        Singl singl = Singl.getInstance();
        Singl singl1 = Singl.getInstance();
        Singl singl2 = Singl.getInstance();
        Singl singl3 = Singl.getInstance();
        System.out.println(singl2==singl1);
        System.out.println(singl2==singl3);
        Boolean b = null;
        Integer n = null;
        System.out.println(b);
        float res = 0.4f - 0.3f;
        System.out.println(res);
        BigDecimal big1 = BigDecimal("0.4");
        BigDecimal big2 = BigDecimal("0.3");
        BigDecimal bigRes = big1.subtract(big2, MathContext.DECIMAL32);
        System.out.println(bigRes);
        boolean res1 = 1.000001f == 1.000001f;
        System.out.println(res1);
        System.out.println(1.00000f == 1.000002f);
        System.out.println(0.100000001f == 0.100000002f);
    }
}
