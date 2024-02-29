package object1;

public class Dog {
    private String breed;
    private int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }
    Dog[] doggo = new Dog[3];

    Dog doggo1 = new Dog("Husky", 11);
    Dog doggo2 = new Dog("Golden", 8);
    Dog doggo3 = new Dog("Poodle", 4);
    Dog doggo4 = new Dog("Pitbull", 5);

    dog[0] = doggo4;
    dog[1] = doggo3;
    dog[2] = doggo2;
    dog[3] = doggo1;

}
