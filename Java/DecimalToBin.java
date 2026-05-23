public class DecimalToBin{
    public static void main(String[] args) {
       int n=101;
       int pow=1;
       int dec=0;
       while(n>0){
        dec +=n%10*pow;
        pow*=2;
        n/=10;
       }
       System.out.println(dec);
    }
}