package calculations;

//класс для нахождения частного двух чисел
public class Division implements I__Calculator{
    private double a;
    private double b;

    public Division(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResult(){
        return a / b;
    }
}
