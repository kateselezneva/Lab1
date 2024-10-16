import java.io.PrintStream;
import java.util.Scanner;
import java.io.IOException;
public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    public static void main(String[] args) throws IOException {
        // Считывание пяти натуральных чисел x, a, b, c, d из консоли
        int x = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        // Определяем, упадет ли 4-ая доминошка
        if (x>d)
            // Определяем, упадет ли 3-ая доминошка
            if (x>c)
                // Определяем, упадет ли 2-ая доминошка
                if (x>b)
                    // Определяем, упадет ли 1-ая доминошка
                    if (x>a)
                        // Упали все 5 доминошек, выводим 5
                        out.println(5);
                    else
                        // Упали 2-ая, 3-я, 4-ая и 5-ая доминошки, выводим 4
                        out.println(4);
                else
                    // Упали 3-я, 4-ая и 5-ая доминошки, выводим 3
                    out.println(3);
            else
                // Упали 4-ая и 5-ая доминошки, выводим 2
                out.println(2);
        else
            // Упала только 5-ая доминошка, выводим 1
            out.println(1);

    }
}
