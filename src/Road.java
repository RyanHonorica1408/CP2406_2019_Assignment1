public class Road {
    private int roadId;
    private Boolean trafficLightStart,trafficLightEnd;
    private float length;
    public Road(){
        this.roadId = 0;

    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setRoadId(int roadId) {
        this.roadId = roadId;
    }

    public int getRoadId() {
        return roadId;
    }

    public void setTrafficLightEnd(Boolean trafficLightEnd) {
        this.trafficLightEnd = trafficLightEnd;
    }

    public void setTrafficLightStart(Boolean trafficLightStart) {
        this.trafficLightStart = trafficLightStart;
    }

    public Boolean getTrafficLightStart() {
        return trafficLightStart;
    }

    public Boolean getTrafficLightEnd() {
        return trafficLightEnd;
    }
}
