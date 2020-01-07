package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AngleTest {

    @BeforeEach
    public void setUp() throws Exception {}

    @Test
    public void angle_same_as_degrees() {
        Angle a = new Angle(10);
        assertEquals(10,a.getDegrees(),"They are not equal");
    }

    @Test
    public void is_angle_added_if_negative() {
        Angle a = new Angle(-10);
        assertEquals(350,a.getDegrees(),"Negative degrees not being added");
    }

    @Test
    public void is_large_angle_added_if_negative() {
        Angle a = new Angle(-370);
        assertEquals(350,a.getDegrees(),"Large negative degrees not being added");
    }

    @Test
    public void angle_greater_than_360_added() {
        Angle a = new Angle(450);
        assertEquals(90,a.getDegrees(),"Difference not being found between 360 and large stipulated angle");
    }

    @Test
    public void angle_much_greater_than_360_added() {
        Angle a = new Angle(780);
        assertEquals(60,a.getDegrees(),"Angle not correct");
    }

    @Test
    public void angle_0_added() {
        Angle a = new Angle(0);
        assertEquals(0,a.getDegrees(),"Angle not set to 0");
    }

    @Test
    public void angle_360_added() {
        Angle a = new Angle(-360);
        assertEquals(0,a.getDegrees(),"Angle not set to 360");
    }

}