import java.beans.PropertyEditorManager;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num or press 0 to exit & find largest amongst input:");
        int finalInput=0;
        while (true){
            int n=in.nextInt();
            if (n!=0) {
                finalInput=(finalInput*10)+n;
            } else if (n==0){
                break;
            } else{
                System.out.println("invalid input");
            }
            }
        int max=0;
        while(finalInput>0){
            int rem = finalInput%10;
            if(rem>max){
                max=rem;
            }
            finalInput/=10;
        }
        System.out.println(max+" is the greater amongst the inputs");
        }
    }

