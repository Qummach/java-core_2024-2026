package laba2;

public class Task5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Rectangle rectangle1 = new Rectangle();

        rectangle1.setHeight(20);
        rectangle1.setWidth(6);

        rectangle.square();
        rectangle1.square();
    }
}

class Rectangle {
    int width;
    int height;

    public Rectangle() {

    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void square() {
        System.out.println("Площадь равна: " + (width * height));
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
