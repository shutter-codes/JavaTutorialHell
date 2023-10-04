package AnonymousObject;

class A{
    public A(){
        System.out.println("Object is Created");
    }

    public void show(){
        System.out.println("this is show function");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        // A a = new A();
        new A().show();
        // we cant use this object again
        new A().show();
        // everytime we create a new object it creates a heap memory
        // single time object 
    }
    
}
