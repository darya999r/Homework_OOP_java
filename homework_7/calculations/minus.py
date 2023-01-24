from calculations.I__calculator import Calculations

"""наследуем класс Minus от базового Calculations"""
class Minus(Calculations):
    def __init__(self, a, b):
        self.a = a
        self.b = b
    
    """переопределяем абстрактый метод"""
    def get_result(self):
        return self.a - self.b