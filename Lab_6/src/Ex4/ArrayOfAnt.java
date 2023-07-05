package Ex4;

import java.util.Random;



public class ArrayOfAnt {
    Ant[] arrayOfAnt = new Ant[10];
    Random random = new Random();
    public ArrayOfAnt() {
    }
    public void enterAntToList(){

        for (int i=0; i<10 ; i++){
            int num = random.nextInt(3)+1;
            if (num == 1) arrayOfAnt[i] = new Worker();
            else if (num==2) arrayOfAnt[i] = new Drone();
            else arrayOfAnt[i] = new Queen();
        }
        System.out.println("Array Ant Created!");
        displayAntList();
    }

    public void attackAntList(){
        for (Ant ant : arrayOfAnt){
            ant.damage(random.nextInt(81));
        }
        System.out.println("Ant Attacked!");
        displayAntList();
    }

    public void displayAntList(){
        for (Ant ant : arrayOfAnt){
            String status = ant.checkDead() ? "Dead" : "Alive";
            System.out.printf("%-10s |  %10.1f  | %15s\n", ant.getClass().getSimpleName(), ant.getHealth(), status);
        }
    }
}
