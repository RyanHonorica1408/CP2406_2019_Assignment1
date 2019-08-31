import java.awt.*;

public class Car {
    public float speed,distance,length;
    public int vehicleId;
    private int behind, front,timeStopped,onRoad;
    private Boolean exited,isCollided,isEmergencyVehicle;
    private float breadth;
    float pastSpeeds[];
    private Color COLOR;
    public Car(){
        length = 5;
        this.breadth = (float) (0.5*length);
        this.distance = 0;
        this.vehicleId =0;
        this.timeStopped = 0;
        this.exited = false;
        this.speed=0;
        this.isCollided = false;
        this.isEmergencyVehicle = false;
        this.COLOR = Color.BLACK;
    }

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

    public void travelOneSec(){
        this.distance += ((this.speed*1000)/3600);
    }
}

