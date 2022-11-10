# Radio
# Обучение в Нетологии.

# Создание приложения "Радио" с требованиями:
## Требования к работе с радиостанциями:

## Branch flexible

1. Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
2. Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций, указанных при создании (см. п.1)
3. Если текущая радиостанция - максимальная, и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
4. Если текущая радиостанция - 0, и клиент нажал на кнопку prev (предыдущая) на пульте, то текущей должна стать максимальная
5. Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - количество станций)

## Требования к работе с уровнем громкости звука:

1. Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука (в пределах от 0 до 100)
2. Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить
3. Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить

## Branch lombok

Внедрение Java-библиотеки Lombok в data-class'ы


### Для запуска проекта:

* Склонировать проект из репозитория командой
* git clone https://github.com/DariaSuntcova/Radio.git
* Открыть склонированный проект в Intellij IDEA
* Запустить команду mvn test
