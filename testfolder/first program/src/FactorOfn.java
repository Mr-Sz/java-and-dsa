import java.util.Scanner;

public class FactorOfn {
    public static void main(String[] args) {
        System.out.print("enter n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                System.out.println(i+" is a  factor");
            }
        }
    }
}
