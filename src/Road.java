public class Road {
    /*Simple Road Class, used to store the length data and define where the Car object is on the map. Also relates to the Traffic Light Object.
    Defines in particular if one of the Traffic Light object is on the end of the road or the start of it. These start and end points are arbitrary.
    * Methods are primarily setters and getters. */
//    Variable initialization.
    private int roadId;
    private Boolean trafficLightStart, trafficLightEnd;
    private float length;

    public Road() {
        this.roadId = 0;

    }

    //Getters and setters methods.
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
