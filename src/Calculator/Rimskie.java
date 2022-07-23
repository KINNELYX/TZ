package Calculator;

import static Calculator.Main.result;

public class Rimskie {
    public static String Rim() {
        int number = result;
        String v = converter(number);
        return v;
    }

    public static String romanPreobrazovanie(int chislo, String one, String five, String ten) {
        if (chislo >= 1)
        {
            if (chislo == 1) {
                return one;
            }
            else if (chislo == 2)
            {
                return one + one;
            }
            else if (chislo == 3)
            {
                return one + one + one;
            }
            else if (chislo == 4)
            {
                return one + five;
            }
            else if (chislo == 5)
            {
                return five;
            }
            else if (chislo == 6)
            {
                return five + one;
            }
            else if (chislo == 7)
            {
                return five + one + one;
            }
            else if (chislo == 8)
            {
                return five + one + one + one;
            }
            else if (chislo == 9)
            {
                return one + ten;
            }
        }
        return "";
    }

    public static String converter(int cifri) {
        String roman1 = romanPreobrazovanie(cifri % 10, "I", "V", "X");
        cifri /= 10;
        String roman2 = romanPreobrazovanie(cifri % 10, "X", "L", "C");
        cifri /= 10;
        String roman3 = romanPreobrazovanie(cifri % 10, "C", "D", "M");
        cifri /= 10;
        String roman4 = romanPreobrazovanie(cifri % 10, "M", "", "");

        String result = roman4 + roman3 + roman2 + roman1;
        return result;
    }
}
