package homework;

import java.util.Arrays;

public class HW7 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    static int qq = 1;


    public static void Myprint() {

        System.out.println(ANSI_PURPLE + "____________");
        System.out.println(ANSI_PURPLE + "Task " + qq);
        System.out.println(ANSI_PURPLE + "____________");
        qq++;
        System.out.println(ANSI_RESET);

    }

    public static void verifyEquals(int expectedResult, int actualResult) {

        if (expectedResult == actualResult) {
            System.out.println(ANSI_GREEN + "True" + ANSI_RESET);

        } else {
            System.out.println(ANSI_RED + "False" + ANSI_RESET);
        }

    }

    //Task18
    //Написать метод, который принимает на вход массив int, и возвращает среднее значение.
    // Проверить работу метода тестом, если параметр - массив catsAges

    public static int Task18(int[] array1){

        int average = 0; //счетчик
        for (int i = 0; i < array1.length; i++){
            average = average + array1[i]; // значения масива плюсуются
        }
        return average / array1.length;
    }





    public static void main(String[] args) {

        Myprint();
        //Task1
        //Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).

        String[] catsNames = new String[8];
        catsNames[0] = "Мурчик "; //2,
        catsNames[1] = "Быстрый "; //3
        catsNames[2] = "Мурзик "; //5
        catsNames[3] = "Ванька "; //1
        catsNames[4] = "Бурчун "; //4
        catsNames[5] = "Шустрый "; //3
        catsNames[6] = "Модик "; //8
        catsNames[7] = "Васька "; //6
        System.out.println(catsNames[7]);

        //или
        String[] catNames1 = new String[]{"Мурчик", "Черныш", "Мурзик", "Ванька", "Рыжик"};
        System.out.println(catNames1[0]);

        //или
        String[] catNames2 = {"Мурчик", "Черныш", "Мурзик"};
        System.out.println(catNames2[2]);

        Myprint();
        //Task2
        //В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
        // а значение элемента с индексом 1 на “Черныш”.

        catsNames[1] = "Черныш ";
        catsNames[4] = "Рыжик ";

        for (int i = 0; i < 8; i++){
            System.out.println(catsNames[i]);
        }

        Myprint();
        //Task3
        //Создать массив catsColors и заполнить его значениями.
        String[] catsColors = new String[8];
        catsColors[0] = "Серый ";
        catsColors[1] = "Черный ";
        catsColors[2] = "Светло серый  ";
        catsColors[3] = "Коричневый ";
        catsColors[4] = "Рыжий ";
        catsColors[5] = "Серый ";
        catsColors[6] = "Рыжий ";
        catsColors[7] = "Серый ";
        System.out.println(catsColors[7]);

        //или
        String[] catsColors1 = {"Серый ", "Черный ", "Светло серый ", "Коричневый ", "Рыжий ", "Серый ",
                "Рыжий ", "Серый "};
        System.out.println(catsColors1[3]);

        Myprint();
        //Task4
        //Создать массив catsAges и заполнить его любыми значениями.

        int[] catsAges = new int[]{2, 3, 5, 1, 4, 3, 8, 6};
        System.out.println(catsAges[0]);

        //или также есть класс Array который переводит масив в String

        int[] catsAges1 = new int[]{2, 3, 5, 1, 4, 3, 8, 6};
        System.out.println(Arrays.toString(catsAges1));

        Myprint();
        //Task5
        //Создать массив isCatRed и заполнить его соответствующими значениями
        String[] isCatRed1 = new String[]{null, null, null, null, "Рыжий", null, "Рыжий", null};
        System.out.println(isCatRed1[4]);

        //или
        String[] isCatRed2 = new String[8];
        isCatRed1[4] = "Рыжий";
        isCatRed1[6] = "Рыжий";
        System.out.println(isCatRed2[0]);

        System.out.println("______________________________");
        //правильное решение
        boolean[] isCatRed = new boolean[]{false, false, false, false, true, false, true, false};


        Myprint();
        //Task6
        //Распечатать для массивов catsNames и catsColors:

        //имя кота в коробке с номером 6
        System.out.println(catsNames[6]);
        //......................................

        //имена котов из коробок с четными индексами
        for (int i = 0; i < 8; i += 2) {
            System.out.print(catsNames[i]);
        }
        System.out.print("\n");
        //......................................

        //имена котов из коробок, чьи индексы кратны 4
        for (int i = 0; i < 8; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " - " + catsNames[i]);
            }
        }
        System.out.println();
        //......................................

        //цвет котов из коробок с нечетными индексами
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                System.out.print(catsColors[i]);
            }
        }
        System.out.println();
        //......................................

        //цвет котов из коробок, чьи индексы кратны 3
        for (int i = 0; i < 8; i++) {
            if (i % 3 == 0) {
                System.out.print(catsColors[i]);
            }
        }
        System.out.println("\n");

        Myprint();
        //Task7
        // Распечатать “Накорми кота!” для всех серых котов
        for (int i = 0; i < 8; i++) {
            if (catsColors[i] == "Серый ") {
                System.out.println("Накорми кота");
            } else {
                System.out.println("Это не серый кот");
            }
        }

        Myprint();
        //Task8
        //Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for (int i = 0; i < 8; i++) {
            if (catsAges[i] < 0 || catsAges[i] > 50) {
                System.out.println("Eror");
            } else if (catsAges[i] < 2) {
                System.out.println("Отнеси кота на прививку!");
            } else {
                System.out.println("Кот останется дома");
            }
        }

        Myprint();
        //Task9
        //Для кота в последней коробке распечатать имя, цвет, возраст

        if (catsNames[7] == "Васька ") {
            System.out.println(catsNames[7] + " " + catsColors[7] + " " + catsAges[7] + " лет");
        } else {
            System.out.println("Eror");
        }
        //или
        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames.length == catsColors.length && catsNames.length == catsAges.length) {
                if (i == catsNames.length - 1) {
                    System.out.println(catsNames[i] + " " + catsColors[i] + " " + catsAges[i] + " лет");
                }
            }
        }
        //или
        if (catsNames.length != 0 || catsColors.length != 0 || catsAges.length != 0) {
            if (catsNames.length - 1 == catsColors.length - 1 && catsNames.length - 1 == catsAges.length - 1) {
                System.out.println(catsNames[catsNames.length - 1] + " " + catsColors[catsColors.length - 1] +
                        " " + catsAges[catsAges.length - 1]);
            }
        }

        Myprint();
        //Task10
        //Распечатать имена всех котов, чей возраст больше 2 лет
        for (int i = 0; i < 8; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i]);
            } else {
                System.out.println("Возраст кота меньше 2 лет");
            }
        }

        //или лучше еще проверить на 0 и совпадают ли масивы по длине
        System.out.println("____________________________\n");

        if (catsAges.length == catsNames.length) {
            for (int i = 0; i < 8; i++) {
                if (catsAges[i] < 0) {
                    System.out.println("Такого возраста нет");
                } else if (catsAges[i] > 2) {
                    System.out.println(catsNames[i]);
                } else if (catsAges[i] < 2 && catsAges[i] > 0) {
                    System.out.println("Возраст кота меньше 2 лет");
                } else {
                    System.out.println("Коту ровно 2 года ");
                }
            }
        }

        Myprint();
        //Task11
        //Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        if (catsNames.length == isCatRed.length && catsNames.length != 0){
            for (int i = 0; i < 8; i++) {
                if (catsNames[i] == "Рыжик ") {
                    if (isCatRed[i] == true) {
                        System.out.println("Накорми кота!");
                    }
                }
            }
        }

        Myprint();
        //Task12
        //Распечатать средний возраст котов из массива catsAges

        int sum = 0;
        for (int i = 0; i < catsAges.length; i++){
            sum = sum + catsAges[i];
            System.out.println(sum);
        }
        System.out.println(sum/catsAges.length);

        Myprint();
        //Task13
        //Распечатать возраст самого молодого кота
        int min = catsAges[0];
        for (int i = 0; i < catsAges.length; i++){
            if (catsAges[i] < min){
                min = catsAges[i];
            }
        }
        System.out.println("Возраст самого молодого кота " + min);

        //или лучше взять макс возраст кота 50 лет ложим в min и начинать сравнение в цикле for
        int min1 = 50;
        for (int i = 0; i < catsAges.length; i++){
            if (catsAges[i] < min1){
                min1 = catsAges[i];
            }
        }
        System.out.println("Возраст самого молодого кота " + min1);

        Myprint();
        //Task14
        //Распечатать возраст самого старого кота

        int max = catsAges[0];
        for (int i = 0; i < catsAges.length; i++){
            if (catsAges[i] > max){
                max = catsAges[i];
            }
        }
        System.out.println("Возраст самого старого кота " + max);

        //или лучше
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++){
            if (catsAges[i] > max1){
                max1 = catsAges[i];
            }
        }
        System.out.println("Возраст самого старого кота " + max1);

        Myprint();
        //Task15
        //Распечатать количество серых котов

        for (int i = 0; i < catsColors.length; i++){
            if (catsColors[i] == "Серый "){
                System.out.println("В коробке " + i + " " + catsColors[i] + " кот");
            }
        }

        //или правильнее
        int greyCat = 0;
        for (int i = 0; i < catsColors.length; i++){
            if (catsColors[i] == "Серый "){
                greyCat++;
            }
        }
        System.out.println("количество серых котов " +  greyCat);

        Myprint();
        //Task16
        //Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
        if (catsNames.length == catsAges.length && catsNames.length != 0){
            for (int i = 0; i < catsNames.length; i++){
                if (i % 2 == 0){
                    if (catsAges[i] <= 3){
                        System.out.println(catsNames[i]);
                    }
                }
            }
        }

        Myprint();
        //Task17
        //Создать массив четных положительных чисел, значения которых не больше 10.
        // (заполняем значения с помощью цикла for)

        int count = 0; //счетчик считает длину масива
        for (int i = 0; i <= 10; i++){ // value
            if (i % 2 == 0){
                count = count + 1;
            }
        }
        int[] array = new int[count];

        int num = 0; //счетчик считает значения, которые мы положим в arrey[i]
        for (int i = 0; i < array.length; i++){
                array[i] = num;
                num +=2;
        }
        System.out.println(Arrays.toString(array));

        Myprint();
        //Task18
        //Написать метод, который принимает на вход массив int, и возвращает среднее значение.
        // Проверить работу метода тестом, если параметр - массив catsAges

        System.out.println(Task18(catsAges));
        verifyEquals(4,Task18(catsAges));

        Myprint();
        //Task19
        //Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900

        int count1 = 0;
        for (int i = -1000; i < -900; i++){
            if (i % 2 != 0){
                count1 = count1 + 1; // считаем длину масива в диапазоне от -1000 до -900 = 50
            }
        }
        int[] array19 = new int[count1];

        int index = 0;
        for (int i = -1000; i < -900; i++){
            if (i % 2 != 0){
                if (index < array19.length){
                    array19[index] = i;
                    System.out.println(array19[index] + " ");
                    index++;
                }
            }
        }

        Myprint();
        //Task20
        //Создать массив из 10 случайных положительных целых чисел
        int[] array20 = new int[10];
        for (int i = 0; i < array20.length; i++){ // i это индекс в масиве
                array20[i] = ((int) (Math.random() * 10));
            System.out.print(array20[i] + " ");
            }

        //3 часть не выполняла

    }

}