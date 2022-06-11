package lessons.school;

public class Student {

     int grade = 5;
     String firstName = "Вова";
     String lastName = "Сидоров";
     int age = 10;

     int grade1 = 9;
     String firstName1 = "Маша";
     String lastName1 = "Семенова";
     int age1 = 14;
     String line = "___________________________________";

         public static void main (String [] args) {

            Student object1 = new Student();
            Student object2 = new Student();

            System.out.println(object1.line);
            System.out.println(object1.grade);
            System.out.println(object1.firstName);
            System.out.println(object1.lastName);
            System.out.println(object1.age);
            System.out.println(object1.line);
            System.out.println(object2.line);
            System.out.println(object2.grade1);
            System.out.println(object2.firstName1);
            System.out.println(object2.lastName1);
            System.out.println(object2.age1);
            System.out.println(object2.line);

         }
}










