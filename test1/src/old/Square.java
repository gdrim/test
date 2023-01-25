package old;

public class Square extends Quadrangle implements Figure {
    @Override
    public double area() {
        return super.a * super.b;
    }

    @Override
    public double perimeter() {
        return 2 * super.a + 2 * super.b;
    }

    public Square(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double getLargeDiagonal() {
        return super.a * Math.sqrt(2);
    }

    @Override
    public double getHeight() {
        return super.a;
    }

    @Override
    public String getColor() {
        return super.color;
    }
}
