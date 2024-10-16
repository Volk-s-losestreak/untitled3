public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println(" Автомобиль летит по пыльному шоссе  ");
    }
    @Override
    public void stop(){
        System.out.println(" Больше не летит");
    }
}
