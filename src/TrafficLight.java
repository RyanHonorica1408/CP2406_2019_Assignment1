import java.util.concurrent.TimeUnit;

public class TrafficLight {
    public boolean isGreen,isYellow,isRed,onRoadEnd;
    private int onRoad,trafficLightId;
    public TrafficLight(){
        setGreen(true);
        setTrafficLightId(1);
    }
    public void setOnRoad(int onRoad) {
        this.onRoad = onRoad;
    }

    public void setGreen(boolean green) {
        isGreen = green;
        isRed = !green;
        isYellow = !green;
    }

    public void setRed(boolean red) {
        isRed = red;
        isGreen = !red;
        isYellow = !red;
    }

    public void setYellow(boolean yellow) {
        isYellow = yellow;
        isGreen = !yellow;
        isRed = !yellow;
    }

    public void setOnRoadEnd(boolean onRoadEnd) {
        this.onRoadEnd = onRoadEnd;
    }

    public void setTrafficLightId(int trafficLightId) {
        this.trafficLightId = trafficLightId;
    }

    public int getOnRoad() {
        return onRoad;
    }

    public int getTrafficLightId() {
        return trafficLightId;
    }

    public void GoToRed(){
        setGreen(true);
        restInterval();
        setYellow(true);
        restInterval();
        setRed(true);
    }

    public void stayStopped(){
        isRed = true;
    }

    private void restInterval(){
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

}

