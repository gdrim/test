package old;

public abstract class Transport {
    public int fuel, speed;

    public Transport(int fuel, int speed){
        this.fuel = fuel;
        this.speed = speed;
    }

    public abstract boolean canMove(int n);
    public abstract int getFuelLevel();

}
