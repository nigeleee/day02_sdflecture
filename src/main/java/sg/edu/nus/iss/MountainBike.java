package sg.edu.nus.iss;

import java.util.Arrays;

public class MountainBike extends Bicycle {

    public int seatHeight;
    public char[] toString;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
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
        MountainBike other = (MountainBike) obj;
        if (seatHeight != other.seatHeight)
            return false;
        if (!Arrays.equals(toString, other.toString))
            return false;
        return true;
    }


    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        //return "MountainBike [seatHeight=" + seatHeight + "]";
        return super.toString() + "/nSeat Height=" +seatHeight;
    }


    public char[] getToString() {
        return toString;
    }


    public void setToString(char[] toString) {
        this.toString = toString;
    }

    

    
    
}
