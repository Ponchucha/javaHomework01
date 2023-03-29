/*Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа -> */
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int number01 = in.nextInt();   
        System.out.println("Input operation: ");
        String operation = in.next();
        System.out.println("Input second number: ");
        int number02 = in.nextInt();
        int result = 0;
        switch (operation) {
            case "+":
                result = number01+number02;
                break;
            case "-":
                result = number01-number02;
                break;
            case "*":
                result = number01*number02;
                break;
            case "/":
                result = number01/number02;
                break;
        }      
        System.out.printf("%d %s %d = %d", number01, operation, number02, result);
        in.close();
    }
}
