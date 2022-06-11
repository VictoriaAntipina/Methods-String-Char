package homework;

import hw8.Utils;

public class HW10 {

    //Task1

    // Написать метод, который принимает на вход строку.
    //Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки
    // и в конце строки.
    //Догадаться, каким методом из видео можно проверить, были ли пробелы.
    //Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
    //Если пробелов не было, вернуть сообщение “Пробелов не было”.
    //Если строка пустая, вернуть сообщение “Строка пустая”.

    //Test Data:
    //“    QA4Everyone   “ → “Лишние пробелы удалены”
    //“QA4Everyone“ → “Пробелов не было”
    //“” → “Строка пустая”

    public static String str (String sentence){

        if (sentence != null && sentence.isEmpty() == false && sentence.trim().length() > 0) {// что обрезанная от пробелов длина строки > 0
            if (sentence.trim().equals(sentence)){

                return "Пробелов не было";
            } else {

                return "Лишние пробелы удалены";
            }
        }

        return "Строка пустая";
    }

    public static void main(String[] args) {

        Utils.Myprint(1);

        System.out.println(str("QA4Everyone"));
        System.out.println(str("   QA4Everyone   "));
        System.out.println(str("  "));
        System.out.println(str(null));


    }
}





