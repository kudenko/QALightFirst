package animals;

public class Bird extends Animal{

    int tailLength;

    public Bird(int length, String name, String color, int tailLength){
        super(length, name, color);
        this.tailLength = tailLength;
    }
    public void makeSound() {
        System.out.println("I'm bird, I'm BIRD!!!");
    }

    public void fly(){
        System.out.println("I'm fly like an eagle");
    }
}
