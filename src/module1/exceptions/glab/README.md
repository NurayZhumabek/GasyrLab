Задача: Создайте метод, который запрашивает у пользователя ввод возраста и проверяет его корректность. Возраст должен быть положительным числом и не должен превышать 150 лет. Если введенные данные некорректны, метод должен выбросить исключение.



Детали реализации:



Создайте пользовательское исключение InvalidAgeException, которое будет выбрасываться, если возраст не соответствует заданным условиям.

Метод requestAge() должен запрашивать у пользователя его возраст, проверять его на соответствие условиям (возраст должен быть числом от 1 до 150) и возвращать этот возраст, если он корректен.

В случае, если введенные данные не являются числом или выходят за рамки заданных границ, метод должен выбросить InvalidAgeException.

В основной программе вызовите метод requestAge() и обработайте возможные исключения, выводя соответствующие сообщения пользователю.
