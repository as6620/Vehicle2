public class Bicycle extends Vehicle{
    @Override
    public void start(){
        System.out.println("startBicycle!");
    }

    @Override
    public void stop(){
        System.out.println("stopBicycle!");
    }

    @Override
    public void accelerate(){
        System.out.println("accelerateBicycle!");
    }
}
