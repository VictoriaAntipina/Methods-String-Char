package homework;

public class BottleOfBeer {

    // Песенка кодом http://www.99-bottles-of-beer.net/lyrics.html

    /*  String bottles = " bottles of beer";
        String bottle = " bottle of beer";
        String wall = " on the wall";
        String take = "Take one down and pass it around";
        String commaSpace = ", ";
        String dot = ".";
        String go = "Go to the store and buy some more";
        String noMoreC = "No more";
        String noMoreL = "no more";
        String ln = "\n";

    for(int i = 99; i > -1; i--) {
           if(i == 2) {
               System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
               System.out.println(take + commaSpace + (i - 1) + bottle + wall + dot + ln);
           } else if(i == 1) {
               System.out.println(i + bottle + wall + commaSpace + i + bottle + dot);
               System.out.println(take + commaSpace + noMoreL + bottles + wall + dot + ln);
           } else if(i == 0) {
               System.out.println(noMoreC + bottles + wall + commaSpace + noMoreL + bottles + dot);
               System.out.println(go + commaSpace + (i + 99) + bottles + wall + dot);
           } else {
               System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
               System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);
           }
       }
*/ //Сократить код с помощью методов

    static String bottles = " bottles of beer";
    static String bottle = " bottle of beer";
    static String wall = " on the wall";
    static String take = "Take one down and pass it around";
    static String commaSpace = ", ";
    static String dot = ".";
    static String go = "Go to the store and buy some more";
    static String noMoreC = "No more";
    static String noMoreL = "no more";
    static String ln = "\n";

    public static void Bottle(int i){
        if(i == 2) {
            System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
            System.out.println(take + commaSpace + (i - 1) + bottle + wall + dot + ln);
        } else {
             System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
             System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);
        }
    }

    public static void Bottle1(int i){
        if(i == 1) {
            System.out.println(i + bottle + wall + commaSpace + i + bottle + dot);
            System.out.println(take + commaSpace + noMoreL + bottles + wall + dot + ln);
        } else {
            System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
            System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);
        }
    }
// 1 ex of Void Method
    public static void Bottle2(int i){
        if(i == 0) {
            System.out.println(noMoreC + bottles + wall + commaSpace + noMoreL + bottles + dot);
            System.out.println(go + commaSpace + (i + 99) + bottles + wall + dot);
        }else {
             System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
             System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);
        }
    }
// 2 ex of Return Method
    public static String Bottle333(int i){

        if(i == 0){
            return noMoreC + bottles + wall + commaSpace + noMoreL + bottles + dot + "\n"
                    + go + commaSpace + (i + 99) + bottles + wall + dot;
        }else {
            return "Eror";
        }
    }


    public static void main(String[] args) {

        for(int i = 99; i > 2; i--) {
            System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
            System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);
        }
            Bottle(2);
            Bottle1(1);
            Bottle2(0);
            //System.out.println(Bottle333(0)); метод return
        }
    }


