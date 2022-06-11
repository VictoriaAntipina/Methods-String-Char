package hw8;

import homework.HW5ReturnMethods;

import java.util.Arrays;

import static hw8.Utils.*;

public class HW8 {

    //Task 7
    //Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел

    public static String printTask7(int a, int b, int c, int d, int e) {

        int[] array7 = {a, b, c, d, e};

        return Arrays.toString(array7);
    }
    // или такой вариант

    public static int[] printTask7_a(int a, int b, int c, int d, int e) {

        //int[] array7_a = {a, b, c, d, e};

        return new int[]{a, b, c, d, e};
    }


    //Task 8
    //Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел

    public static String printTask8(double a, double b, double c, double d, double e) {

        double[] array8 = {a, b, c, d, e};

        return Arrays.toString(array8);
    }

    //Task 9
    //Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов

    public static String printTask9(String a, String b, String c, String d, String e) {

        String[] array9 = {a, b, c, d, e};

        return Arrays.toString(array9);
    }

    //Task 10
    //Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел,
    // умноженных на 2.5

    public static double[] printTask10(int[] massive) { //

        if (massive.length > 0) { // делаем проверку, чтоб масив не был пустым

            double[] result = new double[massive.length]; // создаем пустой масив
            for (int i = 0; i < massive.length; i++) { // i это индекс в масиве
                result[i] = (massive[i] * 2.5);
            }
            return result;
        }

        return new double[]{}; // возвращаем пустой масив, если не прошла проверка выше
    }

    //Task 11
    //Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает количество четных чисел в этом массиве

    public static int printTask11(int[] array) {

        int count = 0; //счетчик, чтоб считать четные числа

        for (int i = 0; i < array.length; i++) { // i это индекс
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Task 12
    //Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает массив нечетных чисел

    public static int[] printTask12(int[] A) {

        int jj = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                jj++; // все нечетные значения складываются в jj и таким образом jj считает длину масива нечетных ч.
            }
        }

        int[] B = new int[jj];
        int j = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                B[j] = A[i];
                j++; // складываем нечетные значения с первого масива
            }
        }
        return B;
    }

    //Task 13
    //Написать метод, который принимает на вход массив целых чисел,  и возвращает массив значений true или false,
    // если числа больше 10

    public static String printTask13(int[] array){
        boolean[] array1 = new boolean[array.length];

        for (int i = 0; i < array.length; i++){
            if (array[i] > 10){
                array1[i] = true;
            }else {
                array1[i] = false;
            }
        }
        return Arrays.toString(array1);

    }

    //Task 14
    //Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов

    public static String printTask14(String[] array){

        String sentence = " ";
        for (int i = 0; i < array.length; i++){
            sentence = sentence + array[i] + " ";
        }


        return sentence;
    }

    //Task 15
    //Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива

    public static int printTask15(int[] array){

        int sum = 0;
        if (array.length > 0){
            for (int i = array.length/2; i < array.length; i++){
                sum = sum + array[i]; //счетчик плюсует значения
            }
        } else {
            System.out.println("Empty array");
        }


        return sum;
    }

    //Task 16
    //Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно,
    // и возвращает таблицу умножения на это число в виде массива
    //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

    public static int[] printTask16(int num){

        if (num <= 0 || num >= 10){
            return new int[]{};
        }else{
            int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
            for (int i = 0; i < array.length; i++){
                array[i] = array[i] * num;
            }

            return array;
        }
    }

    ////Task 17
    //Написать метод, который принимает массив целых чисел и возвращает массив четных чисел, если четных чисел больше,
    // или массив нечетных чисел, если нечетных чисел больше.









    public static void main(String[] args) {

        HW5ReturnMethods.Myprint(); // импортируем с любого класса
        // или
        Utils.Myprint(1);
        line(); // чтоб не писать Utils.line мы импортируем этот метод с класса Utils и пишем просто название метода line

        printTask(5);
        //Task 5

        Integer valueInt = 5;
        Double valueDobl = 5.5;
        String valueStr = "Hello";

        printTask(6);
        //Task 6
        //Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и
        // распечатать результат сравнения в виде таблички:

        System.out.println(valueInt.equals(HW8_1.intValue));
        //или
        System.out.println(valueInt == HW8_1.intValue);
        line();

        System.out.println(valueDobl.equals(HW8_1.dbleValue));
        line();

        System.out.println(valueStr.equals(HW8_1.strValue));
        lineLong();

        System.out.println("HW8                 | HW8_1              | areEquals?");
        lineLong();
        System.out.println("Integer valueInt = " + valueInt + "| Integer intValue = " + HW8_1.intValue + "|"
                + ANSI_GREEN + valueInt.equals(HW8_1.intValue) + ANSI_RESET);
        lineLong();
        System.out.println("Double valueDobl = " + valueDobl + "| Double dbleValue =" + HW8_1.dbleValue + "|"
                + ANSI_GREEN + valueDobl.equals(HW8_1.dbleValue) + ANSI_RESET);
        lineLong();
        System.out.println("String valueStr = " + valueStr + "| String strValue =" + HW8_1.dbleValue + "|"
                + ANSI_GREEN + valueStr.equals(HW8_1.strValue) + ANSI_RESET);
        lineLong();

        printTask(7);
        //Task 7
        //Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
        System.out.println(printTask7(0, 1, 2, 3, 4));
        line();
        System.out.println(Arrays.toString(printTask7_a(0,1,2,3,4)));

        printTask(8);
        //Task 8
        //Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
        System.out.println(printTask8(1.1, 1.2, 1.3, 1.4, 1.5));

        printTask(9);
        //Task 9
        //Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        System.out.println(printTask9("синий", "зеленый", "красный", "голубой", "желтый"));

        printTask(10);
        //Task 10
        //Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел,
        // умноженных на 2.5

        System.out.println(Arrays.toString(printTask10(new int[]{1, 2, 3})));

        printTask(11);
        //Task 11
        //Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает количество четных чисел в этом массиве

        System.out.println(printTask11(new int[]{4, 8, 1})); // количество чисел

        printTask(12);
        //Task 12
        //Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает массив нечетных чисел

        System.out.println(Arrays.toString(printTask12(new int[]{-1, 10, -3, -7})));

        printTask(13);
        //Task 13
        //Написать метод, который принимает на вход массив целых чисел,  и возвращает массив значений true или false,
        // если числа больше 10

        System.out.println(printTask13(new int[]{1,14,20,30}));

        printTask(14);
        //Task 14
        //Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов

        System.out.println(printTask14(new String[]{"Hello", "world", "be happy"}));

        printTask(15);
        //Task 15
        //Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива

        System.out.println(printTask15(new int[]{1,2,3,4,5}));

        printTask(16);
        //Task 16
        //Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно,
        // и возвращает таблицу умножения на это число в виде массива
        //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

        System.out.println(Arrays.toString(printTask16(2)));

        printTask(17);
        ////Task 17
        //Написать метод, который принимает массив целых чисел и возвращает массив четных чисел, если четных чисел больше,
        // или массив нечетных чисел, если нечетных чисел больше.

        //ДАЛЬШЕ НЕ ДЕЛАЛА








    }
}
