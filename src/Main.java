import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Road road1 = new Road();
        car1.setLength(5); // meters
        float MAX_ROAD_LENGTH = 5*3*car1.getLength(); // meters
        float MIN_ROAD_LENGTH = 3*2*car1.getLength(); // meters
        road1.setLength(MAX_ROAD_LENGTH);
        car1.setSpeed(0); // kph
        car1.setDistance(0); // meters
        car1.setOnRoad(road1.getRoadId());

        while(car1.getDistance() < road1.getLength()){
            car1.setSpeed(car1.getSpeed()+10);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            car1.travelOneSec();
            System.out.println(String.format("Current Distance Travelled: %f",car1.getDistance()));
        }
        car1.setExited(true);
        System.out.println(String.format("Current Distance Travelled: %f\nEnd of the Road Space Cowboy",car1.getDistance()));
    }

}
