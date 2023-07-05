package Ex3;

public class Professor extends Person{
    protected String department;

    public Professor(String code, String name, int rank, String department) {
        super(code, name, rank);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String description() {
        String rankPr = "";
        switch (rank){
            case 0->rankPr = "None";
            case 1->rankPr = "Assistant Professor";
            case 2->rankPr = "Associate Professor";
            case 3->rankPr = "Professor";
            case 4->rankPr = "Assistant Teaching Professor";
            case 5->rankPr = "Associate Teaching Professor";
            case 6->rankPr = "Teaching Professor";
        }
        return rankPr;
    }
    public void display(){
        System.out.println("Professor name:"+name);
        System.out.println("Departmen:"+ department);
        System.out.println("Description:"+ description());
    }
}
