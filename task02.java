
/*Вывести все простые числа от 1 до 1000 */

public class task02 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        for (int i = 3; i < 1001; i+=2) {
            boolean isSimple = true;
            for (int j = 3; j < i/2; j+=2) {
                if ((i%j == 0) && (i!=j)){
                    isSimple = false;
                    break;
                }                
            }
            if (isSimple){
                System.out.println(i);
            }
            
        }
    }
}
