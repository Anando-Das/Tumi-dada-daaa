package Task0202;

public class Student {
    
    String name,id;

    static int count = 0;

    Student(String name, String id) {

        this.name = name;

        this.id = id;

        count++;

    }

    static void showCount() {

        System.out.println("Total student: "+count);

    }

    void displayinfo()  {

        System.out.println(name);
        System.out.println(id);

    }

    public static void main(String[] args) {
        
        Student ob  = new Student("kk", "121-224");

        Student ob2= new Student("k2","23");

        Student ob3= new Student("k3","24");

        ob.displayinfo();

        ob2.displayinfo();

        ob3.displayinfo();
        Student.showCount();

    }

    
    

}
