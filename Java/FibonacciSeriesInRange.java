public class FibonacciSeriesInRange{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a+" "+b+" ");
        for(;;){
            int c=a+b;
            if(c>0)break;
            System.out.println(c);
            a=b;
            b=c;
            
        }       
    }
}