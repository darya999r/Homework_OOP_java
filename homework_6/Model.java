
//класс для рассчетов и возвращения результата
//при введении отличного от (+, -, *, /) оператора, 
//выдает ошибку и выводит сообщение в терминал
public class Model {
    private String operation;
    private double a;
    private double b;

    public Model(double a, String operation, double b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    public calculations.I__Calculator getInstance() {
        switch (operation) {
            case "+":
                return new calculations.Plus(a, b);
            case "-":
                return new calculations.Minus(a, b);
            case "*":
                return new calculations.Multiplication(a, b);
            case "/":
                return new calculations.Division(a, b);  
            default: System.out.printf("Error! Enter correct operator!\n");
                return null;
        }
    }

}
