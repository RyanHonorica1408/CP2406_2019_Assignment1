import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void clearConsole() {
            System.out.println("\n\n\n\n\n");
    }

    public static void printRoad(Car car, Road road,TrafficLight trafficLight){
        StringBuilder roadString = new StringBuilder();
        StringBuilder carString = new StringBuilder();
        int roadLength= (int) road.getLength();

        for(int i=0; i < roadLength; i++){
            roadString.append("_");
        }
        if(trafficLight.isGreen){
            roadString.append("|G|");
        } else if(trafficLight.isYellow) {
            roadString.append("|Y|");
        }else if(trafficLight.isRed) {
        roadString.append("|R|");
    }

        int carDistance = (int) car.getDistance();
        int diff = roadLength - carDistance;

        if(diff < 0){
            carDistance = -diff - roadLength;
        }
        for(int i=0; i < carDistance; i++){
            if(i !=0){
                carString.replace(i-1,carString.capacity()," ");
                carString.append("o|i|o");

            } else {
                carString.append("o|i|o");
            }
        }
        System.out.println(String.format("%s\n%s\n%s\n",roadString.toString(),carString.toString(),roadString.toString()));
    }

    public static void printRoad(Car car, Road road, float prevLength){
        StringBuilder roadString = new StringBuilder();
        StringBuilder carString = new StringBuilder();
        int roadLength= (int) road.getLength();

        for(int i=0; i < roadLength; i++){
            roadString.append("_");
        }
        int carDistance = (int) ( 0 + car.getDistance());
        int diff = roadLength - carDistance;
        carDistance = (int) (carDistance - prevLength);
        for(int i=0; i < carDistance; i++){
            if(i !=0){
                carString.replace(i-1,carString.capacity()," ");
                carString.append("o|i|o");

            } else {
                carString.append("o|i|o");
            }
        }
        System.out.println(String.format("%s\n%s\n%s\n",roadString.toString(),carString.toString(),roadString.toString()));
    }

    public static void printStatus(Car car, Road road, float diff){
        System.out.println(String.format("Current Speed: %f km/h\nCurrent Distance Travelled: %f\nDistance left to travel: %f ", car.getSpeed(), car.getDistance(), diff));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("E")) {
            System.out.println("Press S to start Simulation \npress E to exit");
            input = scanner.nextLine().toUpperCase();
            if (input.equals("S")) {

                simulation();
            }
        }
    }


    public static void delay(int i) {
        try {
            int delay = i *1000;
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void accelerate(Car car, Road road, TrafficLight trafficLight) {
        float diff = 0;
        float length = road.getLength();
        while (trafficLight.isGreen) {
            if (car.getSpeed() < 60) {
                car.speedUp(trafficLight.isGreen);
            }

            if (car.getSpeed() > 60) {
                car.slowDown(trafficLight.isGreen);
            }
            delay(1);
            car.travelOneSec();
            diff = length - car.getDistance();
            if (diff < 0) {
                diff = 0;
            }
            clearConsole();
            printStatus(car,road,diff);
            printRoad(car,road,trafficLight);
            if (diff < (road.getLength()*0.5)) {
                car.setSpeed(30);
                trafficLight.setRed(true);
                break;
            }
        }
    }

    public static void leaveRoad(Car car, Road road,float prevLength) {
        float diff = 0;
        float fullDistance = road.getLength() + prevLength;
        while (car.getDistance() < fullDistance) {
            if (car.getSpeed() < 60) {
                car.speedUp(true);
            }
            if (car.getSpeed() > 60) {
                car.slowDown(true);
            }
            delay(1);
            car.travelOneSec();
            diff = fullDistance - car.getDistance();
            if (diff < 0) {
                diff = 0;
            }
            clearConsole();
            printStatus(car,road,diff);
            printRoad(car,road,prevLength);
            if (diff == 0) {
                car.setExited(true);
                break;
            }
        }
    }

    public static void deccelerate(Car car, Road road, TrafficLight trafficLight) {
        float diff, length = 0;
        while (trafficLight.isRed) {
            car.slowDown(trafficLight.isRed);
            car.travelOneSec();
            delay(1);
            diff = length - car.getDistance();
            if(diff<0){
                diff = road.getLength()+diff;
            }
            clearConsole();
            printStatus(car,road,diff);
            printRoad(car,road,trafficLight);
            if (diff < 5) {
                car.stop(trafficLight.isRed);
                break;
            }
        }
    }

    public static void stayStopped(Car car , Road road, TrafficLight trafficLight){
        car.setDistance(road.getLength() - 2);
        float diff = road.getLength() - car.getDistance();
        for(int i =0; i < 5; i++){
            clearConsole();
            printStatus(car,road,diff);
            printRoad(car,road,trafficLight);
            delay(1);
        }

    }

    public static void simulation() {
        Car car1 = new Car();
        Road road1 = new Road();
        Road road2 = new Road();
        car1.setOnRoad(1);
        road1.setRoadId(1);
        road2.setRoadId(2);
        TrafficLight trafficLight1 = new TrafficLight();
        car1.setLength(5); // meters
        float MAX_ROAD_LENGTH = 5 * 3 * car1.getLength(); // meters
        float MIN_ROAD_LENGTH = 3 * 2 * car1.getLength(); // meters
        road1.setLength(MAX_ROAD_LENGTH);
        road2.setLength(MIN_ROAD_LENGTH);
        road1.setTrafficLightEnd(true);
        road1.setTrafficLightStart(false);
        car1.setSpeed(0); // kph
        car1.setDistance(0); // meters
        car1.setOnRoad(road1.getRoadId());
        float length = road1.getLength();
        float diff = 0;
        accelerate(car1, road1, trafficLight1);
        deccelerate(car1, road1, trafficLight1);
        clearConsole();
        stayStopped(car1,road1,trafficLight1);
        car1.setOnRoad(2);
        leaveRoad(car1, road2,road1.getLength());
        clearConsole();
        System.out.println(String.format("Current Distance Travelled: %f\nCar %d has left the road", car1.getDistance(), car1.getVehicleId()));
    }

}
