package Ex2;

import java.util.Scanner;

public class ArrayOfFractions {
    Fraction[] arrayOfFractions = new Fraction[10];
    Scanner scn = new Scanner(System.in);
    public void enterFractiontoList() {
      for (int i=0;i<10;i++){
            System.out.println("Fraction "+(i+1)+":");
            System.out.print("a: ");
            int a = Integer.parseInt(scn.nextLine());
            System.out.print("b: ");
            int b = Integer.parseInt(scn.nextLine());
            arrayOfFractions[i] = new Fraction(a,b);
        }
    }
    public void displayFractionList(){
        for (int i=0; i<10; i++){
            System.out.println("Fraction "+(i+1)+":"+(arrayOfFractions[i].getA())+"/"+(arrayOfFractions[i].getB()));
        }
    }
    public void find2FractionGreatestSum(){
        Fraction findMax = new Fraction();
        findMax = Fraction.addFraction(arrayOfFractions[0],arrayOfFractions[1]);
        double max = findMax.getA() / findMax.getB();
        int vt1 = 0;
        int vt2 = 1;
        for (int i=0; i<9; i++)
            for (int j=i+1; j<10; j++)
            {
                findMax = Fraction.addFraction(arrayOfFractions[i],arrayOfFractions[j]);
                if (max < ((double)findMax.getA() / findMax.getB())) {
                    max = (double)findMax.getA() / findMax.getB();
                    vt1 = i;
                    vt2 = j;
                }
            }
        System.out.println("2 Fractions have Greatest Sum is: "+(double)max);
        arrayOfFractions[vt1].showFraction();
        arrayOfFractions[vt2].showFraction();
    }
    public void sortFractionsList(){
        int i,j;
        Fraction tg = new Fraction();
        for (i = 9;i>=0;i--){
            for (j=1;j <=i ; j++){
                if ((double)arrayOfFractions[j-1].getA()/arrayOfFractions[j-1].getB() > (double)arrayOfFractions[j].getA()/arrayOfFractions[j].getB()){
                    tg = arrayOfFractions[j-1];
                    arrayOfFractions[j-1] = arrayOfFractions[j];
                    arrayOfFractions[j] = tg;
                }
            }
        }
    }
}
