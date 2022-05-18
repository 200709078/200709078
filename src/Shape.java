// Adem VAROL - 200709078
public abstract class Shape extends Object {
    private String color;
    private boolean filed;

    public Shape() {
        this.color = "Red";
        this.filed = true;
    }

    public Shape(String color, boolean filed) {
        this.color = color;
        this.filed = filed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filed;
    }

    public void setFiled(boolean filed) {
        this.filed = filed;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return (filed ? "A Shape with color of " + color + " and filled." : "A Shape with color of " + color + " and not filled.");
    }
}
