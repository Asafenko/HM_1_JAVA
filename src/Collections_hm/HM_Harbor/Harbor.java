package Collections_hm.HM_Harbor;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Harbor {
    private LinkedList<Passenger> passengers;
    private ArrayList<Boat> boats;
    private Random random;


    public Harbor(Random random) {
        passengers = new LinkedList<>();
        boats = new ArrayList<>();
        this.random = random;
    }




    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public void addBoat(Boat boat){
        boats.add(boat);
    }

    public Duration getAverageStayTime(){
        long totalStayTime = 0;
        for (Passenger p : passengers){
            totalStayTime += p.getStayTime().toMillis();
        }
        long averageStayTime = totalStayTime / passengers.size();
        return Duration.ofMillis(averageStayTime);
    }


    public boolean isEnoughInterval(int maxPassengers){
        for (Boat boat : boats){
            if (boat.getFreeSeats() < maxPassengers){
                return false;
            }
        }
        return true;
    }


    public LinkedList<Passenger> getPassengers() {
        return passengers;
    }

    public ArrayList<Boat> getBoats() {
        return boats;
    }


    public Passenger getNextPassenger(){
        return passengers.poll();
    }
}
