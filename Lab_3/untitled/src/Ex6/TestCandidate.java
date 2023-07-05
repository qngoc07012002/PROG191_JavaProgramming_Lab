package Ex6;

import java.util.Scanner;

public class TestCandidate {
    Scanner scn = new Scanner(System.in);
    Candidate[] testCandidate = new Candidate[10];
    public void enterCandidateToList(){
       for (int i=0;i<10;i++){
            System.out.printf("Code ID: ");
            String codeID = scn.nextLine();
            System.out.printf("Name: ");
            String name = scn.nextLine();
            System.out.printf("Year Of Birth: ");
            int yOB = Integer.parseInt(scn.nextLine());
            System.out.printf("Mark 1: ");
            double mark1 = Double.parseDouble(scn.nextLine());
            System.out.printf("Mark 2: ");
            double mark2 = Double.parseDouble(scn.nextLine());
            System.out.printf("Final Mark: ");
            double finalMark = Double.parseDouble(scn.nextLine());
            testCandidate[i] = new Candidate(codeID,name,yOB,mark1,mark2,finalMark);
            testCandidate[i].calAverageMark(); testCandidate[i].rankStudent();
        }
    }
    public void checkStudentPass(){
        int d = 0;
        for (int i=0; i<8;i++){
            if (testCandidate[i].getRank()!="Fail") d++;
        }
        System.out.println(d+" Student PASS!");
    }
    public void displayStudentPass(){
        System.out.println("List of Student Pass:");
        for (int i=0; i<8;i++){
            if (testCandidate[i].getRank()!="Fail") System.out.println(testCandidate[i].getName()+" - "+(float)testCandidate[i].getAverage());
        }

    }
}
//testCandidate[0] = new Candidate("GCD210069","Nguyen Quang Ngoc",2002,10,9.5,8);
//                testCandidate[0].calAverageMark(); testCandidate[0].rankStudent();
//                testCandidate[1] = new Candidate("GCD210069","Nguyen Tien Dung",2002,5,4,3);
//                testCandidate[1].calAverageMark(); testCandidate[1].rankStudent();
//                testCandidate[2] = new Candidate("GCD210069","Truong Tan Phuc",2002,2,3,4);
//                testCandidate[2].calAverageMark(); testCandidate[2].rankStudent();
//                testCandidate[3] = new Candidate("GCD210069","Nguyen Hai Viet",2002,7,8,9);
//                testCandidate[3].calAverageMark(); testCandidate[3].rankStudent();
//                testCandidate[4] = new Candidate("GCD210069","Vo Tran Minh Hieu",2002,6,7,8);
//                testCandidate[4].calAverageMark(); testCandidate[4].rankStudent();
//                testCandidate[5] = new Candidate("GCD210069","Nguyen Van Thang",2002,6,9,8);
//                testCandidate[5].calAverageMark(); testCandidate[5].rankStudent();
//                testCandidate[6] = new Candidate("GCD210069","Pham Hai Viet",2002,7,7,7);
//                testCandidate[6].calAverageMark(); testCandidate[6].rankStudent();
//                testCandidate[7] = new Candidate("GCD210069","Ha Hai Yen",2002,10,10,10);
//                testCandidate[7].calAverageMark(); testCandidate[7].rankStudent();
