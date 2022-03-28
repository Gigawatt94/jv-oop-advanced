package core.basesyntax;

public abstract class Figure implements Draw, AreaCalculator {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
