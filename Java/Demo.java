public class Demo{
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}
class c{
    public static void m1(){
        System.out.println("main start");
        System.out.println("main ends");

    }
    public static void main(String[] args){
        System.out.println("Main start");
        c.m1();
        c.m1();

    }
}
class C{
    public static void m1(){
        System.out.println("m1 starts");
        C.m2();
        System.out.println("m1 ends");
    }
    public static void m2(){
        System.out.println("M2 starts");
        System.out.println("m2 ends");

    }
    public static void main(String[] args){
        C.m1();

        System.out.println("main ends");
    }
}


//calling method from another class
class D{
    public static void  m3(){
        System.out.println("M3 in D");
    }
}
class E{
    public static void main(String[] args){
        System.out.println("main starts");
        D.m3();
        System.out.println("main ends");
    }
}

