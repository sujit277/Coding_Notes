package encapsulation;

class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayPersonInfo(){
        System.out.println("Name "+ name+", Age "+ age);
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Person person = new Person("Sujit",22);
        person.displayPersonInfo();
        person.setName("Thor");
        person.setAge(25);
        person.displayPersonInfo();
    }
}
