package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person fred1;
    private Person fred2;
    private Person bill;
    private Person jane;

    @BeforeEach
    public void setup() {
        fred1 = new Person("Fred","Foggs",29,"FF29");
        fred2 = new Person("Frederick","Foggs",29,"FF29");
        bill = new Person("Bill","Boggs",31,"BB31");
        jane = new Person("Jane","Joggs",29,"JJ29");
    }

    @Test
    public void are_persons_with_diff_name_but_same_niNumber_the_same_person() {
        assertTrue(fred1.equals(fred2));
        assertFalse(fred1.equals(bill), "fred1 is not bill");
        assertFalse(fred2.equals(bill),"fred2 is not bill");
        assertFalse(bill.equals(jane),"bill is not jane");
        assertFalse(fred1.equals(jane),"fred1 is not jane");
        assertFalse(fred2.equals(jane),"fred2 is not jane");
        
    }

    @Test
    public void does_the_list_contain_a_certain_person() {
        List<Person> people = new ArrayList<>();
        people.add(bill);
        people.add(fred1);
        people.add(fred2);
        people.add(jane);

        assertTrue(people.contains(fred2),"fred is in the list");
    }

}