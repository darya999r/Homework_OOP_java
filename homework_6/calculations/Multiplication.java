package calculations;

//класс для нахождения произведения двух чисел
public class Multiplication implements I__Calculator{
    private double a;
    private double b;

    public Multiplication(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResult(){
        return a * b;
    }
}
