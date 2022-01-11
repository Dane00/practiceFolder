public class Test {

    public static void main(String[] args){

        Cheetah c = new Cheetah(102.1f, "Mammal", "Carnivore");
        Snake s = new Snake(15.6f,"Reptile", "Carnivore");
        Hawk h = new Hawk(3f, "Aves", "Carnivore");


     System.out.println();
     c.animalSound();c.move();c.hunts(); c.eat();c.sleep();System.out.println();

     s.animalSound();s.move();s.hunts(); s.eat();s.sleep();System.out.println();

     h.animalSound();h.move();h.hunts(); h.eat();h.sleep();System.out.println();

    }

}
