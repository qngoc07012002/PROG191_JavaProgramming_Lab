public class Main {
    public static void main(String[] args) {

        Student ngoc = new Student();
        ngoc.studentName = "Nguyen Quang Ngoc";
        ngoc.grade1 = 7.5;
        ngoc.grade2 = 8;
        ngoc.grade3 = 8.5;
        System.out.println(Math.round(ngoc.meanOfGrade()));
        ngoc.changeGrade();
        ngoc.showDetails();
    }
}