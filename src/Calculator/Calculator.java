package Calculator;

import java.util.NoSuchElementException;

public class Calculator {
    public static int Calc (int a, int b, String op){
        int result = 0;
        if (a<=10 && b <=10 && a>0 && b >0){
            if (op.equals("/")){
                result = a/b;
            }
            else if (op.equals("*")) {
                result = a*b;
            }
            else if (op.equals("-")) {
                result = a-b;
            }
            else if (op.equals("+")) {
                result = a+b;
            }
        } else {
            System.out.println("sd");
            throw new NoSuchElementException();
        }
        return result;
    }
}
