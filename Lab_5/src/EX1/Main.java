package EX1;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("Ngoc");
        Employee employee = new Employee("John","QB","099999","@gmail.com","ABC","1000","20/3");
        employee.setName("John");
        Staff staff = new Staff();
        staff.setName("Cea");
        Faculty faculty =  new Faculty();
        faculty.setName("Alice");
        student.displayStudent();
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}
