class Mobile{

    // these variables are known as instantaneous variables.
    String brand;
    int price;
    String network;
    static String name;
    // static block - can be called once irrespective of how many objects are created 
    // this is called before the constructor.
  
    static{
        name = "Phone";
        System.out.println("I am static Block");
    }

    
    // constructor
    public Mobile(){
        System.out.println("I am constructor");
        brand="";
        price=500;
    }


    // normal method
    public void show(){
        // inside the method the varialbe are known as local variables.
        System.out.println(brand + ":" + price + ":" + network + ":" + name);
    }


    // static methods
    public static void show1(Mobile obj){
        System.out.println("in static Method");
        System.out.println(name);
        System.out.println(obj.brand + " " + obj.price + " " + obj.name);
        // System.out.println(brand); cant use this as this is not static variable.
         
    }

}



public class StaticKeyword {
    public static void main(String[] args) throws ClassNotFoundException {
      
        // Class.forName("Mobile");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;
        obj1.network = "GSM";
        // Mobile.name = "Iphone-15";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 4000;
        // obj2.network = "LTE";
        // obj2.name = "Samsung s23 ultra";

        // the below value will be shared by all objects as it is static.
        // obj1.name = "Naitiks Phone";

        // System.out.println(Mobile.name);

        // obj1.show();
        // obj2.show();

        // accessing the static method indirectly by passsing the reference of the object to it.
        Mobile.show1(obj1);
    }
    
}

//**  static keyword
// common for all - static
// static variable are shared by all the objects.
// static variables can be called out by their class Name.
// the variables can be declared with the help of their class name.
// making something as a class member not to the object 
// we are also saving memory as a single copy is shared by all.



// **working of static keyword - refering to a same address block 


// can we use instantaneous variable in static block ?


//**  class loads (static block executed) and object are instantiatated  

//**  how to load the class without creating an object.
// --  Class.forName("Mobile"); with this method we can load the class without creating any object.
// we use this when we connect with jdbc



// ** static method
// can directly call using class name
// cant use instantaneous varialbes in static method only static variables can be used.

//***  execution of main method and class -- deadlock occurs ; 
//  so to solve we make main as static and say we dont need object of class to call.  


// normal methods needs object to call the methods


// ---- output of the above code----
// I am static Block
// I am constructor
// I am constructor
// Apple:2000:GSM:Phone
// :500:null:Phone