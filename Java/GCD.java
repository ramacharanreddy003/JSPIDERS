public class GCD{
    public static void main(String[] args) {
        int a=6;
        int b=12;
        int gcd=1;
        int min=a<b?a:b;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                gcd=i;

            }
            //System.out.println(gcd);
        }
        System.out.println(gcd);
    }
}