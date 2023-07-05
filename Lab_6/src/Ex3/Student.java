package Ex3;

public class Student extends Person{
    protected String degreeProgram;
    protected int yearOfGraduate;

    public Student(String code, String name, int rank, String degreeProgram, int yearOfGraduate) {
        super(code, name, rank);
        this.degreeProgram = degreeProgram;
        this.yearOfGraduate = yearOfGraduate;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getYearOfGraduate() {
        return yearOfGraduate;
    }

    @Override
    public String description() {
        String rankSt = "";
        switch (rank){
            case 0->rankSt = "None";
            case 1->rankSt = "Freshman";
            case 2->rankSt = "Sophomore";
            case 3->rankSt = "Junior";
            case 4->rankSt = "Senior";
            case 5->rankSt = "Graduate";
            case 6->rankSt = "Masters Postgraduate";
            case 7->rankSt = "PhD Postgraduate";
        }
        return rankSt;
    }

    public void display(){
        System.out.println("Student name:"+ name);
        System.out.println("Degree:"+ degreeProgram);
        System.out.println("Year Of Graduate:"+yearOfGraduate);
        System.out.println("Description"+description());
    }
}
