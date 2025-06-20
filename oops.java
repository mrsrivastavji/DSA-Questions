abstract class Animal{
    abstract void walk();
    public void eats(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("They walks on 4 legs");
    }
}

class chicken extends Animal{
     public void walk(){
        System.out.println("They walks on 2 legs");
    }
}

public class OOPS{
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
        horse.eats();
        chicken chick = new  chicken();
        chick.walk();
        chick.eats();
    }
}
