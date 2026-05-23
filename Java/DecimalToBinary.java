public class DecimalToBinary{
    public static void main(String[] args) {
        int n=12;
        int b=0;
        int i=1;
        while(n>0){
            b+=(n%2)*i;
            i*=10;
            n/=2;

        }
        System.out.println(b);
    }
}