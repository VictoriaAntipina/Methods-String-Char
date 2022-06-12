package homework;

import hw8.Utils;

public class HW10 {

    /** Подсказки
    trim - удалить все пробелы
    charAt - сравнить, что данная буква == конкретной букве
    isEmpty - проверить, что сторока пришла пустая (непустая)
    replace - заменить букву на другую

     */

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

    //Task2

    //Написать алгоритм RemoveAlla.
    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
    // то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.

    //Test Data:
    // “    QA4Everyone   “ →  “QA4Everyone“
    //“panda   “ → “pnd”

    public static String RemoveAlla(String stroka){

        if (stroka != null && stroka.isEmpty() == false){
            stroka = stroka.trim();
            stroka = stroka.replace("a", "");

            return stroka;

        }

        return "Строка пустая";
    }

    //Task3

    //Написать алгоритм RemoveAllZeros.
    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
    // Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    // Метод возвращает обработанную строку, в которой нет нулей.

    //Test Data:
    // “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
    //“ 0000000111“ → “111”

    public static String RemoveAllZeros(String strokaOfDigits){

        if (strokaOfDigits != null && strokaOfDigits.isEmpty() == false){
            strokaOfDigits = strokaOfDigits.trim();
            strokaOfDigits = strokaOfDigits.replace(" ", "");
            strokaOfDigits = strokaOfDigits.replace("0", "");


            return strokaOfDigits;
        }

        return "Empty sentense";

    }


    public static void main(String[] args) {

        Utils.Myprint(1);

        System.out.println(str("QA4Everyone"));
        System.out.println(str("   QA4Everyone   "));
        System.out.println(str("  "));
        System.out.println(str(null));

        Utils.Myprint(2);

        System.out.println(RemoveAlla("   QA4Everyone   "));
        System.out.println(RemoveAlla("panda   "));


        Utils.Myprint(3);
        System.out.println(RemoveAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(RemoveAllZeros( "0000000111"));


        Utils.Myprint(4);





    }
}





