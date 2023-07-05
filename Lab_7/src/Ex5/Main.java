package Ex5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
