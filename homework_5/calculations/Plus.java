package calculations;

public class Plus implements ICalculator {
    private double a;
    private double b;
  
    public Plus(double a, double b) {
       this.a = a;
       this.b = b;
    }
  
    @Override
    public double getResult() {
       return a + b;
    }
}
