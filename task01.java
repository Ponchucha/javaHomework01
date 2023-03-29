/*Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 */
import java.util.Scanner;

/**
 * task01
 */
public class task01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();

        int triangle = 0;
        int factorial = 1;
        for (int i = 1; i < number+1; i++) {
            triangle += i;
            factorial *= i;
        }
        System.out.printf("Треугольное число равно %d \nФакториал равен %d", triangle,  factorial);
    }
}