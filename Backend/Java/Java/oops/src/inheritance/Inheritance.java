package inheritance;

class Animal {
    protected String name;
    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name+ " is eating.");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping." );
    }

    public void displayDetails(){
        System.out.println("Name "+ name);
    }
}

class Dog extends Animal{
    private String breed;

    Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    @Override
    public void eat(){
        System.out.println(name+" ( "+ breed +" )"+ " is eating.");
    }

    @Override
    public void displayDetails(){
        System.out.println("Name "+ name+" , Breed: "+breed);
    }
}
public class Inheritance {
    public static void main(String[] args){
        Animal a1 = new Animal("Pulto");
        a1.eat();
        a1.displayDetails();
        Dog d1 = new Dog("Moti","Dog");
        d1.eat();
        d1.displayDetails();
    }
}
