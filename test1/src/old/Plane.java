package old;

public class Plane extends Transport {

    public Plane(int fuel, int speed) {
        super(fuel, speed);
    }

    @Override
    public boolean canMove(int n) {
        if (super.fuel >= n) {
            super.fuel -= n;
            return true;
        } else {
            return false;
        }
    }

    public void fillFuel(int n) {
        super.fuel = +n;
    }

    @Override
    public int getFuelLevel() {
        return super.fuel;
    }
}
