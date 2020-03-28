package LertView;
import Animals.*;

public class Person implements Animal {
    public void run(){
        System.out.println("persons.run");
    }

    @Override
    public void eat() {
        System.out.println("persons.eat");

    }

    @Override
    public void travel() {
        System.out.println("persons.traval");

    }
}
