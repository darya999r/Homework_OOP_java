package view;

//перевод примера вычислений и результата в строку
public class ResultStrLog {
    public static String myLog(double a, String operation, double b, Object result){
        String res1 = String.valueOf(a);
        String res2 = String.valueOf(operation);
        String res3 = String.valueOf(b);
        String res4 = String.valueOf(result);
        String res = res1 + " " + res2 + " " + res3 + " = " + res4;
        return res;
    }
}
