import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    public Car car = new Car();

    @org.junit.jupiter.api.Test
    void setLength() {
        car.setLength(1);
        assertEquals(1, car.getLength());
    }

    @org.junit.jupiter.api.Test
    void setBehind() {
        car.setBehind(1);
        assertEquals(1, car.getBehind());
    }

    @org.junit.jupiter.api.Test
    void setCollided() {
        car.setCollided(true);
        assertTrue(car.getCollided());
    }

    @org.junit.jupiter.api.Test
    void setCOLOR() {
        car.setCOLOR(Color.RED);
        assertEquals(Color.RED, car.getCOLOR());
    }

    @org.junit.jupiter.api.Test
    void setDistance() {
        car.setDistance(1);
        assertEquals(1, car.getDistance());
    }

    @org.junit.jupiter.api.Test
    void setEmergencyVehicle() {
        car.setEmergencyVehicle(true);
        assertTrue(car.getEmergencyVehicle());
    }

    @org.junit.jupiter.api.Test
    void setExited() {
        car.setExited(true);
        assertTrue(car.getExited());
    }

    @org.junit.jupiter.api.Test
    void setFront() {
        car.setFront(1);
        assertEquals(1, car.getFront());
    }

    @org.junit.jupiter.api.Test
    void setOnRoad() {
        car.setOnRoad(1);
        assertEquals(1, car.getOnRoad());
    }

    @org.junit.jupiter.api.Test
    void setPastSpeeds() {
        float[] pastSpeeds = new float[1];
        pastSpeeds[0] = 1;
        car.setPastSpeeds(pastSpeeds);
        assertEquals(pastSpeeds, car.getPastSpeeds());
    }

    @org.junit.jupiter.api.Test
    void setSpeed() {
        car.setSpeed(1);
        assertEquals(1, car.getSpeed());
    }

    @org.junit.jupiter.api.Test
    void setTimeStopped() {
        car.setTimeStopped(10);
        assertEquals(10, car.getTimeStopped());
    }

    @org.junit.jupiter.api.Test
    void setVehicleId() {
        car.setVehicleId(1);
        assertEquals(1, car.getVehicleId());
    }

    @org.junit.jupiter.api.Test
    void getLength() {
        car.setLength(1);
        assertEquals(1, car.getLength());
    }

    @org.junit.jupiter.api.Test
    void getCollided() {
        car.setCollided(true);
        assertTrue(car.getCollided());
    }

    @org.junit.jupiter.api.Test
    void getEmergencyVehicle() {
        car.setEmergencyVehicle(true);
        assertTrue(car.getEmergencyVehicle());
    }

    @org.junit.jupiter.api.Test
    void getExited() {
        car.setExited(Boolean.TRUE);
        assertTrue(car.getExited());
    }

    @org.junit.jupiter.api.Test
    void getCOLOR() {
        car.setCOLOR(Color.RED);
        assertEquals(Color.RED, car.getCOLOR());
    }

    @org.junit.jupiter.api.Test
    void getDistance() {
        assertEquals(0, car.getDistance());
    }

    @org.junit.jupiter.api.Test
    void getSpeed() {
        car.setSpeed(1);
        assertEquals(1, car.getSpeed());
    }

    @org.junit.jupiter.api.Test
    void getPastSpeeds() {
        float[] pastSpeeds = new float[1];
        pastSpeeds[0] = 1;
        car.setPastSpeeds(pastSpeeds);
        assertEquals(pastSpeeds, car.getPastSpeeds());
    }

    @org.junit.jupiter.api.Test
    void getBehind() {
        car.setBehind(1);
        assertEquals(1, car.getBehind());
    }

    @org.junit.jupiter.api.Test
    void getFront() {
        car.setFront(1);
        assertEquals(1, car.getFront());
    }

    @org.junit.jupiter.api.Test
    void getOnRoad() {
        car.setOnRoad(1);
        assertEquals(1, car.getOnRoad());
    }

    @org.junit.jupiter.api.Test
    void getTimeStopped() {
        assertEquals(0, car.getTimeStopped());
    }

    @org.junit.jupiter.api.Test
    void getVehicleId() {
        assertEquals(0, car.getVehicleId());
    }

    @org.junit.jupiter.api.Test
    void travelOneSec() {
        car.setSpeed((float) 3.6);
        car.travelOneSec();
        assertEquals(1, car.getDistance());
    }

    @org.junit.jupiter.api.Test
    void slowDown() {
        car.setSpeed(10);
        car.slowDown(true);
        assertEquals(8.5, car.getSpeed());
    }

    @org.junit.jupiter.api.Test
    void speedUp() {
        car.setSpeed(10);
        car.speedUp(true);
        assertEquals(15, car.getSpeed());
    }

    @org.junit.jupiter.api.Test
    void stop() {
        car.stop(true);
        assertEquals(0, car.getSpeed());
    }
}