package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AngleTest {

    @BeforeEach
    public void setUp() throws Exception {}

    @Test
    public void test() {
        Angle a = new Angle(10);
        assertEquals(10,a.getDegrees(),"They are not equal");
    }

}