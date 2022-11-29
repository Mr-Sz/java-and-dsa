import java.util.Scanner;

public class Palidrome1 {
    public static void main(String[] args) {
        System.out.print("enter number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp=n;
        int rev = 0;
        while (temp>0){
            int rem = temp %10;
            rev = rev*10+rem;
            temp = temp /10;
        }
        if (rev==n){
            System.out.println("its a palindrome");
        } else{
            System.out.println("its not a palindrome");
        }



    }
}
