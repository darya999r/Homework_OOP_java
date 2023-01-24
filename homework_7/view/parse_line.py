"""класс для парсинга введенного пользователем в терминале примера вычислений типа "23.8 + 85.7"
используемые операторы +, -, *, /
пробелы между числом и оператором обязательны!"""

def parse_line():
    example = input("Enter calculation example: ")
    list_ex = list(example.split(' '))
    return list_ex

def get_a(list_ex):
    a = float(list_ex[0])
    return a

def get_b(list_ex):
    b = float(list_ex[2])
    return b

def get_operation(list_ex):
    return list_ex[1]
