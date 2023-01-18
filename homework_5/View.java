import java.util.*;

public class View {
    private String line;
    private String[] parseLine;

    public View() {
        System.out.println("Enter number1, operation (+, -, *, /), number2 with a space: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            line = in.nextLine();
            parseLine = line.split(" ");
        }
        in.close();
    }

    public double getA() {
        return Double.valueOf(parseLine[0]);
    }

    public double getB() {
        return Double.valueOf(parseLine[2]);
    }

    public String getOperation() {
        return parseLine[1];
    }

    public static void result(Object result) {
        System.out.println("Result: " + result);
    }

    public static String myLog(double a, String operation, double b, Object result){
        String res1 = String.valueOf(a);
        String res2 = String.valueOf(operation);
        String res3 = String.valueOf(b);
        String res4 = String.valueOf(result);
        String res = res1 + " " + res2 + " " + res3 + " = " + res4;
        return res;
    }
}


