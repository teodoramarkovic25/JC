package seven;

import six.geometry.Circle;
import six.geometry.Rectangle;
import six.geometry.Shape;

public class Executor {
    public static void main(String[] args) {
        //circle - circle ... x,y, color, name, r
        // circle - tipa Shape, ali i tipa Circle (polimorfizam) ... calculateArea

        Circle shape1 = new Circle(23, 23, "RED", "Kružić", 23.0);
        consumeShape(shape1);
        //Shape Rectangle
        Rectangle shape2 = new Rectangle(0, 0, "BLACK", "KVADRATIĆ", 20, 10);
        consumeShape(shape2);
    }

    private static void consumeShape(Shape shape) {
        System.out.println("Površina =" + shape.areaCalculation()); // jednom će se pozvati blok koda iz Circle,a jednom iz Rectangle
        //POLIMORFIZAM poziv istoimene metode različite impleentacije

    }

}

