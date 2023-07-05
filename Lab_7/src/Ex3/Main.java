package Ex3;

import Ex3.Exception.ExceptionA;
import Ex3.Exception.ExceptionB;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("Test");
        } catch (ExceptionA e) {
            System.out.println("Caught ExceptionA: " + e.getMessage());
        }

        try {
            throw new ExceptionB("Test");
        } catch (ExceptionB e) {
            System.out.println("Caught ExceptionB: " + e.getMessage());
        }

        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        try {
            throw new IOException();
        } catch (Exception e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
