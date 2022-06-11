package homework;

public class HW5ReturnMethods<da> {

    static int expectedResult;
    static int actualResult;
    static double t1 = 33.17;
    static double t2 = 35.16;
    static double t3 = 35.15;
    static double t4 = 36.0;
    static double t5 = 36.3;
    static int qq = 1;
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String YELLOW_BACKGROUND = "\033[43m";
    public static final String YELLOW_UNDERLINED = "\033[4;33m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void Myprint() {

        System.out.println(ANSI_PURPLE + "____________");
        System.out.println(ANSI_PURPLE + "Task " + qq);
        System.out.println(ANSI_PURPLE + "____________");
        qq++;
        System.out.println(ANSI_RESET);

    }

    //TASK 1
    // 1
    public static void verifyEquals(String expectedResult, String actualResult) {

        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "True" + ANSI_RESET);
        } else {
            System.out.println("\u001B[31m" + "False" + ANSI_RESET);
        }
    }

    // 2
    public static void verifyEquals(int expectedResult, int actualResult) {

        if (expectedResult == actualResult) {
            System.out.println(ANSI_GREEN + "True" + ANSI_RESET);

        } else {
            System.out.println(ANSI_RED + "False" + ANSI_RESET);
        }

    }

    public static void verifyEquals(double expectedResult, double actualResult) {

        if (expectedResult == actualResult) {
            System.out.println(ANSI_GREEN + "True" + ANSI_RESET);

        } else {
            System.out.println(ANSI_RED + "False" + ANSI_RESET);
        }

    }

    //3
    public static void verifyEquals(String expectedResult, int actualResult) {

        if (expectedResult.equals(actualResult)) {
            System.out.println(ANSI_GREEN + "True" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "False" + ANSI_RESET);
        }
    }


    // TASK 2
    // 1 example
    public static String returnDay(int num) {

        String dayName = " Incorect";

        if (num <= 0 && num > 7) {

            return dayName;
        } else if (num == 1) {
            dayName = "Monday";
        } else if (num == 2) {
            dayName = "Thusday";
        } else if (num == 3) {
            dayName = "Wednasday";
        } else if (num == 4) {
            dayName = "Thursday";
        } else if (num == 5) {
            dayName = "Friday";
        } else if (num == 6) {
            dayName = "Suturday";
        } else if (num == 7) {
            dayName = "Sunday";
        }
        return dayName;
    }

    // TASK 2
    // 2 example
    public static String returnDay2(int num) {

        if (num <= 0 && num > 7) {

        }
        if (num == 1) {

            return "Monday";
        }
        if (num == 2) {

            return "Thusday";
        }
        if (num == 3) {

            return "Wednasday";
        }
        if (num == 4) {

            return "Thursday";
        }
        if (num == 5) {

            return "Friday";
        }
        if (num == 6) {

            return "Suturday";
        }
        if (num == 7) {

            return "Sunday";

        }
        return "Wrong date";
    }

    // TASK 3
    public static int largestValue(int x, int y, int z) {

        int largest;

        if (x > y) {
            largest = x;
        } else {
            largest = y;
        }
        if (largest > z) {

            return largest;
        } else {
            largest = z;

            return largest;
        }
    }

    // TASK 3
    //Math method
    public static int largestValueMathMethod(int x, int y, int z) {

        int largestXY = Math.max(x, y);
        int large = (Math.max(largestXY, z));

        return large;
    }

    // TASK 4

    public static int smallestValue(int a, int b, int c) {

        int smallestValue;

        if (a < b) {
            smallestValue = a;
        } else {
            smallestValue = b;
        }
        if (smallestValue < c) {

            return smallestValue;
        } else {
            smallestValue = c;

            return smallestValue;
        }
    }

    //TASK 5
    //1 example
    public static void average() {

        double maxCatTemp = 40.55;
        double minCatTemp = 35.15;
        double average = (t1 + t2 + t3 + t4 + t5) / 5;


        if (t1 >= minCatTemp && t1 <= maxCatTemp) {
        }
        if (t2 >= minCatTemp && t2 <= maxCatTemp) {
        }
        if (t3 >= minCatTemp && t3 <= maxCatTemp) {
        }
        if (t4 >= minCatTemp && t4 <= maxCatTemp) {

        }
        if (t5 >= minCatTemp && t5 <= maxCatTemp) {

            System.out.println(Math.round(average));
        } else {
            System.out.println("Eror");
        }
    }

    // TASK 5
    // 2 example

    public static String averageCatTemp(double t1, double t2, double t3, double t4, double t5) {


        double maxCatTemp = 40.55d;
        double minCatTemp = 35.15d;
        String tempa = " ";


        if ((t1 >= minCatTemp) && (t1 <= maxCatTemp) && (t2 >= minCatTemp)
                && (t2 <= maxCatTemp) && (t3 >= minCatTemp) && (t3 <= maxCatTemp)
                && (t4 >= minCatTemp) && (t4 <= maxCatTemp) && (t5 >= minCatTemp) && (t5 <= maxCatTemp)) {
            double average = (t1 + t2 + t3 + t4 + t5) / 5;
            tempa = String.valueOf(average);
            System.out.println(tempa);
        } else {
            System.out.println("you are wrong");
        }
        return tempa;
    }

    // TASK 6
    //Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.

    public static String Money(double nomer) {

        if (nomer > 1) {
            int rub = (int) nomer;
            String b = Integer.toString(rub);
            double kop = (nomer - rub) * 100;
            int kop1 = (int) kop;
            String c = Integer.toString(kop1);
            return (b + " руб " + c + " копеек");
        } else {
            return "Incorrect value";
        }
    }

    // TASK 7
    //Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
    // 1 ex.
    public static String Kilograms(double n) {

        if (n > 0) {
            int kg = (int) n;//10
            String kg1 = Integer.toString(kg);//"10"
            double gr = (n - kg) * 100; // 10.75-10= 75.0
            int gr1 = (int) gr;
            String gram = Integer.toString(gr1);
            return (kg1 + "кг" + gram + "гр");
        } else {
            return "Incorrect value";
        }
    }

    // 2 ex.
    public static String Kilo(double n) {

        return (int) n + "кг" + Math.round((n - (int) n) * 1000) + "гр";

    }

    // TASK 8
    //Написать метод, который принимает на вход 2 параметра -  цену и количество товара
    // (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.

    public static Double Product(double amount, double price) {

        double rub = amount * price;
        return rub;
    }

   // TASK 9/ Написать метод, который принимает на вход необходимые параметры, и печатает чек.Для КГ.

    public static String Check(String product1, double amount1, double price1) {  //2 кг, 10 руб

        String result1;
        //double payResult = Double.parseDouble(Product( amount1, price1));  // 20.0
        //String finelPayResult = Money(payResult); //"20.0"
        result1 = product1 + "                         " + "\n" +
                "Цена за 1 кг" + Money(price1) +
                "\n" + "Количество товара" + Kilograms(amount1) + "\n" +
                "______________________________________" + "\n" +
                "Сумма к оплате" + Money(Product( amount1, price1));
        System.out.println(result1);
                return result1;

    }


// TASK 10. Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
// и возвращает заработную плату в месяц.

    public static String MonthPaidSalary(double dailyhours, double hourlyrate) {

        int workingdaysinmonth = 24;
        double monthsalary =dailyhours * hourlyrate * workingdaysinmonth; //5385.6
        int monthsalary1 = (int) (dailyhours * hourlyrate * workingdaysinmonth); //5385
        int coins = (int) ((monthsalary - monthsalary1) * 100); // 60
        String salaryMonth = String.valueOf(monthsalary1);
        String salarycoins = String.valueOf(coins);
        //System.out.println(salaryMonth + " рублей " + salarycoins + " копеек");
        return (salaryMonth + " рублей " + salarycoins + " копеек");
    }


        //TASK 11. Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи
        // зарплаты сотрудникам.

    public static String BillOfSalary(double hours, double rate, String name){

        return name + "                " + MonthPaidSalary( hours, rate);

    }




    //TASK 12

    public static String Shema(int xx){

        if (xx < 0){
            return xx + " is negative";
        }else if (xx > 0) {
           return xx + " is positive";
        }else {
            return xx + "is zero";
        }
    }

    //TASK 13

    public static String luckyNumber(int year){ //1981

        if (year > 0 && year <= 9999){
            int first = year /1000 % 10; // 1
            int second = year / 100 %10; //9
            int third = year / 10 % 10; //8
            int fourt = year / 1000 %10; //1
            int sum = first + second + third + fourt; // 1+9+8+1=19
            if (sum <= 9){
                return sum + " is lucky";
            }else{
                int sumFirst = sum % 10; //9
                int sumSecond = sum / 10 % 10; //1
                int sum2 = sumFirst + sumSecond; //10
                if (sum2 <= 9) {
                    //System.out.println(sum % 10);
                    return sum2 + " is lucky";
                }else{
                    int sum2First = sum2 % 10; //0
                    int sum2Second = sum2 / 10 % 10; //1
                    int sum3 = sum2First + sum2Second; //0+1=1
                        return sum3 + " is lucky";
                }
            }
        }return "Eror";
    }

    //TASK 14
    //а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
    //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
    //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

    public static String luckyNumber(int x, int y, int z){

        int sumOfThree = (x + y + z);
        int average = sumOfThree / 3;
        int median = sumOfThree - largestValueMathMethod(x, y, z) - smallestValue( x, y, z);
        int raznitsa = average - median;
        if (raznitsa > 2){
            return "Среднее значение " + average + " отличается от медианы " + median + " на" + raznitsa;
        }else{
            return "Среднее значение = " + average + " , медиана = " + median;
        }
    }

    //TASK 15
    //1 ex
    //Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
    // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки,
    // например “10 руб 00 коп”.

    public static String Oplata(double m){

    int oplata = (int) Math.floor(m); //10.0
    String oplata2 = oplata + " руб " + (oplata / 100) + "0" + " коп";
    return oplata2;

    }
    //TASK 15
    //2 ex

    public static String OplataNew(double m){
        String endResult;
        double mm = Math.floor(m); //10.0
        endResult = Money(mm);
           return endResult;
    }


    public static void main(String[] args) {

        Myprint();
        // TASK 1
        /**
         * 3 метода на проверку созданы выше
         */
        Myprint();
        // TASK 2

        System.out.println(returnDay2(1));

        verifyEquals("Monday",returnDay2(1));

        Myprint();
        // TASK 3

        int x = -100;
        int y = 99;
        int z = 0;

        System.out.println(largestValue(x, y, z));
        verifyEquals(largestValue(x, y, z),99 ); //проверка кода

        //Math
        System.out.println(largestValueMathMethod(x, y, z));
        verifyEquals(largestValueMathMethod(x, y, z), 99); //проверка кода

        Myprint();
        // TASK 4

        int a = -67;
        int b = 0;
        int c = -999999999;

        System.out.println(smallestValue(a, b, c));
        verifyEquals(smallestValue(a, b, c), -999999999 );//проверка кода

        Myprint();
        // TASK 5

        // 1 example
         average();

        //2 example
        double t1 = 35.17;
        double t2 = 35.16;
        double t3 = 35.15;
        double t4 = 36.0;
        double t5 = 36.3;
        averageCatTemp(t1, t2, t3, t4, t5);
        verifyEquals(averageCatTemp(t1, t2, t3, t4, t5), "35.556");

        Myprint();
        // TASK 6

        System.out.println(Money(10.75));
        verifyEquals("10руб75копеек", Money(10.75) );

        Myprint();
        // TASK 7

        // 1 ex
        System.out.println(Kilograms(10.75));
        verifyEquals("10кг75гр", Kilograms(10.75));

        //2 ex
        System.out.println(Kilo(10.75));
        verifyEquals("10кг750гр",Kilo(10.75));

        Myprint();
        // TASK 8

        System.out.println(Product(2, 10.0));
        verifyEquals(20.0, Product(2, 10.0) );

        Myprint();
        // TASK 9

        Check("Apple", 20.5, 130.5);

        Myprint();
// TASK 10/
        MonthPaidSalary(8.8 ,25.5);
        verifyEquals("5385 рублей 60 копеек" ,MonthPaidSalary(8.8,25.5));

        Myprint();
        // TASK 11

        String name = "Смирнова Мария Ивановна";
        double rate = 476.15;
        double hours = 15.10;

        System.out.println(BillOfSalary(rate,hours,name));
        verifyEquals(BillOfSalary(rate,hours,name),"Смирнова Мария Ивановна                172556 рублей 76 копеек" );


        Myprint();
        // TASK 12
        System.out.println(Shema(-1));
        verifyEquals(Shema(-1), "-1 is negative");

        Myprint();
        // TASK 13

        System.out.println(luckyNumber(1981));

        Myprint();
        // TASK 14

        System.out.println(luckyNumber(2, 3, 5));
        verifyEquals("Среднее значение = 3 , медиана = 3",luckyNumber(2, 3, 5));


        Myprint();
        // TASK 15
        System.out.println(Oplata(10.75));
        verifyEquals("10 руб 00 коп", Oplata(10.75));

        System.out.println(OplataNew(10.75));
        verifyEquals("10 руб 0 копеек", OplataNew(10.75));


    }
}





















