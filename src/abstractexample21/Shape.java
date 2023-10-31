package abstractexample21;

/**
 * Create below Shape class which is abstract
 * abstract class Shape{
 * public abstract void draw();
 * }
 * 2. Create a second class name Rectangle which extends by Shape.
 * class Rectangle extends Shape{
 * public void draw(){System.out.println("drawing rectangle");}
 * }
 * 3. Create a Third class name Circle1 which extends by Shape.
 * class Circle extends Shape{
 * public void draw(){System.out.println("drawing circle");}
 * }
 * 4. Create the fourth class name TestAbstraction1 and inside create the main method as below.
 * //In real scenario, method is called by programmer or user
 * class TestAbstraction{
 * public static void main(String args[]){
 * Shape s=new Circle();//In a real scenario, object is provided through m ethod, e.g., getShape() method
 * s.draw();
 * }
 * }
 */
abstract class Shape {
    public abstract void draw();
}
