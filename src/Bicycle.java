public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println(" Велосипед мчится вперед ");
    }

    @Override
    public void stop() {
        System.out.println(" Больше не мчится ");
    }
}

