package lt.techin.andzej;

import lt.techin.andzej.shapes.*;

import java.sql.SQLOutput;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        Rectangle rect = new Rectangle("green", false, 50, 5);
        Square sqr = new Square(10);
        Triangle tr = new Triangle(12, 10, 10);

        ArrayList<Shape> list = new ArrayList<>();
        list.add(cir);
        list.add(rect);
        list.add(sqr);
        list.add(tr);
        sqr.setLength(30);

        double totalArea = 0;
        Shape newShape = null;
        double largest = Integer.MIN_VALUE;
        for (Shape s : list) {
            totalArea += s.getArea();
            if (newShape == null || s.getPerimeter() > largest) {
                newShape = s;
                largest = s.getPerimeter();
            }

        }
        System.out.println("Total area is: " + totalArea);
        System.out.println("Largest perimeter have: " + newShape.getClass().getSimpleName() + " " + newShape.getPerimeter());

        System.out.println("Square side equals: " + sqr.getSide());


    }


}


