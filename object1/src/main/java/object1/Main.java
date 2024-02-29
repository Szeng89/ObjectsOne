package object1;



public class Main {
    public static void main(String... args) {
        Person person1 = new Person("Shijin", 34);
        System.out.println("height of person 3 : " + person1.height + " centimeters");



       Dog[] dog = new Dog[4]; //how make array


        Dog doggo1 = new Dog("Mocha", 11,"hhh");
        Dog doggo2 = new Dog("Nala", 8, "Golden Poodle");
        Dog doggo3 = new Dog("Cookie", 4,"Shiba Inu");
        Dog doggo4 = new Dog("Nova", 5, "Labodor");

         dog[0] = doggo4;
         dog[1] = doggo3;
         dog[2] = doggo2;
         dog[3] = doggo1;

        for(int i = 0; i < dog.length;i++) {
            System.out.println(dog[i].getName()+" "+dog[i].getBreed());
        }


        }







}
