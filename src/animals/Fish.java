package animals;

public class Fish extends Animal {

    int depth = 0;
    public Fish(int length, String name, String color){
        super(length,name,color);
    }

    public void makeSound() {
        System.out.println("did u know, that fishes doesn't make sound?");
    }

    public void diveToDepth(int deepDive){
        depth = deepDive;
        System.out.println("I've dive into the deep  " + depth + " meters!!!");
    }
}
