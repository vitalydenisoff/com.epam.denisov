package home.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Basket {
    private ArrayList<Ball> balls = new ArrayList<>();
    public Basket (Ball... balls) {
        this.balls = new ArrayList<>(Arrays.asList(balls));
    }
    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBall(Ball ball) {
        balls.add(ball);
    }
    public Ball get(int index) {
        return balls.get(index);
    }
    @Override
    public String toString() {
        return new StringJoiner(",", Basket.class.getSimpleName() + "[", + "]")
                .add("balls=" + balls)
                .toString();
    }
}
