package old;

public class Parallelogram extends Quadrangle implements Figure {
    double alpha, beta;
    @Override
    public double area() {
        return Math.max(super.a, super.b ) * this.getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * super.a + 2 * super.b;
    }

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getLargeDiagonal() {
        return 0;/*Math.max( Math.sqrt( a * a + b * b - 2 * b * a * Math.cos(Math.toRadians(beta)),
                Math.sqrt( a * a + b * b + 2 * b * a * Math.cos(Math.toRadians(alpha))
                );*/
    }

    @Override
    public double getHeight() {
        return super.a *
                Math.min(super.a * Math.sin(Math.toRadians(alpha)),
                         super.b * Math.sin(Math.toRadians(beta)));
    }

    @Override
    public String getColor() {
        return super.color;
    }

}