import java.awt.*;

public class Car {
    /*Car class, object that holds most of the data for many of the vehicle classes.
    Holds data for Color, sped, distance , length, the IDA of the vehicle itself,
    as well as conditional boolean such as whether the car has exited, has collided and is an emergency vehicle.
    It also holds an array that stores the previous speeds of the Class.
    Many of these variables are placeholders for further implementation.
    The methods here are primarily to move the object as desired by the simulation.
     * */
//    Variable definition.
    public float speed, distance, length;
    public int vehicleId;
    private int behind, front, timeStopped, onRoad;
    private Boolean exited, isCollided, isEmergencyVehicle;
    private float breadth;
    float pastSpeeds[];
    private Color COLOR;

    //Initialisation of variables.
    public Car() {
        length = 5;
        this.breadth = (float) (0.5 * length);
        this.distance = 0;
        this.vehicleId = 0;
        this.timeStopped = 0;
        this.exited = false;
        this.speed = 0;
        this.isCollided = false;
        this.isEmergencyVehicle = false;
        this.COLOR = Color.BLACK;
    }

    //Setters and getters of each of the variables.
    public void setLength(float length) {
        this.length = length;
    }

    public void setBehind(int behind) {
        this.behind = behind;
    }

    public void setCollided(Boolean collided) {
        isCollided = collided;
    }

    public void setCOLOR(Color COLOR) {
        this.COLOR = COLOR;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void setEmergencyVehicle(Boolean emergencyVehicle) {
        isEmergencyVehicle = emergencyVehicle;
    }

    public void setExited(Boolean exited) {
        this.exited = exited;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public void setOnRoad(int onRoad) {
        this.onRoad = onRoad;
    }

    public void setPastSpeeds(float[] pastSpeeds) {
        this.pastSpeeds = pastSpeeds;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setTimeStopped(int timeStopped) {
        this.timeStopped = timeStopped;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public float getLength() {
        return length;
    }

    public Boolean getCollided() {
        return isCollided;
    }

    public Boolean getEmergencyVehicle() {
        return isEmergencyVehicle;
    }

    public Boolean getExited() {
        return exited;
    }

    public Color getCOLOR() {
        return COLOR;
    }

    public float getDistance() {
        return distance;
    }

    public float getSpeed() {
        return speed;
    }

    public float[] getPastSpeeds() {
        return pastSpeeds;
    }

    public int getBehind() {
        return behind;
    }

    public int getFront() {
        return front;
    }

    public int getOnRoad() {
        return onRoad;
    }

    public int getTimeStopped() {
        return timeStopped;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void travelOneSec() {
//        Converts current speed into one second distance in meters and then adds this to the current distance.
        this.distance += ((this.speed * 1000) / 3600);
    }

    public void slowDown(boolean redLight) {
//        If the current road the Car is on, the class will reduce the speed by 85% each iteration (each second)
        if (redLight) {
            setSpeed((float) (getSpeed() * (0.85)));
        }
    }

    public void speedUp(boolean greenLight) {
/*If the Traffic Light the road the car is on is Green, the car will begin to speed up.
If the car is not already 0 it will accelerate by 50% each loop.
If the car is at 0 speed, it will increase by a value of 2.
*/
        if (greenLight) {
            if (this.speed == 0) {
                setSpeed(getSpeed() + 2);
            } else {
                setSpeed((float) (getSpeed() * (1.5)));
            }
        }
    }

    public void stop(boolean redLight) {
//        Stops car (sets speed to 0)
        setSpeed(0);
    }
}

