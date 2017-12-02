package animals;

public class Dog extends Animal {

    public Dog(int length, String name, String color){
        super( length, name, color);
    }
    public void makeSound() {
        System.out.println("voof, voof");
    }

    }

