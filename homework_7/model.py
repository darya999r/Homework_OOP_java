from calculations.plus import Plus
from calculations.minus import Minus
from calculations.division import Division
from calculations.multiplication import Multiplication

"""модуль для рассчетов и возвращения результата
при введении отличного от (+, -, *, /) оператора, 
выдает ошибку и выводит сообщение в терминал"""
def get_instance(operation, a, b):
    match operation:
        case "+":
            return Plus.get_result(Plus(a, b))
        case "-":
            return Minus.get_result(Minus(a, b))
        case "*":
            return Multiplication.get_result(Multiplication(a, b))
        case "/":
            return Division.get_result(Division(a, b))
        case _:
            return print("Error operation!")