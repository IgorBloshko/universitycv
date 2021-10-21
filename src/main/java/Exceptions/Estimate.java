package Exceptions;

public class Estimate extends Exception {
    public Estimate(String s) {
        super("Estimate should be more than 2");
        System.out.println(" ");
    }

}
