package day08;

public class Rectangular extends Shape {
    float width;
    float height;

    // Default constructor
    public Rectangular() {
        this.width = 3.2f;   // use this. for clarity
        this.height = 3.2f;
    }

    // Parameterized constructor
    public Rectangular(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calarea() {
        this.area = width * height;
    }
}
