public class TriangleClassify {
    public static String classifyTriangle(int a,int b, int c){
        boolean isTriangle = (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a);
        boolean isCanTriangle = (a == b || b == c || c == a);
        boolean isDeuTriangle = (a == b && b == c);
        boolean isSquareTriangle = (a * a + b * b ==c * c )|| (b * b + c * c ==a * a) || (a * a + c * c == b* b);
        boolean isSquareCanTriangle = isSquareTriangle && isCanTriangle;

        if (isTriangle){
            if (isCanTriangle){
                return "Là tam giác Cân: ";
            }else {
                if (isDeuTriangle){
                    return "Là tam giác Đều: ";
                }else if (isSquareTriangle){
                    return "Là tam giác vuông: ";
                }else if (isSquareCanTriangle){
                    return "Là tam giác Vuông Cân: ";
                }else {
                    return "Tam giác Thường: ";
                }
            }
        }else {
            return "Not a Triangle";
        }
    }
}
