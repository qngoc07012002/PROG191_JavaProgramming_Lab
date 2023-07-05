package Ex5;

import java.util.Scanner;

public class Candidate {
    Scanner scn = new Scanner(System.in);
    private String codeID;
    private String name;
    private int yOB;
    private double mark1;
    private double mark2;
    private double finalMark;
    private String rank;
    private double average;
    public Candidate() {
    }

    public Candidate(String codeID, String name, int yOB, double mark1, double mark2, double finalMark) {
        this.codeID = codeID;
        this.name = name;
        this.yOB = yOB;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.finalMark = finalMark;

    }

    public String getCodeID() {
        return codeID;
    }

    public void setCodeID(String codeID) {
        this.codeID = codeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getyOB() {
        return yOB;
    }

    public void setyOB(int yOB) {
        this.yOB = yOB;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    public double getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }

    public String getRank() {
        return rank;
    }

    public double getAverage() {
        return average;
    }
    public void enterCandidate(){
        System.out.print("Input Code ID: ");
        this.codeID = scn.nextLine();
        System.out.print("Input Name: ");
        this.name = scn.nextLine();
        System.out.printf("Input Year Of Birth: ");
        this.yOB = Integer.parseInt(scn.nextLine());
        System.out.printf("Mark 1: ");
        this.mark1 = Double.parseDouble(scn.nextLine());
        System.out.printf("Mark 2: ");
        this.mark2 = Double.parseDouble(scn.nextLine());
        System.out.printf("Final Mark: ");
        this.finalMark = Double.parseDouble(scn.nextLine());

    }
    public void calAverageMark(){
        average = (((mark1+mark2)/2)+(finalMark*2))/3;
        System.out.println("Average mark of student: "+(float)average);
    }
    public void rankStudent(){
        if (average>=0 && average<5) rank = "Fail";
        else
        if (average>=5 && average<7) rank = "Average";
        else
        if (average>=7 && average<8) rank = "Fairly Good";
        else if (average>=8 && average<=10) rank = "Good";
        System.out.println("Rank of student: "+rank);
    }
}
