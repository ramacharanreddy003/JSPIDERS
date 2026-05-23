public class Practice{
    // static int i;
    // static int j=5;
    // static int k;
    // static int h;
    //static int i=9;
    public static void main(String[] args){

        //System.out.println(Practice.i);

        // System.out.println(Practice.i);
        // System.out.println(Practice.j);
        //   System.out.println(Practice.h);
        // Practice p = new Practice();
        // System.out.println(p.i);
        // System.out.println(p.j);

        //variable swapping
        // int a=5;
        // int b=6;
        // System.out.println("Before swap a: "+a);
        // System.out.println("Before swap b: "+b);
        // int c=0;
        // c=b;
        // b=a;
        // a=c;
        // System.out.println("After swap a: "+a);
        // System.out.println("After swap b: "+b);

        // int a=6;
        // String res=(a>5) ? "Greater than 5":"Lessthan 5";
        // System.out.println(res);

        // int age=18;
        // String vote=(age>=18) ? "Eligible to vote":"Not eligible to vote";
        // System.out.println(vote);

        // int n=4;
        // String result=(n%2==0) ? "Even":"Odd";
        // System.out.println(result);

        //palindrome

        int n=121;
        int m=n;
        int rev=0;
        while(n>0){
            int r=n%10;
             rev=rev*10+r;
            n/=10;
        }
        if(m==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }


        
    }
}

