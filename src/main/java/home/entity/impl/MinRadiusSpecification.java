package home.entity.impl;

import home.entity.Ball;
import home.entity.Specification;

public class MinRadiusSpecification implements Specification {
    private int minRadius;

    public MinRadiusSpecification(int minRadius) {
        this.minRadius = minRadius;
    }

    @Override
    public boolean specify(Ball ball) {
        return (ball.getRaduis() < minRadius);
    }
}
