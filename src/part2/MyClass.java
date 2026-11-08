package part2;
class MyClass {
    // A static variable is shared by all objects of the class.
    static int staticVar;

    static void staticMethod() {
        System.out.println("Static method called");
    }

    static void anotherStaticMethod() {
        // Call a static method from another static method.
        staticMethod();

        //compilation error:
        //nonStaticMethod();
    }

    void nonStaticMethod() {
        // Call a static method from a non-static method.
        staticMethod();
    }
}