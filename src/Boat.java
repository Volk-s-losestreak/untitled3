public class Boat implements Vehicle {
    @Override
    public void start() {
        System.out.println(" Лодка плывет замечательно ");
    }
    @Override
    public void stop(){
        System.out.println(" Титаник больше не в ресурсе ");
    }
}