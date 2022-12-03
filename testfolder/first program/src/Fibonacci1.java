import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int a= 0;
        int b= 1;
        int sum = 0;
        while(sum<=n){
            System.out.print(sum+" ");
            a = b;
            b = sum;
            sum =a+b;
        }
    }
}
