package home.entity;

import home.entity.impl.ColorSpecification;
import home.entity.impl.MinRadiusSpecification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BallMain {
    public static void main(String[] args) {
        Ball ball0 = new Ball();
        ball0.setRadius(5);
        ball0.setColor("red");
        Ball ball1 = new Ball();
        ball1.setRadius(7);
        ball1.setColor("white");
        Ball ball2 = new Ball(75,"red");


        BasketRepository basket = new BasketRepository(ball0, ball1, ball2);
        System.out.println(basket);
        Specification specificationMin = new MinRadiusSpecification(6);
        List<Ball> res = basket.query(specificationMin);
        System.out.println(res);
        Specification specificationBetween = new BetweenRadiusSpecification(6, 10);
        List<Ball> res2 = basket.query(specificationBetween);
        System.out.println(res2);
        Specification ColorSpecification = new ColorSpecification();
        BasketService basketService = new BasketService();
        BasketRepository res3 = basketService.findBallsByColor(basket, "white");
        System.out.println(res3);

        List<String> strings = new ArrayList<>();
        strings.add("j");
        strings.add("1");
        strings.add("f");
        strings.add("g");
        strings.add("b");
        strings.add("a");
        strings.add("c");
        strings.add("d");
        strings.add("peace");
        strings.add("price");

        strings.sort(((o1, o2) -> o1.length() - o2.length()));

        strings.sort(new LengthComparator());
        System.out.println(strings);

        Collections.sort(strings);
        System.out.println(strings);
    }
}
