package homework;

public class HW2 {

    public static void main(String[] args) {

        int k = 5;
        int l = 10;
        int m = 15;
        int sumKLM = k + l+ m;
        int sumLKM = l + k + m;
        System.out.println(sumLKM);

        //m++ можно использовать в скобках как арифметическое число
        ///System.out.println(k + l + m++ + sumKLM--);


        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        /**
         * Задача 13 Вывести значение переменных в строку
         */
        System.out.println("__task 13");
        System.out.println("__вариант 1");

        System.out.println(k + " " + l + " " + m);

        //или \t - табуляция
        System.out.println("__вариант 2");

        System.out.print(k);
        System.out.print("\t");
        System.out.print(l);
        System.out.print("\t");
        System.out.print(m);
        System.out.print("\n");

        /**
         * Задача 14
         */
        System.out.println("__task 14");
        System.out.println(k + "," + l + "," + m);

        /**Задача 15
         */
        System.out.println("__task 15");
        System.out.println("__вариант 1");

        System.out.println("int k = " + k + ";");
        System.out.println("int l = " + l + ";");
        System.out.println("int m = " + m + ";");

        //или
        System.out.println("__вариант 2");

        System.out.println("int k = " + k + ";" + "\n" + "int l = " + l + ";" + "\n" + "int m = " + m + ";" + "\t");

        //или
        System.out.println("__вариант 3");

        System.out.println("int k = " + k + ";" + "\t" + "int l = " + l + ";" + "\t" + "int m = " + m + ";" + "\n");

        /** Задача 16
         */
        System.out.println ("__task 16");

        int sumKL = k + l;
        int mult = k * m;
        int differ = l - m;

        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k*m = " + mult);
        System.out.println("Разность переменных l и m = " + differ);


        /** Задача 17
         * переменные div и remain можно было не создавать, а применить только арифметическую функцию
         */
        System.out.println ("__task 17");

        int divKL = k / l;
        int remainKL = k % l;

        int divKM = k / m;
        int remainKM = k % m;

        int divLM = l / m;
        int remainLM = l % m;

        int divMK = m / k;
        int remainMK = m % k;

        int divLK = l / k;
        int remainLK = l % k;

        int divML = m / l;
        int remainML = m % l;
        String tekst1 = "Результат деления";
        String tekst2 = ", а остаток от деления = ";
        String tekst3 = "на";

        System.out.println(tekst1 + " k " + tekst3 + " l = " + divKL + tekst2 + remainKL);
        //или
        System.out.println("Результат деления k на m = " + (k/m) + ", а остаток от деления  = " + remainKM);
        System.out.println("Результат деления l на m = " + divLM + ", а остаток от деления  = " + remainLM);
        System.out.println("Результат деления m на k = " + divMK + ", а остаток от деления  = " + remainMK);

        //System.out.println("Он сказал \"Привет!\"");

        System.out.println("Результат деления l на k = " + divLK + ", а остаток от деления  = " + remainLK);
        System.out.println("Результат деления m на l = " + divML + ", а остаток от деления  = " + remainML);


        System.out.println ("__task 18");

        int apple = 40;
        int student = 6;
        int divAS = apple / student;
        int remainAS = apple % student;
             String text1 = "Если ";
             String text2 = " яблок поделить на ";
             String text3 = " учеников, то каждый ученик получит по ";
             String text4 = " яблок(a), и ";
             String text5 = " яблок(а) останется учителю.";

             System.out.println( text1 + apple + text2 + student
                + text3 + divAS + text4 + remainAS
                + text5 );

        //Можно не задавать новую переменную int apple1, а поменять значение переменной, текст задать в переменную

         apple = 100;
         student = 21;
         divAS = apple / student;
         remainAS = apple % student;

        System.out.println("Если " + apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + divAS + "яблок(a), и "
                + remainAS + " яблок(а) останется учителю.");

        System.out.println("__task 19");

        /**
         * вычисление суммы
         */

        m++;
        int m1 = m++;
        int sumKLMnew = sumKL + m1;
        System.out.println(sumKLMnew);
        System.out.println(sumKLM);

        sumKLM--;
        int sumKLM1 = sumKLM--;
        System.out.println(sumKLM1);
        System.out.println(sumKLMnew + sumKLM1);

        /**
         * вычисление разности
         */

        int dev = m1 - sumLKM;
        System.out.println(m1 - sumLKM);

        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + sumKLM1 + ", а разность m++ и  sumLKM = " + dev);

        System.out.println ("__task 20");

        System.out.println(48 % 8);

        if (48 % 8 == 0) {
            System.out.println("число четное");
        } else {
            System.out.println("число нечетное");
        }
        //или
        System.out.println("Если 48 % 8 = " + 48 % 8 + " то 48 кратно 8");

        if (8 % 2 == 0) {
            System.out.println("число четное");
        } else {
            System.out.println("число нечетное");
        }

        if (47 % 2 == 0) {
            System.out.println("число четное");
        } else {
            System.out.println("число нечетное");
        }

        if (49 % 2 == 0) {
            System.out.println("число четное");
        } else {
            System.out.println("число нечетное");
        }

        System.out.println ("__task 21");
        //x = 2,   y = 3,  a = k, b = l, c = m, d = y - x

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y-x;

        int task21 = ((x + 3) * (x + 3));
        System.out.println(task21);

        int task22 = (((3+4*x)/5) - (((10*(y-5))*(a+b+c))/x) + (9*((4/x)+((9+x)/y))));
        System.out.println(task22);


        //341

       //int task23 = (((5*x + 7*y) / (8*x + 10*y)) / ((3*x-y) / (x+y))) / (a+b+(c/d) + ((a+b)/(c+d))+a*b);
       // System.out.println(task23);
       //или
        int task23 = (((5 * x + 7 * y) / (8 * x + 10 * y)) * ((x + y) / (3 * x - y))) / (a + b + c / d
        + (a + b) / (c + d) + a * b);
         System.out.println(task23);

        System.out.println(" _____________________________");
        System.out.println("|  TASK   |      RESULTS      |");
        System.out.println("|_________|___________________|");
        System.out.println("|    21   |   " + task21 + "              |");
        System.out.println("|_________|___________________|");
        System.out.println("|    22   |   " + task22 + "             |");
        System.out.println("|_________|___________________|");
        System.out.println("|    23   |   " + task23 + "               |");
        System.out.println("|_________|___________________|");
    }
}
