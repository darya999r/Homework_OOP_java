from abc import abstractmethod

"""абстрактый класс для нахождения результата вычислений"""
class Calculations():

    """абстрактный метод нахождения результата вычислений"""
    @abstractmethod
    def get_result(self):
        raise NotImplementedError("Нельзя вызывать абстрактный метод")