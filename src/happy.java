
import java.util.Scanner;


public class happy {
    public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);
     System.out.print("enter a number:");
     int n=sc.nextInt();
     int temp=n;
     while(temp!=1&&temp!=4){
         int sum=0;
         while(temp>0){
             int digit=temp%10;
             sum+=digit*digit;
             temp/=10;
         }
         temp=sum;
     }
     if(temp==1)
         System.out.println(n+"is a HappyNumber");
     else
         System.out.println(n+"is not a HappyNumber");
             
  
    }
}
