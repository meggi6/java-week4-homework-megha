package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // Setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        // Displaying values of variables
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Roll No: " + obj.getRollNo());

        // Direct access of rollNo is not possible due to encapsulation
        // System.out.println("Roll No : " + obj.rollNo);
    }
}

