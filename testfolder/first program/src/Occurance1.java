import java.util.Scanner;

public class Occurance1 {
    public static void main(String[] args) {
        long n=34553555543L;
        int count =0;
        while (n>0){
            long rem = n%10;
            if (rem == 5){
                count +=1;
            }
            n = n/10;
            }
        System.out.println(count);
    }
}
