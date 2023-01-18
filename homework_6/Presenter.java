
//класс запуска калькулятора
public class Presenter {
    public static void main(String[] args){
        view.ParseLine v = new view.ParseLine();
        Model calculator = new Model(v.getA(), v.getOperation(), v.getB());
        view.Result.result(calculator.getInstance().getResult());
        LoggerCalc.myLog(view.ResultStrLog.myLog(v.getA(), v.getOperation(), v.getB(), calculator.getInstance().getResult()));
    }
}
