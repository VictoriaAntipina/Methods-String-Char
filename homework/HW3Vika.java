package homework;

public class HW3Vika {

    public static void main (String [] args) {


        System.out.println("___task2");

        byte a = 120;
        byte b = 125;
        System.out.println("a = 120");
        System.out.println("b = 125");

        System.out.println("___task3");

        short s = 30000;
        short t = (short) (s - 60000);
        System.out.println(t);
        //или
        short s2 = Short.MAX_VALUE;
        short tt = Short.MAX_VALUE - 60000;
        System.out.println(tt);

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

        /// табл в задании 6 переписываем+в задании 7

        System.out.println("___task8");

        int x = 10;
        int y = 3;
        double result = (double) 10 / 3;
        System.out.println(result);
        //или
        System.out.println(10.0/3);
        //или
        System.out.println(10/3d);

        System.out.println("___task9");

        // float f = 102.101101f;
        // double d = 100.101101d;
        double sum = f+d;
        double product = f*d;
        double quotient = f/d;
        double remaider = f % d;

        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remaider);
        //или
        double sum2 = Double.sum(d,(double) f);
        System.out.println(sum2);
        //или
        double sum1 = Double.sum(f,d);
        System.out.println(sum1);

        int value1 = (int) f;
        int value2 = (int) d;
        System.out.println(Math.multiplyExact(value1,value2));

        System.out.println("___task11");

        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        float t4 = - 505.505f;
        int t5 = 100100;
        long t6 = 100010001000L;
        double t7 = 2.66666666666666d;
        double t8 = - 1000000.001;
        short t9 = 1010;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);

        System.out.println("___task12");

        String line = "__________________________________________";
        Byte byte1 = 8;
        Byte byte2 = Byte.MAX_VALUE;
        Byte byte3 = Byte.MIN_VALUE;

        Short short1= 16;
        Short short2 = Short.MAX_VALUE;
        Short short3 = Short.MIN_VALUE;

        Integer int1 = 16;
        Integer int2 = Integer.MAX_VALUE;
        Integer int3 = Integer.MIN_VALUE;

        Long long1 = 64L;
        Long long2 = Long.MAX_VALUE;
        Long long3 = Long.MIN_VALUE;

        Float float1 = 32f;
        Float float2 = Float.MAX_VALUE;
        Float float3 = Float.MIN_VALUE;

        Double double1 = 64d;
        Double double2 = Double.MAX_VALUE;
        Double double3 = Double.MIN_VALUE;

        System.out.println(line+line);
        System.out.println("| Type |  Size in bits" + "\t\t\t" + "|            min            |      max"
                        + "\t\t\t" +      "   |");
        System.out.println(line+line);
        System.out.println("|" + Byte.TYPE + "|" + "\t\t" + byte1 + "\t\t\t\t" + "|" + "\t\t\t"
                 + byte2 + "\t\t\t\t" + "|" + "\t\t" + byte3 + "\t\t" + "   |");
        System.out.println(line+line);
        System.out.println("|" + Short.TYPE + "|" + "\t\t" + short1 + "\t\t" + "\t\t" + "|" + "\t\t\t" + short2 + "\t\t" + "   |"
                + "\t\t" + short3 + "         |");
        System.out.println(line+line);
        System.out.println("|" + Integer.TYPE + "|" + "\t\t" + int1 + "\t\t" + "\t\t" + "|  " + "\t\t\t" + int2 + "\t" + "   |"
                + "\t" + int3 + "        |");
        System.out.println(line+line);
        System.out.println("|" + Long.TYPE + "|" + "\t\t" + long1 + "\t\t\t\t" + "|  " + long2 + "\t" + "   |" + "\t"
                + long3 + "|");
        System.out.println(line+line);
        System.out.println("|" + Float.TYPE + "|" + "\t\t" + float1 + "\t\t\t" + "|      " + float2 + "\t\t" + "   |" + "\t\t"
                + float3 + "\t" + "        |");
        System.out.println(line+line);
        System.out.println("|" + Double.TYPE + "|" + "\t\t" + double1 + "\t\t\t" + "| " + double2 + "\t" + "|" + "\t\t"
                + double3 + "\t" + "    |");
        System.out.println(line+line);

        System.out.println("___task13");

        Integer num1 = 50;
        Integer num2 = 50;
        num1.equals(num2);
        String z = "Если num1 ";
        String zz = " num2, то результат сравнения методом .equal = ";
        System.out.println(z + "равно" + zz + num1.equals(num2));

        num1 = 50;
        num2 = 10;
        num1.equals(num2);
        System.out.println(z + " не равно " + zz + num1.equals(num2));

        System.out.println("___task14a");
        System.out.println("___a");

        int number1 = 10;
        int number2 = 10;
        int resolt1 = Integer.compare(number1,number2);
        System.out.println("Если number1 = number2, то результат сравнения методом compare = " + resolt1);

        System.out.println("___b");

        number1 = 5;
        int resolt2 = Integer.compare(number1,number2);
        System.out.println("Если number1 < number2, то результат сравнения методом compare = " + resolt2);

        System.out.println("___c");

        number1 = 20;
        int resolt3 = Integer.compare(number1,number2);
        System.out.println("Если number1 > number2, то результат сравнения методом compare = " + resolt3);

        System.out.println("___task15");

        Float one = 234.9999F;
        one.intValue();
        System.out.println(one.intValue());

        System.out.println("___task16");

        Double two1 = 12345.12345d;
        Double two2 = 12345.12300d;
        Double sumOfTwo = Double.sum(two1,two2);
        System.out.println(sum2);

        System.out.println("___task17");

        Float n1 = 123.56F;
        Float n2 = 123.88F;
        n1.intValue();
        n2.intValue();
        System.out.println(Integer.sum(n1.intValue(),n2.intValue()));

        System.out.println("___task18");
        System.out.println("___a");

        short shot1 = 12000;
        short shot2 = 12300;
        System.out.println("12000 - 12300 = " + Short.compare(shot1,shot2));

        System.out.println("___b");

        shot1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compare(shot1,shot2));

        System.out.println("___task19");

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        System.out.println(doub1 - doub2);

        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));
        //или
        System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));

        System.out.println("___task20");

        Double temp = 37.3d;
        Double temp1 = temp/2;
        temp = 35.6d;
        Double temp2 = temp/2;
        Double average = Double.sum(temp1,temp2);
        System.out.println(Math.round(average));

        System.out.println("___task21");

        Number n = Long.MAX_VALUE;
        n = 10;
        n = 10.999999999;
        n.intValue();
        System.out.println("“Переменная n может принимать значения: \n" +
                " n = " + Long.MAX_VALUE + "\n" +
                " n = " + n.intValue() + "\n" +
                " n = " + n + "\n" +
                " Это возможно, потому что Number.class это родитель всех численных класов" +
                "\n");

        System.out.println("___task22");

        Integer numberInteger = 100;
        String numberInteger1 = numberInteger.toString();
        System.out.println(numberInteger1);
        System.out.println(numberInteger);
        System.out.println(numberInteger1.getClass());
        System.out.println(numberInteger.getClass());

        System.out.println("___task23");

        //“36.6 градусов по Цельсию  = … градусов по Фаренгейту”
        double gradusC = 36.6;
        double gradus = 1.8;
        double all = (gradusC*gradus) + 32;
        double kg = 2.205d;  //1 kg to ibs
        double kg1 = 50;
        double oneone = kg*kg1;
        double ibs = 0.454;
        double oneone1 = ibs*kg1;

        System.out.println("36.6 градусов по Цельсию  = " + all + " градусов по Фаренгейту");
        System.out.println("50 kilogram = " + oneone + "lbs,  50 lb = " + oneone1 + "kg");






































































    }











    }
