package homework;


public class HW4test {

    static int number = 1;


    public static void printLine() {
        System.out.println("____________________");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void task() {

        printEmptyLine();
        printLine();
        System.out.println("Задача " + number++);

    }
    public static void main(String[] args) {
        task();
        task();
    }
}