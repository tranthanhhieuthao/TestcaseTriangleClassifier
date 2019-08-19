public class TriangleClassifier {
    public static String CheckTriangle(int a,int b,int c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && b + c > a && a + c > b){
                if (a == b && a ==c){
                    return "Tam giac deu";
                }
                else if (a == b || a == c || b==c){
                    return "Tam giac can";
                }
                else return "Tam giac thuong";
            }
        }
        return "Khong phai la tam giac";
    }
}
