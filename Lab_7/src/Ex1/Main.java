package Ex1;

import Ex1.Exeption.ExceptionA;
import Ex1.Exeption.ExceptionC;

public class Main {
    public static void main(String[] args){


        try {
            throw new ExceptionC("Test C");

        } catch (ExceptionA ex){
            System.out.println(ex.getMessage());
        }
    }

}

