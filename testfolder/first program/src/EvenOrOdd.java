import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("enter num: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num%2==0){
            System.out.println("number is even!");
        } else {
            System.out.println("number is odd!");
        }

    }
}
