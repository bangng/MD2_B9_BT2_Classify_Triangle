import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifyTest {
    @Test
    void testTriangle222(){
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Là tam giác đều";
        String actual = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void testTriangle22(){
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Là tam giác cân";
        String actual = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void testTriangle345(){
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Là tam giác vuông";
        String actual = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void testTriangle823(){
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Not a Triangle";
        String actual = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void testTriangle_121(){
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Not a Triangle";
        String actual = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void testTriangle011(){
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Not a Triangle";
        String actual = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void testTriangle456(){
        int a = 4;
        int b = 5;
        int c = 6;
        String expected = "Là tam giác thường";
        String actual = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, actual);
    }




}