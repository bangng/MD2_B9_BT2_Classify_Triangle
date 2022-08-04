public class TriangleClassify {
    public static String classifyTriangle(int a,int b, int c){
        boolean isTriangle = (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a);
        boolean isIsoscelesTriangle = (a == b || b == c || c == a);
        boolean isEquilateralTriangle = (a == b && b == c);
        boolean isSquareTriangle = (a * a + b * b ==c * c )|| (b * b + c * c ==a * a) || (a * a + c * c == b* b);
        boolean isSquareIsoscelesTriangle = isSquareTriangle && isIsoscelesTriangle;

        if (isTriangle){
            if (isEquilateralTriangle){
                return "Là tam giác đều";
            }else {
                if (isIsoscelesTriangle){
                    return "Là tam giác cân";
                }else if (isSquareTriangle){
                    return "Là tam giác vuông";
                }else if (isSquareIsoscelesTriangle){
                    return "Là tam giác vuông cân";
                }else {
                    return "Là tam giác thường";
                }
            }
        }else {
            return "Not a Triangle";
        }
    }
}
