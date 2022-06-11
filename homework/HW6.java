package homework;

public class HW6 {

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
    //Task 10
    //Написать метод, который принимает на вход параметры start,  end, step,
    // и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
    // Точка выхода из цикла - число end.


    //just for increasing
    public static void printMethod(double start, double end, double step){ // 2.1, 10.0, 1.1

        for(start = start; start <  end; start +=  step){
            System.out.println(start);
        }
    }
    //или, чтоб покрыть все варианты 1 ex
    public static void printMethod2(double start, double end, double step){

        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(start); ////increasing start < end, step > 0 //1, 5, 1
            }
        }else if (start > end && step < 0){
                for (start = start; start > end; start += step){
                    System.out.println(start);//decreasing start > end, step < 0 // 10, 2, -1
                }
        }else{
            System.out.println("Invalid data");
        }
    }

    //или, чтоб покрыть все варианты 2 ex
    public static void printMethod3(double start, double end, double step){

        if (step > 0){
            if (start < end){
                for (double i = start; i < end; i += step){
                    System.out.println(i);
                }
            }else {
                System.out.println("Десятичных чисел, соответствующих даному условию не найдено ");
            }

        }else if (step == 0){
            System.out.println("Цыкл будет выполняться безконечно и печатать значение start" + start);
        }else if (start > end){
            for (double i = start; i > end; i += step){
                System.out.println(i);
            }
        }else{
            System.out.println("Десятичных чисел, соответствующих даному условию не найдено");
        }
    }

    //Task 11
    //Написать метод, который принимает параметр  и печатает  последовательность четных чисел от нуля.
    // Длина последовательности = l.

    public static void printL(int l){

        int end = 0;
        for(int i = 0; end < l ; i += 2){
            System.out.println(i);
            end++;
        }
    }

    //Task 12
    //Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
    public static void print12(int n){

        for(int i = 1; i <= n; i++){
            System.out.println(Math.pow(2.0, i));
        }
    }

    //Task 13
    //Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.

    public static String printTask13() {
        String result = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";

        // или можно эти 4 String в скобки внести rintTask13()

        for (int i = 0; i < 10; i++) {

            result = result + i;
            result2 = result2 + i + i;
            result3 = result3 + i + i + i;
            result4 = result4 + i + i + i + i;
        }
        return result + result2 + result3 + result4;

    }

    //Task 16 ???

    //Написать метод, который принимает параметры n, m, l, и печатает последовательность нечетных чисел
    // начиная с числа n, с шагом m, длина последовательности l.

    public static void printTask16(int n, int m, int l){

        if (n % 2 == 0 && m % 2 == 0){
            System.out.println("Четные числа");
        } else{
            while (l > 0){
                if ( n % 2 != 0){
                    System.out.println(n);
                    l--;
                }
                n = n + m;
            }
        }
    }

    /*
    // или
    public static void printTask16Ex2(int n, int m, int l) {

        for (int i = n; i <= l; i += m){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
*/ //не работает верно

    //Task 17
    //Сгенерируйте и распечатайте последовательность по формуле:
    //n + 1 = n + 2

    public static void printTask17(int n){

        int l = n + 5;
        for (; n < l; n++){
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }
    }

    //Task 18
    //Написать метод, который принимает параметры l, n, и печатает последовательность чисел, начиная с числа n,
    // по формуле для n + 1 члена последовательности:
    //n + 1 = 2n
    //Длина последовательности l.
    public static void print18(int n, int l){

        int index = n;
        System.out.println(index + " = " + n + "");
        while (l > 0){
            index = index + 1;
            n = 2 * index;
            System.out.println(index + " = " + n + "");
            l--;
        }
    }







    public static void main(String[] args) {

        Myprint();
        //Task 1
        //Распечатать последовательность чисел от 0 до 9 включительно.
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        Myprint();
        //Task 2
        //Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        for (int i = 9; i > -1; i--){
            System.out.println(i);
        }

        Myprint();
        //Task 3
        //Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        for(int i = 50; i < 56; i += 2){
            System.out.println(i);
        }

        Myprint();
        //Task 4
        //Распечатать последовательность чисел, кратных 7, в промежутке (327, 300) ИСКЛЮЧИТЕЛЬНО ( )
        for (int i = 326; i > 300; i-- ){                                   //326, 325,...301, 300
            if (i % 7 == 0){
                System.out.println(i);
            }
        }

        Myprint();
        //Task 5
        //Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1 [] ВКЛЮЧИТЕЛЬНО

        for (double i = 12; i < 13; i += 0.1){
            System.out.println(i);
        }

        Myprint();
        //Task 6
        //Распечатать последовательность четных чисел от 215 до 237 включительно
        for (int i = 215; i < 238; i ++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        Myprint();
        //Task 7
        //Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        for(int i = 8; i < 14; i++){
            if (i % 7 == 0){
                System.out.println(i);
            }
        }

        Myprint();
        //Task 8
        //Распечатать последовательность которая начинается с минимального значения типа данных short и
        // заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++){
           if (i % 15001 == 0){
               System.out.println(i);
           }
        }

        Myprint();
        //Task 9
        //Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
        // Числа, кратные 11, должны быть распечатаны синим цветом.
        // Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо распечатать словом ZERO.

        for(int i = -10; i < 35; i++){
            if (i == 0){
                System.out.println("Zero");
            }else if (i % 11 == 0){
               System.out.println(ANSI_BLUE + i + ANSI_RESET);
           }else if (i % 12 == 0) {
                System.out.println(ANSI_RED + i + ANSI_RESET);
           }
        }

        Myprint();
        //Task 10
        //Написать метод, который принимает на вход параметры start,  end, step,
        // и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
        // Точка выхода из цикла - число end.

        //1 metod
        printMethod(2.1, 10.0, 1.1);
        System.out.println("_____________________________");
        System.out.println("_____________________________");

        //2 metod
        printMethod2(10.5, 20.75, 1.29); //happy pass
        System.out.println("____________________________");

        printMethod2(10.0, 2.0, -1.0); //happy pass 10, 2, -1
        System.out.println("____________________________");

        printMethod2(15.9, 0, 0); //negative
        System.out.println("____________________________");

        printMethod2(15.9, 0, 1); //negative
        System.out.println("____________________________");

        printMethod2(-15.9, 0, -1); //negative

        //3 method
        System.out.println("_____________________________");
        System.out.println("_____________________________");
        printMethod3(2.0, 10.0, -1);

        Myprint();
        //Task 11
        //Написать метод, который принимает параметр  и печатает  последовательность четных чисел от нуля.
        // Длина последовательности = l.
        printL(5);

        Myprint();
        //Task 12
        //Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно

        print12(5);

        Myprint();
        //Task 13
        //Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.

        // 1 ex

        for (int i = 0; i < 10; i++){
            System.out.print(i);
        }
        for (int i = 11; i < 100; i += 11){
            if(i == 11){
                System.out.print("00");
            }else{
                System.out.print(i);
            }
        }
        for (int i = 111; i < 1000; i += 111){
            if (i == 111){
                System.out.print("000");
            }else{
                System.out.print(i);
            }
        }
        for (int i = 1111; i < 10000; i +=1111){
            if (i == 1111){
                System.out.print("0000");
            }else{
                System.out.print(i);
            }
        }
        System.out.println("\n");

        // или

        for (int i = 0; i < 10; i++){
            System.out.print("" + i);
        }
        for (int i = 0; i < 10; i++){
            System.out.print("" + i + i);
        }
        for (int i = 0; i < 10; i++){
            System.out.print("" + i + i + i);
        }
        for (int i = 0; i < 10; i++){
            System.out.print("" + i + i + i + i);
        }
        System.out.println("\n");

        //или 3 ex создаем метод

        System.out.println(printTask13());

        Myprint();
        //Task 14
        //Распечатайте последовательность чисел:
        //0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5

        System.out.print(0);
        for (int i = 1; i < 6; i++){
            System.out.print(", " + i + ", " + (i * -1));
        }
        System.out.println("\n");
        //или
        for (int i = 0; i < 6; i++){
            System.out.print(i + ", ");
            if (i > 0){
                System.out.print(i * -1 + ", ");
            }
        }
        System.out.println("\n");

        Myprint();
        //Task 15
        //Распечатать последовательность чисел:
        //0, 3, 5, 6,/ 9, 10, 12, 15,/ 18, 20, 21, /24, 25 ........кратны 3 = 0,3,6,9,12,15,18,21,24
        //                                                  ..............5,10,20,25

        for (int i = 0; i < 26; i ++){
            if (i % 3 == 0){
                System.out.print(i + ", ");
            }else if (i % 5 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");

        Myprint();
        //Task 16

        //Написать метод, который принимает параметры n, m, , и печатает последовательность нечетных чисел
        // начиная с числа n, с шагом m,  длина последовательности  .

        printTask16(4,1,4);

        //printTask16Ex2(4,1,10); не работает


        Myprint();
        //Task 17
        //Сгенерируйте и распечатайте последовательность по формуле:
        //n + 1 = n + 2

        printTask17(1);


        print18(1, 5);




























    }





}
