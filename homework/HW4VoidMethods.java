package homework;

public class HW4VoidMethods {
    static int qq = 1;
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String YELLOW_BACKGROUND = "\033[43m";
    public static final String YELLOW_UNDERLINED = "\033[4;33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static double temperature1;
    public static int resultOf;
    public static double stepen;
    public static int ActualResult1;
    public static int ageOfPerson;


    public static void My18task(double gets, double getsi) {
        stepen = (int) Math.pow(gets, getsi);
        System.out.println(stepen);
    }

    public static void My20task(int expectedageOfPerson) {

        if (expectedageOfPerson == ageOfPerson) {
            System.out.println("pass");
        } else {
            System.out.println("false");
        }


    }

    /*

            if ((ageOfPerson >= 5) && (ageOfPerson < 19)) {
        System.out.println(" В школу можно идти");
    }
            if (ageOfPerson >= 16) {
        System.out.println("Машину можно водить ");
    }
            if (ageOfPerson >= 18) {
        System.out.println("Голосовать можно");
    }
            if (ageOfPerson < 0) {
        System.out.println("Такого возраста нет");
    } else {
        System.out.println("Ты совсем мал");
    }

*/

    public static void Myprint() {

        System.out.println(YELLOW_UNDERLINED + "____________");
        System.out.println(YELLOW_UNDERLINED + "Task " + qq);
        qq++;
        System.out.println(ANSI_RESET);

    }

    public static void Method1(int oneNum, int twoNum) {

        int devResult = oneNum / twoNum;
        int remainResult = oneNum % twoNum;
        System.out.println("Результат деления " + oneNum + " на " + twoNum + " = "
                + devResult + " , а остаток от деления = " + remainResult);
    }

    //или еще 1 метод для задачи KLM
    public static void MethodKLM(int firstNum, int secondNum, String letter1, String letter2) {

        int resultOfdiv = firstNum / secondNum;
        int resultOfrem = firstNum % secondNum;

        System.out.println("Результат деления " + letter1 + " на " + letter2 + " = "
                + resultOfdiv + " , а остаток от деления = " + resultOfrem);

    }

    //1. яблока / учеников = резалт
    //2. остаток от деления
    public static void MethodApple(int apple, int student) {
        resultOf = apple / student;
        int resultOfremain = apple % student;
        System.out.println("Если " + apple + " яблока поделить на " + student + " учеников, то каждый ученик получит по "
                + resultOf + " яблок(a),и " + resultOfremain + " яблок(а) останется учителю.");
    }

    //apple = 42, 55, 1
    //student = 42, 5, 2
    //public static void Method2();{
    //String a1 = "o";
    //String a2 = "a";
    //String a3 = " ";

    //}
    public static String decApples(int appleCount) {
        int appleLastNumber = appleCount % 10; // Находим на какое число заканчивается наше число
        String apples = ""; //Пустая строка для записи
        boolean appleExclusion = (appleCount % 100 >= 11) && (appleCount % 100 <= 14); // Переменна для исключений между 11 и 14
        if (appleLastNumber == 1) { // Если окончание 1: одно яблоко
            apples = "яблоко";
        } else if (appleLastNumber == 0 || appleLastNumber >= 5) {// Если окончание 0 или больше или равно 5: ноль яблок, пять яблок
            apples = "яблок";
        } else if (appleLastNumber >= 2) { // Если окончание от 2 до 5 ти: два яблока, три яблока
            apples = "яблока";
        }
        if (appleExclusion) { // Если исключение: 11 яблок, 12 яблок, 13 яблок, 14 яблок.
            apples = "яблок";
        }
        return apples;
    }

    public static String decStudents(int studentCount) {
        int studentLastNumber = studentCount % 10;
        boolean studentExclusion = (studentCount % 100 >= 11) && (studentCount % 100 <= 14);
        String students = "";
        if (studentLastNumber == 1) {
            students = "ученика";
        } else if (studentLastNumber == 0 || studentLastNumber >= 5) {
            students = "учеников";
        } else if (studentLastNumber >= 2) {
            students = "ученика";
        }
        if (studentExclusion) {
            students = "учеников";
        }
        return students;
    }

    public static void countApples(int numOfApples, int numOfStudents) {
        System.out.println("Если " + numOfApples + " " + decApples(numOfApples) + " поделить на " + numOfStudents + " "
                + decStudents(numOfStudents) + ", то каждый ученик получит " + (numOfApples / numOfStudents) + " "
                + decApples(numOfApples / numOfStudents) + ", и " + (numOfApples % numOfStudents) + " "
                + decApples(numOfApples % numOfStudents) + " останется учителю.");
    }


    //Напишите метод, который примет на вход параметр температуры в Цельсиях,
    // и распечатает результат температуры в Цельсиях и в Фаренгейтах.
    public static void Tempreture(double all) {

        temperature1 = all * 1.8 + 32;
        System.out.println("результат температуры в Цельсиях = " + all
                + " результат температуры в Фаренгейтах = " + temperature1);
    }

    public static void Method222(int ExpactedResult) {

        if (ExpactedResult == ActualResult1) {
            System.out.println("pass");
        } else {
            System.out.println("false");
        }


    }


    public static void main(String[] args) {

        System.out.println(BLUE_BACKGROUND + "Part 1");
        System.out.println(ANSI_RESET);
        Myprint();
        Myprint();

        Myprint();

        //1)(2 = 2) И (7 = 7);
        if (2 == 2 && 7 == 7) {
            System.out.println("1)true");
        } else {
            System.out.println("1)false");
        }

        //2) Не(15 < 3);
        if (!(15 < 3)) {
            System.out.println("2)" + true);
        } else {
            System.out.println("2)" + false);
        }

        String tree1 = "Сосна";
        String tree2 = "Дуб";
        String tree3 = "Вишня";
        String tree4 = "Клен";

        //3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
        if ((tree1 == tree2) || (tree3 == tree4)) {

            System.out.println("3)" + "\u001B[32m" + "true");
        } else {
            System.out.println("3)" + "\u001B[31m" + "false");
            System.out.println(ANSI_RESET);
        }

        //4) Не("Сосна" = "Дуб");
        if (!(tree1 == tree2)) {
            System.out.println("4)\u001B[32m" + "true");
            System.out.println(ANSI_RESET);
        } else {
            System.out.println("4)" + false);
            //System.out.println(ANSI_RESET);
        }

        //5)  (Не(15 < 3)) И (10 > 20);
        if ((!(15 < 3)) && (10 > 20)) {
            System.out.println("5)" + true);
        } else {
            System.out.println("5)" + false);
        }

        //6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");

        String eye = "видеть";
        int r = 2;
        int rr = 3;
        if ((eye == "видеть") && (r < rr)) {
            System.out.println("6)(\"Глаза даны, чтобы " + eye + "\") && (\"Под третьим этажом находится второй"
                    + " этаж\")");
        }

        //7) (6/2 = 3) ИЛИ (7*5 = 20)
        if ((6 / 2 == 3) || (7 * 5 == 20)) {
            System.out.println("7)" + true);
        } else {
            System.out.println("7)" + false);
        }

        Myprint();

        //1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
        if ((60 == 70) || (60 == 60)) {
            System.out.println("1)" + true);
        } else {
            System.out.println("1)" + false);
        }
        //или
        String constanta1 = "В минуте 60 секунд";
        String constanta2 = "Работающие часы показывают время";
        String statement1 = "В минуте 70 секунд";
        String statement2 = "Работающие часы показывают время";
        if ((constanta1 == statement1) || (constanta2 == statement2)) {
            System.out.println(true);
        }

        //2) !(28 > 7) И !(300/5 = 60);
        if ((!(28 > 7)) && (!(300 / 5 == 60))) {
            System.out.println("2)" + true);
        } else {
            System.out.println("2)" + false);
        }

        //3) ("Телевизор - электрический прибор") И ("Стекло - дерево");
        String tv = "Электроприбор";
        String electric = "Электроприбор";
        String glass = "Стекло";
        String wood = "Дерево";
        if ((tv == electric) && (glass == wood)) {
            System.out.println("3)" + true);
        } else {
            System.out.println("3)" + false);
        }

        //4) Не((300 < 100))  → ("Жажду можно утолить водой");
        if (!((300 < 100))) {
            System.out.println("4) Жажду можно утолить водой");


            //5) (75 < 81) → (88 = 88)
            if (75 < 81) {
                System.out.println("5) 88=88");
            }

            Myprint();

            ///а) Андрей старше Светы. Наташа старше Светы.
            int ageOfAndrew = 5;
            int ageOfSveta = 4;
            int ageOfNatasha = 7;

            if ((ageOfAndrew > ageOfSveta) && (ageOfNatasha > ageOfSveta)) {
                System.out.println("Андрей старше Светы. Наташа старше Светы.");
            } else {
                System.out.println(false);
            }

            ///б) На полке стоят учебники, а на столе лежат справочники.
            int books1 = 5;
            int books2 = 10;
            if (books1 > 1) {
                System.out.println("На полке стоят учебники,");
            }
            if (books2 > 1) {
                System.out.println("на столе лежат справочники");
            }

            ///в) БОльшая часть детей — девочки. Остальные - мальчики.
            int girl = 20;
            int children = 30;
            if (children / 2 < girl) {
                System.out.println("БОльшая часть детей — девочки. Остальные - мальчики.");
                int boy = (children - girl);
                System.out.println(boy);
                children = boy + girl;
                System.out.println(children);
            }

            Myprint();

            //“Водительские права можно получить, только когда исполнится 16 лет.”
            int n = 16;
            if ((n >= 16) && (n <= 120)) {
                System.out.println("Водительские права можно получить");
            } else {
                System.out.println("Водительские права получить нельзя");
            }

            Myprint();

            //”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
            //Петя не едет в автобусе = !(2>1)
            //читает книгу = (20>10)
            //не смотрит в окно = !(200>100)
            if ((!(2 > 1)) && (20 > 10) || (!(200 > 100))) {
                System.out.println("читает книгу");
            } else {
                System.out.println("не едет в автобусе и не смотрит в окно");
            }
            //или
            int petr = 2;
            if (petr == 1) {
                System.out.println(" Петя едет в автобусе");
            } else {
                System.out.println(" Петя не едет в автобусе");
            }
            if (petr > 1) {
                System.out.println("Петя читает книгу");
            }
            if (petr < 1) {
                System.out.println("Петя не смотрит в окно");
            }
            //или через boolen = true/false сравнивать

            boolean rideBus = false;
            boolean readBook = true;
            boolean window = false;
            System.out.println(rideBus && (readBook || window));

            Myprint();
            //“Если с другом ты, это хорошо, а когда наоборот - плохо”
            int friend = 1;
            if (friend >= 1) {
                System.out.println("хорошо");
            } else {
                System.out.println("плохо");
            }

            Myprint();
            //Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.

            int age = 17;
            if (age <= 0) {
                System.out.println("Нет такого возраста");
            }
            if ((age > 18) && (age < 120)) {
                System.out.println(ANSI_GREEN + "Если тебе больше 18 лет," + ANSI_RED + "то ты взрослый");
                System.out.println(ANSI_RESET);
            } else {
                System.out.println("Ты - ребенок.");
            }

            //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.

            boolean dryLand = true;

            if (dryLand == true) {
                System.out.println("Если земля сухая, значит, нет дождя.");
            } else {
                System.out.println("Если земля мокрая, то идет дождь.");
            }

            //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.

            if (dryLand == true) {
                System.out.println("Если земля сухая, значит, нет дождя.");
            } else if (dryLand != true) {
                System.out.println("Если земля мокрая, то идет дождь.");
            } else {
                System.out.println("Если земля мокрая, то идет снег.");
            }

            //Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
            int cloudsOnTheSky = 0;
            if (cloudsOnTheSky > 0) {
                System.out.println("Если на небе тучи, идет дождь");
            } else {
                System.out.println("идет “слепой” дождь.");
            }

            //Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
            // Иначе вчера был не четверг, а завтра - не воскресенье

            boolean SuturdayToday = !(true);
            boolean FridayToday = !(true);

            if (SuturdayToday == true) {
                System.out.println("Если сегодня суббота, значит, завтра воскресенье.");
            } else if (FridayToday == true) {
                System.out.println("Если сегодня пятница, значит, вчера был четверг.");
            } else {
                System.out.println("Иначе вчера был не четверг, а завтра - не воскресенье");
            }

            //Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.

            boolean part1 = true;
            if (part1 == true) {
                System.out.println("значит, прошла вечность");
            } else {
                System.out.println("ждите дальше");
            }

            //Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.

            int age1 = 18;
            String age2 = "закончил школу";

            if ((age1 < 18) || (age2 == "закончил школу")) {
                System.out.println("ты можешь не жить с родителями");
            } else {
                System.out.println("живи с родителями");
            }

            System.out.println(BLUE_BACKGROUND + "Part 2");
            System.out.println(ANSI_RESET);
            Myprint();
            //   #10______________________________________________________________________
            int num = 0;
            if (num % 2 == 0) {
                ActualResult1 = (num * 2);
            } else {
                ActualResult1 = num * num;
            }
            System.out.println(ActualResult1);

            Myprint();
            //  #11________________________________________________________________________
            //Голосовать можно с 18 лет
            //Машину можно водить с 16 лет
            //В школу можно идти с 5 лет

            ageOfPerson = -1;

            if ((ageOfPerson >= 5) && (ageOfPerson < 19)) {
                System.out.println(" В школу можно идти");
                if (ageOfPerson >= 16) {
                    System.out.println("Машину можно водить ");
                    if (ageOfPerson >= 18) {
                    }
                    System.out.println("Голосовать можно");
                }
            } else {
                System.out.println("Ты совсем мал");

                   /* if (ageOfPerson < 0) {
                            System.out.println("Такого возраста нет");
                        }
                        */

                Myprint();

                //5 - выдать похвальную грамоту и перевести в следующий класс
                //4 - перевести в следующий класс
                //3 - дать задание на лето и перевести в следующий класс
                //2 - вызвать родителей и оставить в текущем классе на второй год

                int grade = 2;

                if (grade == 5) {
                    System.out.println("выдать похвальную грамоту и перевести в следующий класс");
                } else if (grade == 4) {
                    System.out.println("перевести в следующий класс");
                } else if (grade == 3) {
                    System.out.println("дать задание на лето и перевести в следующий класс");
                } else if (grade == 2) {
                    System.out.println("вызвать родителей и оставить в текущем классе на второй год");
                }
                //ladder tipe

                Myprint();

                int x = -2;
                int y = 8;
                int xy;

                if (x % 3 == 0 && y % 3 == 0) {
                    System.out.println(x + y);
                } else if (x % 5 == 0 && y % 5 == 0) {
                    System.out.println(x - y);
                } else if (x % 2 == 0 && y % 2 == 0) {
                    if (x >= 0 && y >= 0) {
                        System.out.println(x * y);
                    } else {
                        System.out.println(x * y * (-1));
                    }
                } else {
                    System.out.println("Eror");
                }
                Myprint();

                //Результат деления k на m = …, а остаток от деления  = …
                //Результат деления l на m = …, а остаток от деления  = …
                //Результат деления m на k = …, а остаток от деления  = …

                int k = 5;
                int l = 10;
                int m = 15;
                Method1(k, l);
                Method1(k, m);
                Method1(l, m);
                Method1(l, k);
                Method1(m, k);
                Method1(m, l);

                //2 method
                MethodKLM(5, 10, "k", "l");


                Myprint();

                //Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a),
                // и … яблок(а) останется учителю.

                int apple = 40;
                int student = 6;
                MethodApple(apple, student);

                apple = 100;
                student = 21;
                MethodApple(apple, student);

                System.out.println(BLUE_BACKGROUND + "Part 3");
                System.out.println(ANSI_RESET);

                Myprint();

                //apple = 42, 55, 1
                //student = 42, 5, 2
                countApples(42, 42);
                countApples(55, 5);
                countApples(1, 2);

                Myprint();

                Tempreture(55.5);


                Myprint();
                My18task(3, 3);

                Myprint();
                //Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
                // Тестовые данные - 2, 5, 0.
                Method222(0);

                Myprint();
                //Напишите тест, который валидирует ваш код из задания №11.
                // Придумайте тестовые данные. Выведите результат проверки на печать.
                My20task(18);


            }
        }
    }    }