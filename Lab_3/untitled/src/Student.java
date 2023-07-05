import java.util.Scanner;

public class Student {
    Scanner scn = new Scanner(System.in);
    String studentName;
    double grade1,grade2,grade3;

    public Student() {
    }

    public Student(String studentName, double grade1, double grade2, double grade3) {
        this.studentName = studentName;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    public double meanOfGrade() {
        return (grade1 + grade2 + grade3) / 3;
    }
    public void changeGrade() {
        System.out.print("Which grade do u want to change? (1,2,3): ");
        int grade = Integer.parseInt(scn.nextLine());
        if (grade == 1) {
            System.out.print("Input new grade 1: ");
            grade1 = Double.parseDouble(scn.nextLine());
        }
         else
             if (grade == 2){
                 System.out.print("Input new grade 2: ");
                 grade2 = Double.parseDouble(scn.nextLine());
             }
             else
                 if (grade == 3){
                     System.out.print("Input new grade 3: ");
                     grade3 = Double.parseDouble(scn.nextLine());
                 }
    }
    public void showDetails(){
        System.out.println("Student name: "+studentName);
        System.out.println("Mean of grade: "+ Math.round(meanOfGrade()));
        if (meanOfGrade()>=8) System.out.println("Distinction");
         else if (meanOfGrade()>=5 || meanOfGrade()<8) System.out.println("Pass");
            else System.out.println("Fail");
    }
}
