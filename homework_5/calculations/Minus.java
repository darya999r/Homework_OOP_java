package calculations;

public class Minus implements ICalculator {
    private double a;
    private double b;

    public Minus(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResult(){
        return a - b;
    }
}
