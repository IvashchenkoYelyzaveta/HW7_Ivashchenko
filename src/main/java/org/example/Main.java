package org.example;

@FunctionalInterface
interface Pow {
    int pow(int number, int pow);
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// Создать массив типа Student, содержащий объекты класса Student и
//Aspirant. Вызвать метод getScholarship() для каждого элемента массива.

        Student[] array = {
                new Student("Ivan", "Ivanov", "A", 4.5),
                new Student("Ivanna", "Ivanova", "A", 5.0),
                new Aspirant("Petr", "Petrov", "B", 5.0, "некая научная работа 1"),
                new Aspirant("Petra", "Petrova", "B", 4.5, "некая научная работа 2")
        };

        for (int i=0; i < array.length; i++ ) {

            System.out.println("Стипендия: " + array[i].getScholarship());

        }

        Pow power = (number, pow) -> {
            if (pow == 0) {
                return 1;
            }

            int result = 1;

            for (int i = 1; i <= pow; i++) {
                result = result * number;
            }

            return result;
        };

        System.out.println(power.pow(2, 2));

    }
}