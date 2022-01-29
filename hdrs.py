import numpy as np

def onestep(x):
    if x > 23:
        return "депрессивное расстройство крайне тяжёлой степени"
    if x > 19:
        return "депрессивное расстройство тяжелой степени"
    if x > 14:
        return "депрессивное расстройство средней степени тяжести"
    if x > 8:
        return "лёгкое депрессивное расстройство"
    return "норма"

class HDRS:
    def __init__(self, w):
        self.w = w

    def summator(self, x):
        s = np.dot(self.w, x)
        return onestep(s)

# Задание значений входам
X_i = np.array([1,  # 1  Депрессивное настроение
                1,  # 2  Чувство вины (Самоупреки, чувствует, что подвел людей)
                0,  # 3  Самоубийство
                0,  # 4  Бессонница, начальная
                0,  # 5  Бессонница, средняя
                0,  # 6  Бессонница, поздняя
                0,  # 7  Работа и потеря интереса
                0,  # 8  Задержка развития
                0,  # 9  Возбуждение
                1,  # 10 Тревожность, психосоматическая
                1,  # 11 Тревожность, соматическая
                0,  # 12 Соматические симптомы, желудочно-кишечные
                0,  # 13 Соматические симптомы, общие
                0,  # 14 Генитальные симптомы
                0,  # 15 Ипохондрия
                0,  # 16 Потеря веса
                0   # 17 Понимание
                ])

# Веса входных признаков
W_i = np.array([1,  # 1  Депрессивное настроение
                1,  # 2  Чувство вины (Самоупреки, чувствует, что подвел людей)
                1,  # 3  Самоубийство
                1,  # 4  Бессонница, начальная
                1,  # 5  Бессонница, средняя
                1,  # 6  Бессонница, поздняя
                1,  # 7  Работа и потеря интереса
                1,  # 8  Задержка развития
                1,  # 9  Возбуждение
                1,  # 10 Тревожность, психосоматическая
                1,  # 11 Тревожность, соматическая
                1,  # 12 Соматические симптомы, желудочно-кишечные
                1,  # 13 Соматические симптомы, общие
                1,  # 14 Генитальные симптомы
                1,  # 15 Ипохондрия
                1,  # 16 Потеря веса
                1   # 17 Понимание
                ])
hdrs = HDRS(W_i)
print('Диагноз:', hdrs.summator(X_i))