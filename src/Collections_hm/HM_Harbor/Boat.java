package Collections_hm.HM_Harbor;

public class Boat {
    private boolean finalStop;
    private int freeSeats;


    public Boat(boolean finalStop, int freeSeats) {
        this.finalStop = finalStop;
        this.freeSeats = freeSeats;
    }


    public boolean isFinalStop() {
        return finalStop;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFinalStop(boolean finalStop) {
        this.finalStop = finalStop;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }
    @Override
    public String toString() {
        return "Boat [finalStop=" + finalStop + ", freeSeats=" + freeSeats + "]";
    }
}
