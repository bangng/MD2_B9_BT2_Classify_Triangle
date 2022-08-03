import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifyTest {
    @Test
    void testTriangle222(){
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Là tam giác Đều";
        String actual = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, actual);
    }


}