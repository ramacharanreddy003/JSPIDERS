public class TribonacciSeriesWhile{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        while (true) { 
            int d=a+b+c;
            if(d>10) break;
            System.out.println(d);
            a=b;
            b=c;
            c=d;
        }
    }
}