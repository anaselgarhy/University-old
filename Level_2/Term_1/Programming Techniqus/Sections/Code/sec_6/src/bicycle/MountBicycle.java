package bicycle;

public class MountBicycle extends Bicycle{
    public int seatHeight;

    public MountBicycle(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    public void seatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", seatHeight=" + seatHeight +
                '}';
    }
}
