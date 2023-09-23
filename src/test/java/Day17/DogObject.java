package Day17;

public class DogObject {
    public static void main(String[] args) {
        // object creation
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        dog1.name="alex";
        dog1.age=5;
        dog1.color="brown";
        dog2.age=7;
        dog2.name="box";
        dog1.barking();
        System.out.println(dog2.age);
        dog2.sleeping();
    }
}
