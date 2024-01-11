package lt.techin.andzej.shapes;

public class Triangle extends Shape {
    private int base;
    private int leftSide;
    private int rightSide;


    public Triangle() {
        base = 1;
        leftSide = 1;
        rightSide = 1;
    }

    public Triangle(int base, int leftSide, int rightSide) {
        if (isTriangleValid(base, leftSide, rightSide)) {
            this.base = base;
            this.leftSide = leftSide;
            this.rightSide = rightSide;
        } else {
            throw new IllegalArgumentException("Bad Inputs");
        }
    }

    public Triangle(String color, boolean filled) {
        super(color, filled);
    }

    public Triangle(String color, boolean filled, int base, int leftSide, int rightSide) {
        super(color, filled);
        if (isTriangleValid(base, leftSide, rightSide)) {
            this.base = base;
            this.leftSide = leftSide;
            this.rightSide = rightSide;
        } else {
            throw new IllegalArgumentException("Bad Inputs");
        }
    }

    public int getBase() {
        return base;
    }

    public int getLeftSide() {
        return leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    public double getPerimeter() {
        return base + leftSide + rightSide;
    }

    public double getArea() {
        //Calculate s
        double s = (leftSide + rightSide + base) / 2;
        //Calculate area
        double area = Math.sqrt(s * (s - leftSide) * (s - rightSide) * (s - base));
        return area;
    }

    public static boolean isTriangleValid(double base, double leftSide, double rightSide) {
        if (base <= 0 || leftSide <= 0 || rightSide <= 0) {
            return false;
        }
        if (base + leftSide <= rightSide || base + rightSide <= leftSide || leftSide + rightSide <= base) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "A Triangle with base = " + base + ", left side = " + leftSide + ", right side = " + rightSide
                + ", which is a subclass of " + super.toString();
    }
}
