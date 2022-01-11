public class Hawk extends Animal {

    public Hawk(float Weight, String Class, String Type) {

    }

    @Override
    public void move() {
        System.out.println("Flies around");
    }

    public void animalSound() {
        System.out.println("The Hawk: Squawk squawk");
    }
    public void hunts(){
        System.out.println("I hunt by swooping down at high speeds and using my strong and sharp talons.");

}
}