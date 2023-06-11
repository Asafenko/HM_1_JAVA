package Collections_hm.HM_Harbor;

import java.time.Duration;
import java.util.*;

public class TestHarbor {
    public static void main(String[] args) {
        Passenger name1 = new Passenger(Duration.ofMinutes(5)) ;
        Passenger name2 = new Passenger(Duration.ofMinutes(10));
        Passenger name3 = new Passenger(Duration.ofMinutes(11));
        Passenger name4 = new Passenger(Duration.ofMinutes(5)) ;
        Passenger name5 = new Passenger(Duration.ofMinutes(10));
        Passenger name6 = new Passenger(Duration.ofMinutes(11));
        Passenger name7 = new Passenger(Duration.ofMinutes(5)) ;
        Passenger name8 = new Passenger(Duration.ofMinutes(10));
        Passenger name9 = new Passenger(Duration.ofMinutes(11));

        Boat boat1 = new Boat(false, 10);
        Boat boat2 = new Boat(true, 5);
        Boat boat3 = new Boat(false, 7);


        List<Boat> boats = new ArrayList<>(Arrays.asList(boat1, boat2, boat3));

        List<Passenger> passengers = new ArrayList<>(Arrays.asList(name1, name2, name3, name4, name5, name6, name7, name8, name9));


        Harbor harbor = new Harbor(new Random());

        //harbor.getPassengers().addAll(passengers);

        harbor.addPassenger(name1);
        harbor.addPassenger(name2);
        harbor.addPassenger(name3);
        harbor.addPassenger(name4);
        harbor.addPassenger(name5);
        harbor.addPassenger(name6);
        harbor.addPassenger(name7);
        harbor.addPassenger(name8);
        harbor.addPassenger(name9);

        harbor.addBoat(boat1);
        harbor.addBoat(boat2);
        harbor.addBoat(boat3);

        ListIterator<Boat> boatListIterator = harbor.getBoats().listIterator();


        while(!harbor.getPassengers().isEmpty() && !harbor.getBoats().isEmpty()){
            while(boatListIterator.hasNext()) {
                Passenger passenger = harbor.getNextPassenger();
                Boat boat = boatListIterator.next();

                if (passenger != null && boat != null && boat.getFreeSeats() > 0){
                    boat.setFreeSeats(boat.getFreeSeats() - 1);
                    System.out.println(boat + " " + boat.getFreeSeats());
                    System.out.println(passenger);
                }
            }
        }

        System.out.println("boats: " + harbor.getBoats().size());
        System.out.println("boats: " + harbor.getPassengers().size());

    }
}
