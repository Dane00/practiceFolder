public abstract class Animal {
    //in pounds
  private float Weight;
    //ex. mammal
    private String Class;
    //carnivore, herbivore, or omnivore
    private String Type;

    public void eat() {
        System.out.println("nom nom nom");
    }
    public void sleep(){
        System.out.println("Zzzzz");
    }
    public void animalSound(){
       //System.out.println();
    }
    public void hunts(){
       // System.out.println();
    }
    public abstract void move();
}


