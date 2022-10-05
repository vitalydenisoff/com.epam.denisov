package home.entity;

public class BasketService {
    public BasketRepository findBallsByColor(BasketRepository basket, String color) {
        BasketRepository result = new BasketRepository();
        for (int i = 0; i < basket.getBalls().size(); i++) {
            if (basket.get(i).getColor().equals(color)) {
                result.setBall(basket.get(i));
            }

        }
        return result;
    }
}
