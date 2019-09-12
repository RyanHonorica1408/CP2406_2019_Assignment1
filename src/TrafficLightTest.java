import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {
TrafficLight trafficLight = new TrafficLight();
    @Test
    void setOnRoad() {
        trafficLight.setOnRoad(1);
        assertEquals(1,trafficLight.getOnRoad());
    }

    @Test
    void setGreen() {
        trafficLight.setGreen(true);
        assertTrue(trafficLight.isGreen && !trafficLight.isRed);
    }

    @Test
    void setRed() {
        trafficLight.setRed(true);
        assertTrue(!trafficLight.isGreen && trafficLight.isRed);
    }

    @Test
    void setYellow() {
        trafficLight.setYellow(true);
        assertTrue(!trafficLight.isGreen && !trafficLight.isRed);
    }

    @Test
    void setOnRoadEnd() {
        trafficLight.setOnRoadEnd(true);
        assertTrue(trafficLight.onRoadEnd);
    }

    @Test
    void setTrafficLightId() {
        trafficLight.setTrafficLightId(1);
        assertEquals(1,trafficLight.getTrafficLightId());
    }

    @Test
    void getOnRoad() {
        trafficLight.setOnRoad(1);
        assertEquals(1,trafficLight.getOnRoad());
    }

    @Test
    void getTrafficLightId() {
        trafficLight.setTrafficLightId(1);
        assertEquals(1,trafficLight.getTrafficLightId());
    }

    @Test
    void goToRed() {
        trafficLight.goToRed();
        assertTrue(trafficLight.isRed);
    }

    @Test
    void stayStopped() {
        trafficLight.stayStopped();
        assertTrue(trafficLight.isRed);
    }
}