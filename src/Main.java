public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Road road1 = new Road();
        car1.setLength(5);
        float MAX_ROAD_LENGTH = 5*3*car1.getLength();
        float MIN_ROAD_LENGTH = 3*2*car1.length;
        road1.setLength(MAX_ROAD_LENGTH);
        car1.setSpeed(0);
        car1.setDistance(0);
        float current_speed = car1.getSpeed();
        long start_time = System.currentTimeMillis();
        while(car1.getDistance() < road1.getLength()){
            float time_elapsed = (float) ((System.currentTimeMillis() - start_time)*(2.7778E-7));
            float current_distance = car1.getDistance();
            car1.setSpeed(car1.getSpeed()+2);
            car1.setDistance((float) (current_distance+(car1.getSpeed()*time_elapsed)));
            System.out.println(String.format("Current Distance Travelled: %f",car1.getDistance()));

        }
        System.out.println(String.format("Current Distance Travelled: %f\nEnd of the Road Space Cowboy",car1.getDistance()));
    }

}
