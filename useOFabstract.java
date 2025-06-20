abstract class Animal{
    abstract void walks();
    Animal(){
        System.out.println("You are creating an animal");
    }
    public void eats(){
        System.out.println("Eating is nesseary");
    }
}

class Horse extends Animal{
    Horse (){
        System.out.println("You have created a horse");
    }
    public void walks(){
        System.out.println("They walks on 4 legs");
    }
    
    public void speciality(){
        System.out.println("Used for carrying peoples and goods");
    }
}

class Chicken extends Animal{
    Chicken (){
        System.out.println("You have created a chicken");
    }
    public void walks(){
        System.out.println("They walks on 2 legs");
    }
    
    public void speciality(){
        System.out.println("Used for meat and produce eggs");
    }
}

public class OOPS{
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walks();
        horse.speciality();
        Chicken chicken = new Chicken();
        chicken.walks();
        chicken.speciality();
    }
}
