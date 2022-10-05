package home.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class BasketRepository {

    private ArrayList<Ball> balls = new ArrayList<>();

    public BasketRepository(Ball... balls) {
        this.balls = new ArrayList<>(Arrays.asList(balls));
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBall(Ball ball) {
        balls.add(ball);
    }

    public Ball get(int index) {
        return balls.get(index);
    }

    public List<Ball> query(Specification specification) {
        List<Ball> resBalls = new ArrayList<>();
        for (Ball ball : balls) {
            if (specification.specify(ball)) {
                resBalls.add(ball);
            }
        }
        return resBalls;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BasketRepository.class.getSimpleName() + "[", "]")
                .add("balls=" + balls)
                .toString();
    }
}


