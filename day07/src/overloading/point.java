//use of overloading
package overloading;

public class point {
    private float x;
    private float y;

    public point() {
        super();
    }

    public point(float x) {
        super();
        this.x = x;
    }

    public point(float y, boolean dummy) {  // renamed constructor to avoid clash
        super();
        this.y = y;
    }

    public point(float x, float y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(x=" + x + ", y=" + y + ")";
    }
}
