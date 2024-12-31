import java.util.Scanner;

public class Question2 {
    static double calculateResultOfTwoNumbers (int number1, int number2, char operator){
        switch (operator){
            case '+':
                return number1+number2;
            case '-':
                return number1-number2;
            case '*':
                return number1*number2;
            case '/':
                if (number2 == 0){
                    return number1/number2;
                    // return double.POSITIVE_INFINITY;
                }

        }

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int number1 = Sc.nextInt();
        int number2 = Sc.nextInt();
        char operator = Sc.next().charAt(0);

        System.out.println(calculateResultOfTwoNumbers(number1, number2, operator));
        
        Sc.close();
    }
}