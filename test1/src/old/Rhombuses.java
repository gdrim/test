package old;

public class Rhombuses extends Quadrangle implements Figure {
    double alpha, beta;
    @Override
    public double area() {
        return super.b * this.getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * super.a + 2 * super.b;
    }

    public Rhombuses(int a, String color, double alpha, double beta) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getLargeDiagonal() {
        return Math.max( super.a * Math.sqrt(2-2*Math.cos(Math.toRadians(beta))), super.b * Math.sqrt(2-2*Math.cos(Math.toRadians(alpha))));
    }

    @Override
    public double getHeight() {
        return super.a * Math.sin(Math.toRadians(alpha));
    }

    @Override
    public String getColor() {
        return super.color;
    }
}