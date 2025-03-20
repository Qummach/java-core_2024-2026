package laba2;

public class Task6 {
    public static void main(String[] args) {
        Shape circle = new Circle(6);
        Shape square = new Square(6);
        Shape triangle = new Triangle(6, 6, 6);

        System.out.println("Площадь круга: " + circle.getArea() + " периметр круга: " + circle.getPerimeter());
        System.out.println("Площадь квадрата: " + square.getArea() + " перимерт квадрата: " + square.getPerimeter());
        System.out.println("Площадь треугольника: " + triangle.getArea() + " периметр треугольника: " + triangle.getPerimeter());
    }
}

interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
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
}

class Square implements Shape {
    int side;

    public Square(int side) {
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
}

class Triangle implements Shape {
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}


