import java.util.Scanner;

public class SubractTheProductAndSumOfDigits {
    public static void main(String[] args) {
        /*
            start
            input n
            product = 1, sum =0
            while n>0
                rem = n%10
                product *=rem
                sum +=rem
                n = n/10
            end
         */
        Scanner in = new Scanner(System.in);
        System.out.println("enter n:");
        int n = in.nextInt();
        int product=1, sum=0;
        while (n>0){
            int rem = n%10;
            product *= rem;
            sum += rem;
            n = n/10;
        }
        System.out.println(product - sum);
    }
}
