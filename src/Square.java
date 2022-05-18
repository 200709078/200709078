// Adem VAROL - 200709078
public class Square extends Rectangle {
    private double side;

    public Square() {
        super(1, 1);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filed) {
        super(side, side, color, filed);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side     = " + super.getLength() + ", which is a subclass of (" + super.toString() + ")";
    }
}
