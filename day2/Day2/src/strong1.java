import java.util.Scanner;
public class strong1 {
    int factorial(int d){
        int fact=1;
        for(int i=1;i<=d;i++){
            fact=fact*i;
        }
            return fact;
    }
    boolean isStrong(int n){
            int temp=n;
            int sum=0;
            while(n!=0){
             int d=n%10;
             sum=sum+factorial(d);
             n=n/10;
            }
            if(sum==temp){
                return true;
                
                        
            }else{
                return false;
            }}
    public static void main(String args[]){
        strong1 ob=new strong1();
       Scanner ob1=new Scanner(System.in);
       System.out.println("enter a no");
       int n=ob1.nextInt();
       if(ob.isStrong(n)){
           System.out.println("strong no");
       }else{
           System.out.println("not");
       }
        
    }
       
        
    }

