// Done..
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        int number1 = Sc.nextInt();
        int number2 = Sc.nextInt();
        int number3 = Sc.nextInt();

        if (number1 > number2 && number1 > number3){
            System.out.println(number1);
        }
        else if (number2 > number1 && number2 > number3){
            System.out.println(number2);
        }
        else{
            System.out.println(number3);
        }

        Sc.close();
    }
}