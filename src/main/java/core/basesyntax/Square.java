package core.basesyntax;

public class Square extends Figure implements Area, Draw {
    public String color;
    private int side;

    public Square(String color, int side) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side + "units, color "
                + color);
    }
}