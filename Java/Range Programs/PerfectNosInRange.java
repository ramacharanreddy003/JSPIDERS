import java.util.Scanner;
class PerfectNosInRange{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println(" ");
       int l=sn.nextInt();
       
       for(int n=1;n<=l;n++){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n+" Perfect number");
        }
       }
    }
}