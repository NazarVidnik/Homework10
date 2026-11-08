package part2;

public class Assignment10Part2Main {
    public static void main(String[] args) {
        // 1 Demonstrate a static variable.

        // Access the static variable using the class name.
        MyClass.staticVar = 5;
        System.out.println("Initial value: " + MyClass.staticVar);

        // Create two objects of the same class.
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // Modify the shared variable through the first object.
        obj1.staticVar = 10;

        // Check the value through both objects.
        System.out.println("obj1.staticVar = " + obj1.staticVar);
        System.out.println("obj2.staticVar = " + obj2.staticVar);
        System.out.println(
                "Values are equal: " + (obj1.staticVar == obj2.staticVar)
        );

        // 2. Demonstrate a static method.

        System.out.println("\nCall using the class name:");
        MyClass.staticMethod();

        System.out.println("Call inside a static method:");
        MyClass.anotherStaticMethod();

        System.out.println("Call inside a non-static method:");
        obj1.nonStaticMethod();
    }
}