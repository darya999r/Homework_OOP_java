package calculations;

//класс для нахождения суммы двух чисел
public class Plus implements I__Calculator {
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
