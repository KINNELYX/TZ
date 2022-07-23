package Calculator;

public class Proverka {
    public static int status(String s1, String s2) {
        int sostoyanie = 0;
        String[] x = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] y = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals(s1) || x[i].equals(s2)) {
                sostoyanie = 1;
            }

        }
        for (int i = 0; i < y.length; i++) {
            if (y[i].equals(s1) || y[i].equals(s2)) {
                sostoyanie = 2;
            }
        }
        return sostoyanie;
    }

    public static void ArabskieCifri(String s1, String s2) {
        String[] x = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int sostoyanie1 = 0;
        int sostoyanie2 = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals(s1)) {
                sostoyanie1 = 1;
            }
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals(s2)) {
                sostoyanie2 = 1;
            }
        }
        int sostoyanie3 = sostoyanie1 + sostoyanie2;
        if (sostoyanie3 != 2) {
            System.out.println("Используются одновременно разные системы счисления");
            throw new IllegalArgumentException();
        }
    }

    public static void RimskieCifri(String s1, String s2) {
        String [] y = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int sostoyanie1 = 0;
        int sostoyanie2 = 0;
        for (int i = 0; i < y.length; i++) {
            if (y[i].equals(s1)) {
                sostoyanie1 = 1;
            }
        }
        for (int i = 0; i < y.length; i++) {
            if (y[i].equals(s2)) {
                sostoyanie2 = 1;
            }
        }
        int sostoyanie3 = sostoyanie1 + sostoyanie2;
        if (sostoyanie3 != 2) {
            System.out.println("Используются одновременно разные системы счисления");
            throw new IllegalArgumentException();
        }
    }
}

