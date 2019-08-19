import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {


    @Test
    void checkTriangle1() {
        int a =2;
        int b=2;
        int c=2;
        String result = TriangleClassifier.CheckTriangle(a,b,c);
        assertEquals("Tam giac deu",result);
    }

    @Test
    void checkTriangle2() {
        int a =2;
        int b=2;
        int c=3;
        String result = TriangleClassifier.CheckTriangle(a,b,c);
        assertEquals("Tam giac can",result);
    }

    @Test
    void checkTriangle3() {
        int a =3;
        int b=4;
        int c=5;
        String result = TriangleClassifier.CheckTriangle(a,b,c);
        assertEquals("Tam giac thuong",result);
    }

    @Test
    void checkTriangle4() {
        int a =8;
        int b=2;
        int c=3;
        String result = TriangleClassifier.CheckTriangle(a,b,c);
        assertEquals("Khong phai la tam giac",result);
    }

    @Test
    void checkTriangle5() {
        int a =-1;
        int b=2;
        int c=1;
        String result = TriangleClassifier.CheckTriangle(a,b,c);
        assertEquals("Khong phai la tam giac",result);
    }

    @Test
    void checkTriangle6() {
        int a =0;
        int b=1;
        int c=1;
        String result = TriangleClassifier.CheckTriangle(a,b,c);
        assertEquals("Khong phai la tam giac",result);
    }
}