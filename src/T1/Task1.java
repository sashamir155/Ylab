package T1;
// так как задания не большие то делала их в одном классе

public class Task1 {
    public static void main(String[] args) {

/* 1	Объявите переменные name1, name2, name3 типа String.
Сразу же в строке объявления присвойте им какие-нибудь значения.
Значениями могут быть любые строки. */

        String name1 = "Tom";
        String name2 = "Pol";
        String name3 = "Roy";


// 2	Напиши программу, которая выводит на экран надпись: «Когда я вырасту, то хочу быть паровым экскаватором!» 10 раз.

        String str = "Когда я вырасту, то хочу быть паровым экскаватором!";
        for (int i=0; i<10; i++)
            System.out.println(str);

// 3	Раскоментируйте часть кода, чтобы на экран вывелось сообщение "Happy New Year"

        // String s = "Happy";
        // System.out.println("New Year");
        // System.out.println("Happy New");
        // System.out.println("Year");
         System.out.print("Happy New");
        // System.out.println("Year");
        // System.out.println(s);
        // System.out.print("Happy New!");
        System.out.print(" ");
        System.out.println("Year");
    }
}
