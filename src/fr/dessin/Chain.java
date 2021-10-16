package fr.dessin;
    // Here we discover the real chaining design
public class Chain {
    public Chain() {

    }

    public Chain methodA(String text){  // method that returns the current object. we can chain the methods on it
        // we  can find an example in the run main method.
        System.out.println("method a " + text);
        return this;
    }

    public Chain methodB(String text) {
        System.out.println("method b " + text);
        return this;
    }

}
