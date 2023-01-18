package view;
import java.util.*;

//класс для парсинга введенного пользователем в терминале примера вычислений типа "23.8 + 85.7"
//используемые операторы +, -, *, /
//пробелы между числом и оператором обязательны!
public class ParseLine {
    private String line;
    private String[] parseLine;

    //считывание строки
    public ParseLine() {
        System.out.println("Enter number1, operation (+, -, *, /), number2 with a space: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()) {
            line = in.nextLine();
            parseLine = line.split(" ");
        }
        in.close();
    }

    //первое число
    public double getA() {
        return Double.valueOf(parseLine[0]);
    }

    //второе число
    public double getB() {
        return Double.valueOf(parseLine[2]);
    }

    //оператор
    public String getOperation() {
        return parseLine[1];
    }

}


