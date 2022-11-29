import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("enter operand: * , -, +, /: ");
            char oper = in.next().trim().charAt(0);
            System.out.println("enter a:");
            int a = in.nextInt();
            System.out.println("enter b:");
            int b = in.nextInt();

            if (oper == '*'||oper == '/'||oper == '-'||oper == '+') {
                if (oper == '*'){
                    ans = a * b;
                }
                if (oper == '/'){
                    ans = a / b;
                }
                if (oper == '-'){
                    ans = a - b;
                }
                if (oper == '+'){
                    ans = a + b;
                }
            } else if (oper == 'x' || oper == 'X'){
                break;
            }else {
                System.out.println("invalid input");
            }
            System.out.println(ans +" is the ans");
        }

    }
}

 /*switch(oper){
                case ('-') -> sum = a - b;
                case ('+') -> sum = a + b;
                case ('*') -> sum = a * b;
                case ('/') -> {
                    if (b>0){
                        sum = a/b;
                    } else {
                        System.out.println("ZeroDivisionError");
                    }
                }
                case ('X') -> {
                    break;
                }
                default -> System.out.println("invalid input!");
            }
*/