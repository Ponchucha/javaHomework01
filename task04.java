import java.util.Scanner;

/*Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
под знаками вопроса - одинаковые цифра
Ввод: 2? + ?5 = 69
Вывод: 24 + 45 = 69 */

public class task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число, одну из цифр можно заменить знаком вопроса: "); // можно вводить число любой разрядности, но пока только с одним знаком вопроса в каждои
        String num01Str = input.next();
        System.out.println("Введите второе число, одну из цифр можно заменить знаком вопроса: ");
        String num02Str = input.next();
        System.out.println("Введите сумму, одну из цифр можно заменить знаком вопроса: "); // в сумме тоже можно заменить цифру знаком вопроса
        String sumStr = input.next();
        input.close();
        int ind01 = getIndex(num01Str);
        int ind02 = getIndex(num02Str);
        int indSum = getIndex(sumStr);
        int [] num01Arr = prepareNumber(num01Str);
        int [] num02Arr = prepareNumber(num02Str);
        int [] sumArr = prepareNumber(sumStr);
        
        boolean isSolved = false;
        int num01 = 0;
        int num02 = 0;
        int sum = 0;
        while (! isSolved){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(! isSolved){
                        for (int k = 0; k < 10; k++) {
                            num01Arr = TryGetElement(num01Arr, ind01, i);
                            num01 = GetArraySum(num01Arr);
                            num02Arr = TryGetElement(num02Arr, ind02, j);
                            num02 = GetArraySum(num02Arr);
                            sumArr = TryGetElement(sumArr, indSum, k);
                            sum = GetArraySum(sumArr); 
                            if (num01 + num02 == sum){
                                isSolved = true;
                                System.out.printf("%d + %d = %d\n", num01, num02, sum);
                                break;
                            } 
                        }
                    }
                    
                }
            }
            if(! isSolved){
                System.out.println("Решения нет");
                isSolved = true;
            }
            
        }
    }
    static int getIndex (String numStr){
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '?'){
                return i;
            }
        }
            return numStr.length(); // Если знака вопроса нет, возвращаем заведомо не существующий индекс
    }
    static int[] prepareNumber(String numStr){
        int len = numStr.length();
        int[] numIntArr = new int [len];
        for (int i = 0; i < len; i++) {
            if (numStr.charAt(i) != '?'){
                int digit = Character.digit(numStr.charAt(i), 10);
                numIntArr[i] = digit * (int) Math.pow(10, len - i - 1);
            }
        }
        return numIntArr;
    }

    static int GetArraySum (int[]arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static int [] TryGetElement (int[] arr, int index, int value){
        if (index != arr.length){
            arr[index] = value * ((int) Math.pow(10, (arr.length - index - 1)));
        }
        return arr;
    }
}
    
