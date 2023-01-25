package old;

public class Rectangle extends Quadrangle implements Figure {
    @Override
    public double area() {
        return super.a * super.b;
    }

    @Override
    public double perimeter() {
        return 2 * super.a + 2 * super.b;
    }

    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(super.a * super.a + super.b * super.b);
    }

    @Override
    public double getHeight() {
        return Math.min(super.a,super.b);
    }

    @Override
    public String getColor() {
        return super.color;
    }
}
