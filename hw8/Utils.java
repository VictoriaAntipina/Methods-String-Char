package hw8;

public class Utils {

    //import static utils. hw8.Utils.*;  - чтоб импортировать все методы с определенного класса

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    static int qq = 1;

    public static void line() {
        System.out.println("________________________________");
    }

    public static void lineLong() {
        System.out.println("____________________________________________________________");
    }


    public static void ln() {
        System.out.println();
    }


    public static void Myprint(int i) {

        System.out.println(ANSI_PURPLE + "____________");
        System.out.println(ANSI_PURPLE + "Task " + qq);
        System.out.println(ANSI_PURPLE + "____________");
        qq++;
        System.out.println(ANSI_RESET);

    }

    public static void printTask(int a){

        if (a > 0){
            System.out.println(ANSI_PURPLE + "____________");
            System.out.println(ANSI_PURPLE + "Task " + a);
            System.out.println(ANSI_PURPLE + "____________");
            qq++;
            System.out.println(ANSI_RESET);
        }
    }

    public static String verify(int a, int b) {
        if (a == b) {
            System.out.println("Pass");

            return "Pass";
        } else {
            System.out.println("Fail");

            return "Fail";
        }
    }


    public static String verify(double a, double b) {
        if (a == b) {
            System.out.println("Pass");

            return "Pass";
        } else {
            System.out.println("Fail");

            return "Fail";
        }
    }


    public static String verify(String string1, String string2) {
        if (string1.equals(string2)) {
            System.out.println("Pass");

            return "Pass";
        } else {
            System.out.println("Fail");

            return "Fail";
        }
    }

    public static void verifyEquals(String expectedResult, String actualResult) {

        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "True" + ANSI_RESET);
        } else {
            System.out.println("\u001B[31m" + "False" + ANSI_RESET);
        }
    }

    public static String returnStringLineOfValues(String[] array){

        String sentence = " ";
        for (int i = 0; i < array.length; i++){
            sentence = array[i] + " ";
        }


        return sentence;
    }












}
