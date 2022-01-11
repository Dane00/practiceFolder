public class Snake extends Animal{

    public Snake(float Weight, String Class, String Type) {

    }

    @Override
    public void move(){
        System.out.println("Slithers around");

    }
    public void animalSound(){
        System.out.println("The Snake: Hissess");
    }
    public void hunts() {
        System.out.println("I hunt by using my poison to intoxicate and body to strangle prey.");
    }
}
