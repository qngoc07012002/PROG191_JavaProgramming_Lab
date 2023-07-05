package Ex3;

import java.util.Scanner;

public class PersonList {
    Scanner scn = new Scanner(System.in);
    public Person[] personList;
    int numberOfPerson;
    public PersonList() {
        System.out.print("Number of Person: ");
        numberOfPerson = Integer.parseInt(scn.nextLine());
        personList = new Person[numberOfPerson];

        for (int i=0; i<numberOfPerson; i++){
            System.out.println("Person "+(i+1));
            System.out.print("Type (Professor, Student) ");
            String type = scn.nextLine();
            System.out.printf("Code: ");
            String code = scn.nextLine();
            System.out.printf("Name: ");
            String name = scn.nextLine();
            System.out.printf("Rank: ");
            int rank = Integer.parseInt(scn.nextLine());

            if (type.equals("Professor")){
                System.out.printf("Department: ");
                String department = scn.nextLine();
                personList[i] = new Professor(code,name,rank,department);
            }
            else if (type.equals("Student")){
                System.out.printf("Degree Program: ");
                String degreeProgram = scn.nextLine();
                System.out.printf("Year of Graduate: ");
                int yearOfGraduate = Integer.parseInt(scn.nextLine());
                personList[i] = new Student (code,name,rank,degreeProgram,yearOfGraduate);
            }
        }
    }

    public void displayAll(){
        for (int i =0; i < numberOfPerson; i++){
            personList[i].display();
            System.out.println();
        }
    }

    public void displayByRank(){
        System.out.print("Enter Rank: ");
        int rank = Integer.parseInt(scn.nextLine());

        for (var person:personList){
            if (person.getRank() == rank) {
                person.display();
                System.out.println();
            }
        }
    }

    public int averageRank(){
        double sum = 0;
        for (int i=0; i<numberOfPerson; i++){
            sum = sum + personList[i].getRank();
        }
        sum = sum / personList.length;
        System.out.printf("Average Rank: %.2f",sum);
        System.out.println();

        return (int) Math.round(sum);
    }

    public void maxRank(){
        int max = personList[0].getRank();
        int vt =0;
        for (int i=1; i< numberOfPerson; i++){
            if (personList[i].getRank()>max ){
                max = personList[i].getRank();
                vt = i;
            }
        }
        System.out.println("Person Has Max Rank:");
        personList[vt].display();
    }

    public void removePerson(){
        System.out.print("Person Code: ");
        String code = scn.nextLine();
        int vt = -1;
        for (int i=0; i< numberOfPerson; i++){
            if (personList[i].getCode().equals(code)) {
                vt = i;
                break;
            }
        }
        if (vt == -1 ) System.out.println("Not Found");
        else {
            for (int i = vt; i< numberOfPerson-1;i++){
                personList[i] = personList[i+1];
            }
            numberOfPerson--;
            System.out.println("Remove Done!");
        }

    }
}
