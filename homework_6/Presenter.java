public class Presenter {
    public static void main(String[] args){
        View v = new View();
        Model calculator = new Model(v.getA(), v.getOperation(), v.getB());
        View.result(calculator.getInstance().getResult());
        LoggerCalc.myLog(View.myLog(v.getA(), v.getOperation(), v.getB(), calculator.getInstance().getResult()));
    }
}
