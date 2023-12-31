package encapsulation26;

/**
 * Encapsulations example (Create package name ‘encapsulation26’ and create all below classes in this package)
 * public class Encapsulate {
 * // private variables declared these can only be accessed by public methods of class
 * private String name;
 * private int rollNo;
 * private int age;
 * //set method for name to access private variable name
 * public void setName(String name) {
 * this.name = name;
 * }
 * // get method for Name to access private variable age
 * public String getName() {
 * return name;
 * }
 * // get method for roll to access private variable rollNo
 * public int getRollNo() {
 * return rollNo;
 * }
 * // set method for roll to access private variable rollNo
 * public void setRollNo(int rollNo) {
 * this.rollNo = rollNo;
 * }
 * // get method for age to access private variable age
 * public int getAge() {
 * return age;
 * }
 * // set method for age to access private variable age
 * public void setAge(int age) {
 * this.age = age; }
 * public class TestEncapsulation {
 * public static void main(String[] args) {
 * Encapsulate obj = new Encapsulate();
 * // setting values of the variables
 * obj.setName("Amit");
 * obj.setAge(19);
 * obj.setRollNo(51);
 * // Displaying values of the variables
 * System.out.println("Prime's name: " +
 * obj.getName());
 * System.out.println("Prime's age: " +
 * obj.getAge());
 * System.out.println("Prime's rollNo: " +
 * obj.getRollNo());
 * // Direct access of rollNo is not possible due to
 * encapsulation
 * // System.out.println("Prime's rollNo : " +
 * obj.geekName);
 * }
 * }
 */
public class Encapsulate {
        // private variables declared and can only accessed by public methods
        private String name;
        private int rollNo;
        private int age;

        // method for name to access private variable
        public void setName(String name) {
            this.name = name;
        }

        //method for Name to access private variable
        public String getName() {
            return name;
        }

        //method for roll no access private variable
        public int getRollNo() {
            return rollNo;
        }

        //method for roll to access private variable
        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        //method for age to access private variable
        public int getAge() {
            return age;
        }

        //method for age to access private variable
        public void setAge(int age) {
            this.age = age;
        }
}
