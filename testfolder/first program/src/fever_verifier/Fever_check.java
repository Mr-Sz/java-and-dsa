package fever_verifier;
import java.util.Scanner;
public class Fever_check {
    public static void main(String[] args) {
        float fever_temp=37.5f; //in cel
        System.out.print("how much temp do you have? in Farenheit : ");
        Scanner in = new Scanner(System.in);
        float temp = in.nextInt();
        float temp_in_cel = (temp-32) * 0.55f;
        if (temp<fever_temp){
            System.out.println("You don't have a fever bru, take care");
        } else{
            System.out.println("You a fever bro!");
        }
        System.out.println("btw! your temp in celsius is:  " + temp_in_cel);


    }
}
