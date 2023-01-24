import view.parse_line
import view.result
import model

"""запуск калькулятора"""
list_ex = []
list_ex = view.parse_line.parse_line()

res = model.get_instance(view.parse_line.get_operation(list_ex), 
                            view.parse_line.get_a(list_ex), view.parse_line.get_b(list_ex))

print(f"{view.parse_line.get_a(list_ex)} {view.parse_line.get_operation(list_ex)} "
        + f"{view.parse_line.get_b(list_ex)} = {view.result.result(res)}")

