
public class overloading {
    static void calci(int a,int b){
        System.out.println(a+b);
    }
     static void calci(double a,double b){
        System.out.println(a*b);
}
     static int calci(int a,int b,int c){
       return (a+b)/c;
}
     
public static void main(String[] args){
    calci(4,8);
    calci(10.9,9.0);
    System.out.println(calci(7,9,13));
}}
