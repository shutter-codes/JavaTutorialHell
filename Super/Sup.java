package Super;

class A extends Object {
    // default constructor
    public A() {
        super();
        System.out.println("in constructor A");
    }

    // parameterised constructor
    public A(int n) {
        super();
        System.out.println("the value of n is " + n + " in A");
    }
}

class B extends A {

    // default constructor
    public B() {
        super();
        System.out.println("in constructor B");
    }

    // parameterised constructor
    public B(int n) {
      super(4);
        System.out.println("the value of n is " + n + " in B");
    }
}

public class Sup {
    public static void main(String[] args) {

        // this will invoke the default constructor of both super and sub class.
        // B objB = new B();

        // this will invoke the parameterised constructor of sub class as well as default constructor of super class. its a exception
        B obj2 = new B(5);

    }

}
// when we create a object of a sub class it will
// calls the constrcutor of sub class and super class both.


// super means calls the constructor of the super class.
// super - even if we don't mention it is present in the method.

// super() by default it is calling the default constructor from the super class.
/*
  public B(int n) {
        super(n);
        System.out.println("the value of n is " + n + " in B");
    }
 */

//  output of the code -- this will invoke the parameterised constructor of the super class
/*
the value of n is 5 in A
the value of n is 5 in B
 */


//  what is the super class of A?
// every class in java extends the object class 
// Object class & super is a john cena of java 

// the above inhertance is a multi level inheritance.


// this() will invoke the constructor of the same class
// in constructor A
// in constructor B        
// the value of n is 5 in B



// super() will invoke the constructor of the super class
/*
 the value of n is 4 in A
the value of n is 5 in B
 */