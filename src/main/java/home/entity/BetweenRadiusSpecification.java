package home.entity;

public class BetweenRadiusSpecification  implements Specification {
    private int min;
    private int max;

    public BetweenRadiusSpecification( int min, int max){
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean specify(Ball ball) {
        int radius = ball.getRaduis();
        return (min < radius && radius < max);
    }


}
