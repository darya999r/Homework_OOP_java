package calculations;

//класс для нахождения разности двух чисел
public class Minus implements I__Calculator {
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
