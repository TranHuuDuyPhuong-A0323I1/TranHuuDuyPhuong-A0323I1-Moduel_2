package ss7_md2.bai1;

public class Circle extends Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }


}
