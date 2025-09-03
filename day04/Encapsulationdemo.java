package oopsconcept;

// Class with encapsulation
class Student {
    // private variables (data hiding)
    private int age;
    private String name;
    private int serialNo;

    // Getter and Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    // Getter and Setter for name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Getter and Setter for serialNo
    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
    public int getSerialNo() {
        return serialNo;
    }
}

// Main class
public class Encapsulationdemo {
    public static void main(String[] args) {
        // Object creation
        Student obj = new Student();

        // Setting values via setter methods
        obj.setAge(21);
        obj.setName("Sagar");
        obj.setSerialNo(1234);

        // Getting values via getter methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Serial No: " + obj.getSerialNo());
    }
}
