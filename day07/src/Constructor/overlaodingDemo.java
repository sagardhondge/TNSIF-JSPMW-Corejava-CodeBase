package Constructor;

public class overlaodingDemo {

    public static void main(String[] args) {
        System.out.println(" -- Constructor Overloading --");

        point p = new point(42f, 56f);  
        System.out.println(p);
    
    System.out.println(" -- Method Overloading --");
    System.out.println(" Method overloading : " + MethodOverlading.addition(1, 2, 3));    
    System.out.println(" Method overloading : " + MethodOverlading.addition(1f, 2f));
    }
    
}
