  int a=5;
        int b=6;
        int c=a>b?a:b;
        while (true) { 
            if(c%a==0 &&  c%b==0){
                System.out.println(c);
                break;
            }
            c++;
        }