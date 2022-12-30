import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

import static java.lang.Math.abs;

public class Tank {
    int x, y, fuel;
    int dir;

    public Tank() {
        this(0, 0);

        //test
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;

        Format f = new Format() {
            @Override
            public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                return null;
            }

            @Override
            public Object parseObject(String source, ParsePosition pos) {
                return null;
            }
        };
    }

    public void goForward(int i) {
        int step;
        step = abs(i);
        if (step < fuel) {
            step = i;
            fuel -= abs(i);
        } else {
            if (i < 0) {
                step = -fuel;
            } else {
                step = fuel;
            }
            fuel = 0;
        }


        if (dir == 0) x += step;
        else if (dir == 1) y += step;
        else if (dir == 2) x -= step;
        else y -= step;
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}