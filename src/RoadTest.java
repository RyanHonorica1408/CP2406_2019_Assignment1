import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {
    Road road = new Road();

    @Test
    void getLength() {
        road.setLength(1);
        assertEquals(1, road.getLength());
    }

    @Test
    void setLength() {
        road.setLength(1);
        assertEquals(1, road.getLength());
    }

    @Test
    void setRoadId() {
        road.setRoadId(1);
        assertEquals(1, road.getRoadId());
    }

    @Test
    void getRoadId() {
        road.setRoadId(1);
        assertEquals(1, road.getRoadId());
    }

    @Test
    void setTrafficLightEnd() {
        road.setTrafficLightEnd(true);
        assertTrue(road.getTrafficLightEnd());
    }

    @Test
    void setTrafficLightStart() {
        road.setTrafficLightStart(true);
        assertTrue(road.getTrafficLightStart());
    }

    @Test
    void getTrafficLightStart() {
        road.setTrafficLightStart(true);
        assertTrue(road.getTrafficLightStart());
    }

    @Test
    void getTrafficLightEnd() {
        road.setTrafficLightEnd(true);
        assertTrue(road.getTrafficLightEnd());
    }
}