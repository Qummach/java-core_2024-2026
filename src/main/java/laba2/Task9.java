package laba2;

public class Task9 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(6);
        Square1 square1 = new Square1(6);
        Triangle1 triangle1 = new Triangle1(6, 6, 6);

        circle1.displayResult();
        square1.displayResult();
        triangle1.displayResult();
    }
}

abstract class Shape1 {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Circle1 extends Shape1 {
    double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void displayResult() {
        System.out.println("Площадь круга равна: " + getArea() + " Периметр круга равен: " + getPerimeter());
    }
}

class Square1 extends Shape1 {
    double side;

    public Square1(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public void displayResult() {
        System.out.println("Площадь квадрата равна: " + getArea() + " Периметр квадрата равен: " + getPerimeter());
    }
}

class Triangle1 extends Shape1 {
    double a, b, c;

    public Triangle1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s -a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public void displayResult() {
        System.out.println("Площадь треугольника равна: " + getArea() + " Периметр треугольника равен: " + getPerimeter());
    }
}
