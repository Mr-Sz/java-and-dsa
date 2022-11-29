import java.util.Scanner;

public class Armstrong1 {
    public static void main(String[] args) {
        int a,b;
        Scanner in= new Scanner(System.in);
        System.out.println("enter num1: ");
        a = in.nextInt();
        System.out.println("enter num2: ");
        b = in.nextInt();

        for (int i=a; i<b; i++){
            int check, rem, sum=0;
            check =i;
            while (check!=0){
                rem = check%10;
                sum = sum + (rem * rem * rem);
                check = check/10;
            }
            if (sum == i){
                System.out.println(i+ " is a armstrong number");
            }
        }
    }
}
