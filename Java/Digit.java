import java.util.Scanner;
public class Digit{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=scn.nextInt();
        if(a>=0 && a<=9){
            System.out.println("Single digit");
        }else if(a>=9 && a<=99){
            System.out.println("Double digit");
        }else if(a>=99 && a<=999){
            System.out.println("Triple digit");
        }
    }
}