public class UtilityMathClass
{
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Dist(int a, int b) {
        return a - b;
    }

    public static int Mult(int a, int b) {
        return a * b;
    }

    public static int Division(int a, int b) {
        return a / b;
    }

    public static int Pow(int num, int pow){
        if(pow < 0){
            num = Division(1, num);
        }
        else if(pow == 0){
            return 1;
        }
        else{
            for(int i = 1; i < pow; i++){
                num *= num;
            }
        }
        return num;
    }
}
