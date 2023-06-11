package Collections_hm.HM_Harbor;

import java.time.Duration;

public class Passenger {
    private Duration stayTime;

    public Passenger(Duration stayTime) {
        this.stayTime = stayTime;
    }

    public Duration getStayTime() {
        return stayTime;
    }
    @Override
    public String toString() {
        return "Passenger [duration=" + stayTime + "]";
    }
}
