import animals.Dog;
public class MainWithImport {
    public static void main(String[] args) { Dog dog = new Dog(); dog.bark(); }
}
public class MainFullyQualified {
    public static void main(String[] args) {
        animals.Dog dog = new animals.Dog();
        dog.bark();
    }
}
