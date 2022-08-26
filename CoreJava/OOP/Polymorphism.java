package CoreJava.OOP;

// Implement static and dynamic polymorphism.
public class Polymorphism {
    static class Animal {
        public void print() {
            System.out.println("Animal");
        }

        // Static polymorphism
        public void print(String s) {
            System.out.println(s);
        }
    }

    static class Dog extends Animal{
        // Dynamic polymorphism
        @Override
        public void print() {
            System.out.println("Dog");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.print();
        animal.print("Static Polymorphism");
        Dog dog = new Dog();
        dog.print();
    }
}
