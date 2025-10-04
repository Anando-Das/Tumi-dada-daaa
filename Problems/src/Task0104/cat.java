package Task0104;

public class cat extends Animal{

    cat(String name) {

        super(name);

    }

    @Override

    public void speak() {

        

        System.out.println(name+"meows");

    }
    
}
