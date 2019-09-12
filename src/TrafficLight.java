import java.util.Random;
/*Traffic Light class, holds boolean Data for the Car class to slow down or speed up to.
Also holds identity of road that the object is on.
Methods generally associated with changing color of the lights from Green to Red.
* */
public class TrafficLight {
//    Variable initializations.
    public boolean isGreen,isYellow,isRed,onRoadEnd,probabilityOfChange;
    private int onRoad,trafficLightId;
    private Random random = new Random();
    public TrafficLight(){
        setGreen(true);
        setTrafficLightId(1);
    }
//    Simple setters
    public void setOnRoad(int onRoad) {
        this.onRoad = onRoad;
    }
//Setters based around the fact that while one state is true the others cannot be.
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
//Getter and setter of the probabilityOfChange boolean.
    public boolean isProbabilityOfChange() {
        return probabilityOfChange;
    }

    public void setProbabilityOfChange(boolean probabilityOfChange) {
        this.probabilityOfChange = probabilityOfChange;
    }
//Getter and Setter of onRoad booleans.
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
//Cycle Traffic Lights until they reach Red.
    public void goToRed(){
        setGreen(true);
        restInterval();
        setYellow(true);
        restInterval();
        setRed(true);
    }

    public void stayStopped(){
        isRed = true;
    }

//Delay method.
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

//Randomly generate a number. If the value is greater than 50 then the light goes Red. If not, the light goes Green.
    public void randomStop(){
        int probability = random.nextInt(101);
        if(probability > 50){
            setRed(true);
        }
        else {
            setGreen(true);
        }
    }
}

