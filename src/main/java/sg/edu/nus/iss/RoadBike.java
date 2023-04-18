package sg.edu.nus.iss;

import java.util.Arrays;

public class RoadBike extends Bicycle {
    public int seatHeight;
    public char[] toString;

    public RoadBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + seatHeight;
        result = prime * result + Arrays.hashCode(toString);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RoadBike other = (RoadBike) obj;
        if (seatHeight != other.seatHeight)
            return false;
        if (!Arrays.equals(toString, other.toString))
            return false;
        return true;
    }

    @Override
    public String toString() {
     
        return super.toString() + "/nSeat Height=" +seatHeight;
    }
}
