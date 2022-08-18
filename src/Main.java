import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {

        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        System.out.println("ФИО сотрудника - " + firstName + " " + middleName + " " + lastName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        while (fullName.contains("ё")) {
            fullName = fullName.substring(0, fullName.indexOf("ё")) + "e" + fullName.substring(fullName.indexOf("ё") + 1, fullName.length());
        }

        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
