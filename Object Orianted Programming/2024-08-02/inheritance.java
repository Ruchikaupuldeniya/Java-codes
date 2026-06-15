// Animal class (Superclass)
class Animal {
    
    void sound() {
        System.out.println("The animal makes a sound.");
    }
}

// (Subclass)
class Cat extends Animal{
    void sound() { 
        System.out.println("cat noise");
    }
}

class Parrot extends Animal{
    void fly() {
        System.out.println("parrot flying");
    }
}

// (Subclass)
class Dog extends Animal {
   
    
    void sound() {
        System.out.println("The dog barks.");
    }
    
}



class Mainmethod{
public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); 

        Animal myAnimal = new Animal();
        myAnimal.sound(); 

        Animal myCat = new Cat();
        myCat.sound();

        Parrot parrot = new Parrot();
        parrot.fly();
    }
    
}