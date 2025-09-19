package day08;

public class Rectangular extends Shape {
    float width;
    float height;

    // default constructor
    public Rectangular() {
        this.width = 3.2f;
        this.height = 4.5f;
    }

    // parameterized constructor
    public Rectangular(float width, float height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public String calarea() {
        this.area = width * height;  // correct formula for rectangle area
        return "Area of Rectangle = " + this.area;
    }
}
