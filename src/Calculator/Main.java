package Calculator;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static int result;
    public static String input;
    public static String number1;
    public static String number2;
    public static String operation;
    public static String n1;
    public static String n2;
    public static String n3;

    public static void main(String[] args) {
        System.out.print("Ввод --> ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        imputCheck(input);
        symbolChek(input);
        numbCheck(input);

        n1=number1;
        n2=number2;
        n3=operation;

        int sostoyanie = Proverka.status(n1, n2);
        if (sostoyanie == 1) {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            Proverka.ArabskieCifri(n1, n2);
            int resultat = Calculator.Calc(num1, num2, n3);
            System.out.print("Ответ: ");
            System.out.print(resultat);
        } else if (sostoyanie == 2) {

            int numb1 = RimskieArabskie.ArabskayaCifra1(n1);
            int numb2 = RimskieArabskie.ArabskayaCifra2(n2);
            Proverka.RimskieCifri(n1, n2);
            result = Calculator.Calc(numb1, numb2, n3);
            if (result < 1) {
                System.out.println("Обнаружено исключение");
                throw new IllegalArgumentException();
            }
            System.out.print("Ответ: ");
            System.out.println(Rimskie.Rim());
        } else {
            System.out.println("Обнаружено исключение");
            throw new IllegalArgumentException();
        }
    }

    public static void imputCheck(String x) {
        StringTokenizer tokenizer = new StringTokenizer(x, "1234567890XIV ");
        String[] y = new String[10];
        int i = 0;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            y[i] = token;
            i++;
        }
        String[] y1 = Arrays.copyOf(y, i);
        if (y1.length > 1) {
            System.out.println("Вы ввели неверное значение");
            throw new IllegalArgumentException();
        }
        if (y[0] == null) {
            System.out.println("Вы ввели неверное значение");
            throw new IllegalArgumentException();
        }
    }

    public static void symbolChek(String x) {
        StringTokenizer tokenizer = new StringTokenizer(x, "*/+- ");

        int i = 0;
        while (i < 2) {
            String token = tokenizer.nextToken();
            if (i < 1)
                number1 = token;
            else
                number2 = token;
            i++;
        }
    }

    public static void numbCheck(String x) {
        StringTokenizer tokenizer = new StringTokenizer(x, "1234567890XIV ");
        while (tokenizer.hasMoreTokens()) {
            operation = tokenizer.nextToken();
        }
    }
}



