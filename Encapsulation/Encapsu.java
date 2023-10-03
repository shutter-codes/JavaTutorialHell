package Encapsulation;

class Human {

    private int age=20;
    private String name="monster";

    // private int age;
    // private String name;

    // getters
    public int getage() {
        return age;
    }

    public String getname() {
        return name;
    }

    // setters
    public void setAge(int a) {
        age = a;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsu {
    public static void main(String[] args) {

        Human h1 = new Human();
        h1.setAge(22);
        h1.setName("Naitik Sharma");
        System.out.println(h1.getage() + " " + h1.getname());

    }

}
