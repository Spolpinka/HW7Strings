import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {task4(); task5(); task6(); task7();} {
    }

    public static void task4 (){
        String baseData = "Ivanov Ivan Ivanovich";

        String fullName = baseData;
        String firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
        String middleName = fullName.substring(fullName.lastIndexOf(" "));
        String lastName = fullName.substring(0, fullName.indexOf(" "));

        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    public static void task5() {
        String correctFullName = "";
        String fullName = "ivanov ivan ivanovich";
        // перебираем всю строку и формируем новую с заглавными буквами после " "
        for (int i = 0; i < fullName.length(); i++) {
            String s = fullName.substring(i, i+1);
            if (i == 0 || fullName.substring(i-1, i).equals(" ")){
                s = s.toUpperCase();
            }
            correctFullName += s;
        }

        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + correctFullName);
    }

    public static void task6(){
        String s1 = "135";
        String s2 = "246";
        //переводим в StringBuilder
        StringBuilder result = new StringBuilder(s1);
        int b = 0;//счетчик для позиции символа первой строки
        for (int i = 0; i < s2.length(); i++) {
            result.insert(b+1, s2.charAt(i));
            b += 2;
        }

        System.out.println("Данные строки — " + result);
    }

    public static void task7(){
        String baseString = "aabccddefgghiijjkk";
        String result = "";
        for (int i = 0; i < baseString.length()-1; i++) {
            if (Objects.equals(baseString.charAt(i), baseString.charAt(i + 1))){
                result += baseString.charAt(i);
            }
        }
        System.out.println(result);
    }
}
