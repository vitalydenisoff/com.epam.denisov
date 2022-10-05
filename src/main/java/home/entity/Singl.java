package home.entity;

public class Singl {

    private static Singl singlInstance;
    private static int count = 0;

    private Singl() {
        System.out.println("constructor");
    }

    public static Singl getInstance() {
        if (count < 2 || singlInstance == null) {
            singlInstance = new Singl();
            count++;
        }
        System.out.println("getInstance " + count);
        return singlInstance;
    }
}
