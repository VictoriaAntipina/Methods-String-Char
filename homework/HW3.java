package homework;

import java.math.BigDecimal;

public class HW3 {

    public static void main (String [] args) {


        System.out.println("___task2");

        byte a = 120;
        byte b = 125;
        System.out.println("a = 120");
        System.out.println("b = 125");

        System.out.println("___task3");

        // short s = 15000;
        //short t = -

        System.out.println("___task4");

        int imin = Integer.MIN_VALUE;
        int imax = Integer.MAX_VALUE;

        System.out.println(" _________________________");
        System.out.println("| int min   | " + imin + " |");
        System.out.println("|_________________________|");
        System.out.println("| int max   | " + imax + "  |");
        System.out.println("|_________________________|");

        System.out.println("___task5");

        long phoneNumber = 38098749985L;

        System.out.println("___task6");

        float f = 102.101101f;
        double d = 100.101101d;

        System.out.println(" ________________________");
        System.out.println("| " + f + " | значение f|");
        System.out.println("|________________________|");
        System.out.println("|" + d + "  | значение d|");
        System.out.println("|________________________|");

        System.out.println("___task7a");

        double d1 = 10.09999d;
        double d2 = 20.099999d;
        Double dd = Double.sum(d1, d2);
        System.out.println(dd);

        System.out.println("___task7b");

        float f1 = 10.09999f;
        float f2 = 20.099999f;
        Float ff = Float.sum(f1, f2);
        System.out.println(ff);

        /// табл

        System.out.println("___task8");

        int x = 10;
        int y = 3;
        double result = (double) 10 / 3;
        System.out.println(result);

        System.out.println("___task9");

        double sum = Double.sum(f, d);
        System.out.println(sum);


        int longf = (int) f;
        int longd = (int) d;

        double product = Math.multiplyFull(longf, longd);
        System.out.println(product);

        double fg = (double) f;
      /*  double f34 = 9.32d;
        double f35 = 5.22d;
*/
        BigDecimal fack1 = BigDecimal.valueOf(fg);
        BigDecimal fack2 = BigDecimal.valueOf(d);
        //BigDecimal fack3 = fack2.divide(fack1);
        System.out.println(fack1.divideToIntegralValue(fack2));

        System.out.println(fack1.remainder(fack2));


        System.out.println("___task10");

        String myhello = "HELLO";
        System.out.println(myhello.replace("HELLO", "....."));

        System.out.println("___task11_ Треба тіко роспічатать");

        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        float t4 = -505.505f;
        int t5 = 100100;
        long t6 = 100010001000L;
        double t7 = 2.66666666666666d;
        double t8 = -1000000.001d;
        short t9 = 1010;
        float t11 = 802.505f;


        System.out.println("___task12_ Я єбав цю табличку пічатать ");

        System.out.println("___task13");


        Integer num1 = 110;
        Integer num2 = 110;

        Integer num3 = 120; //для перевірки “Если num1 не равно num2, то результат сравнения методом .equal = …”


        System.out.println(num1.equals(num2));
        System.out.println(num1.equals(num3));


        System.out.println("___task14");

        int number1 = 111;
        int number2 = 11;

        System.out.println(Integer.compare(number1, number2));

        if (number1 < number2) {
            System.out.println("number1 меньше number2");
        } else if (number1 == number2) {
            System.out.println("number1 ровня number2");
        } else {
            System.out.println("number1 більше number2");

            System.out.println("___task15");

        float simlis = 234.9999f;
        int dios = (int) simlis;
        System.out.println(dios);

        System.out.println("___task16");

        System.out.println(Double.sum(t7,t8));

        System.out.println("___task17");

            Integer gg1 = (int) t4;
            Integer gg2 = (int) t11;

        System.out.println(Integer.sum(gg1,gg2));

        System.out.println("___task18");

        short short1 = 12000;
        short short2 = 12300;
       short short3 = 12500;
        System.out.println(Short.compare(short1,short2));

        System.out.println(Short.compare(short3,short2));

        System.out.println("___task19");

            String str1 = "123.56";
            String str2 = "123.55";
            Double doub1 = 123.56;
            Double doub2 = 123.55;

            System.out.println(Double.compare(doub1,doub2));


         //   System.out.println(Integer.valueOf(str1) - Integer.valueOf(str2));








        }

    }
    }

