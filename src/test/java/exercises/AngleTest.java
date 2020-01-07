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
        assertEquals(350,a.getDegrees(),"They are not equal");
    }

    @Test
    public void is_large_angle_added_if_negative() {
        Angle a = new Angle(-370);
        assertEquals(350,a.getDegrees(),"They are not equal");
    }

}