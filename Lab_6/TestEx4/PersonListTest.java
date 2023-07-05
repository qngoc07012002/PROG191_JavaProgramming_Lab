import Ex3.PersonList;
import Ex3.Professor;
import Ex3.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonListTest {

    @Test
    void displayAll() {
    }

    @Test
    void displayByRank() {
    }

    @Test
    void averageRank() {
        PersonList myPersonlist = new PersonList();
        myPersonlist.personList[0] = new Student("ABC","Ngoc",1,"IT",5);
        myPersonlist.personList[0] = new Professor("BCA","Phuc",5,"IDK");
        assertEquals(3, myPersonlist.averageRank());

    }

    @Test
    void maxRank() {
        assertTrue(1+2 == 4);
    }

    @Test
    void removePerson() {
    }
}