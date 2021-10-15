package T1;

public class Task3 {
    public static void main(String[] args) {
        /* 1.Переставьте строки так, чтобы получился текст "Nothing personal, it's just business."
*/
        String s = "Nothing";
        s = s + " ";
        s = s + "personal";
        s = s + ",";
        s = s + " ";
        s = s + "it's";
        s = s + " ";
        s = s + "just";
        s = s + " ";
        s = s + "business";
        s = s + ".";

        System.out.println(s);

        /* 2. Объявите недостающие переменные и закоментарьте те, которые нигде не используются.*/

        //String s = "15";
        int a = 5;
        //int z = 18;
        int d = 18;
        int c = a + d;
        String b = " better then ";
        System.out.println(a + b + c);

        // 3. Напиши программу, которая выводит на экран надпись: «Слава Роботам! Убить всех человеков!» 16 раз.

        for (int x=0; x < 16; x++) {
            System.out.println("Слава Роботам! Убить всех человеков!");
        }

    }
}
