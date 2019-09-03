import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
            simulation();
        }
    public static void simulation(){
        Car car1 = new Car();
        Road road1 = new Road();
        TrafficLight trafficLight1 = new TrafficLight();
        car1.setLength(5); // meters
        float MAX_ROAD_LENGTH = 5 * 3 * car1.getLength(); // meters
        float MIN_ROAD_LENGTH = 3 * 2 * car1.getLength(); // meters
        road1.setLength(MAX_ROAD_LENGTH);
        road1.setTrafficLightEnd(true);
        road1.setTrafficLightStart(false);
        car1.setSpeed(0); // kph
        car1.setDistance(0); // meters
        car1.setOnRoad(road1.getRoadId());
        float diff =0;
        while (car1.getDistance() < road1.getLength()) {
            diff = road1.getLength() - car1.getDistance();
            if ((trafficLight1.isGreen) && (car1.getSpeed() < 60)) {
                car1.speedUp(trafficLight1.isGreen);
            }
            if (trafficLight1.isRed && (diff < 50)) {
                if (car1.getSpeed() > 0) {
                    car1.slowDown(trafficLight1.isRed);
                }
            }
            if (diff <1.5){
                car1.stop(trafficLight1.isRed);
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            car1.travelOneSec();
            System.out.println(String.format("Current Distance Travelled: %f \n Distance left till end of the road: %f", car1.getDistance(), diff));
            if (car1.getDistance() > (road1.getLength() * 0.5)) {
                trafficLight1.setRed(true);
                System.out.println("Red Light!");
            }

        }
        car1.setExited(true);
        System.out.println(String.format("Current Distance Travelled: %f\nEnd of the Road Space Cowboy", car1.getDistance()));
    }
    }
