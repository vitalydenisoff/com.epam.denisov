package home.entity.impl;

import home.entity.Ball;
import home.entity.Specification;

import static java.net.HttpCookie.equalsIgnoreCase;

public class ColorSpecification implements Specification {
    private String color1 = "white";
    private String color2 = "red";

    public ColorSpecification() {
        this.color1 = color1;
    }
    @Override
    public boolean isExist(String ball) {
        return ball.getColour(Ball ball).equalsIgnoreCase(color1);
    }

    @Override
    public boolean specify(Ball ball) {
        return false;
    }
}
